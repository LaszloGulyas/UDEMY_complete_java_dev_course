import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many numbers do you want to compare?");
        int n = scanner.nextInt();
        if(n>0) {
            System.out.println("\nThe lowest entered number is : " +
                    findMin(readIntegers(n)));
        }
    }

    private static int[] readIntegers(int n) {
        int[] inputNumbers = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter number " + (i+1) + " : " );
            inputNumbers[i] = scanner.nextInt();
        }

        return inputNumbers;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
