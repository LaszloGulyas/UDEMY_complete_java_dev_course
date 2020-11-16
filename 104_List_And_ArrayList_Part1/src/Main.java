import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }


        groceryList.addGroceryItem("carrot");
        groceryList.addGroceryItem("pen");
        groceryList.addGroceryItem("washing powder");
        groceryList.addGroceryItem("meat");

        groceryList.printGroceryList();
        groceryList.modifyGroceryItem(3, "washing gel");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem(2);
        groceryList.printGroceryList();

        System.out.println(groceryList.findItem("carrot"));
    }

//    private static Scanner scanner = new Scanner(System.in);
//    private static int[] baseArray = new int[5];
//
//    public static void main(String[] args) {
//
//        System.out.println("Enter 5 inputs: ");
//        getInputs();
//        System.out.print("Entered numbers: ");
//        printArray();
//        resizeArray(8);
//        System.out.println("\n\nEnter 8 inputs: ");
//        getInputs();
//        System.out.print("Entered numbers: ");
//        printArray();
//    }
//
//    private static void getInputs() {
//        for(int i=0; i<baseArray.length; i++) {
//            baseArray[i] = scanner.nextInt();
//        }
//    }
//
//    private static void printArray() {
//        for(int i=0; i<baseArray.length; i++) {
//            System.out.print(baseArray[i] + " ");
//        }
//    }
//
//    private static void resizeArray(int newSize) {
//        int[] original = baseArray;
//        baseArray = new int[newSize];
//        for(int i=0; i<original.length; i++) {
//            baseArray[i] = original[i];
//        }
//    }
}
