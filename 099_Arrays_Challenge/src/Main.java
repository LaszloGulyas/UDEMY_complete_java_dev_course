import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(4);
        printArray(myIntArray);
        sortIntegers(myIntArray);
        System.out.println("[SORTING]");
        printArray(myIntArray);
    }

    public static int[] getIntegers(int n) {
        System.out.println("Type in " + n + " integer numbers:\r");
        int[] myIntegers = new int[n];

        for(int i=0; i<n; i++) {
            myIntegers[i] = scanner.nextInt();
        }

        return myIntegers;
    }

    public static void printArray(int[] array) {
        System.out.print("Array elements: ");

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {


        int tempValue = 0;

        for(int j=0; j<array.length-1; j++) {
            int tempIndex = j;

            for(int i=j+1; i<array.length; i++) {
                if(array[tempIndex] < array[i]) {
                    tempIndex = i;
                }
            }

            tempValue = array[tempIndex];
            array[tempIndex] = array[j];
            array[j] = tempValue;
        }

        return array;
    }
}
