import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        int[] myIntArray2 = new int[10];
//        char[] myCharArray = new char[20];
//
//        for(int i=0; i<10; i++) {
//            myIntArray2[i] = i*10;
//            System.out.println(myIntArray2[i]);
//        }
//
//        myCharArray[0] = 'H';
//        myCharArray[1] = 'e';
//        myCharArray[2] = 'l';
//        myCharArray[3] = 'l';
//        myCharArray[4] = 'o';
//
//        for(int i=0; i<myCharArray.length; i++) {
//            System.out.println(myCharArray[i]);
//        }
//
//        printArray(myCharArray);

        int[] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was: " + myIntegers[i]);
        }

        System.out.println("Average of typed values is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int getAverage(int[] array) {
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return sum/array.length;
    }

//    public static void printArray(char[] array) {
//        System.out.print("\n");
//
//        for(int i=0; i<array.length; i++) {
//            System.out.print(array[i]);
//        }
//    }


}
