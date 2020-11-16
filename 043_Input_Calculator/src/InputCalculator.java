import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        boolean properInt;
        int sum = 0;
        long avg = 0L;
        int inputNumber;
        int counter = 0;

        while(true) {
            properInt = scanner.hasNextInt();

            if(properInt == false) {
                break;
            }

            inputNumber = scanner.nextInt();
            sum += inputNumber;
            counter++;
        }

        scanner.nextLine();

        if(counter != 0) {
            avg = Math.round((double)sum / (double)counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
