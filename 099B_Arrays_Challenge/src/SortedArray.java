import java.util.Scanner;


public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        return numbers;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " contents " + numbers[i]);
        }
    }

    public static int[] sortIntegers(int[] numbers) {
        int[] orderedNumbers = numbers.clone();
        boolean exit = false;

        while (!exit) {
            exit = true;
            for (int i = 0; i < orderedNumbers.length - 1; i++) {
                if (orderedNumbers[i] < orderedNumbers[i + 1]) {
                    int temp = orderedNumbers[i];
                    orderedNumbers[i] = orderedNumbers[i + 1];
                    orderedNumbers[i + 1] = temp;
                    exit = false;
                }
            }
        }

        return orderedNumbers;
    }
}
