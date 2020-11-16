import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputNumber();
        inputNumber();



//        SimpleCalculator calculator = new SimpleCalculator();
//
//        calculator.setFirstNumber(inputNumber());
//        calculator.setSecondNumber(inputNumber());
//
//        System.out.println("Sum of the entered numbers: " + calculator.getAdditionResult());

    }

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your input number:");

        double number;
        boolean validInput = false;

        while(true) {
            validInput = scanner.hasNextDouble();

            if (validInput) {
                number = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Incorrect number format (double), try again:");
            }

            scanner.nextLine();
        }

        System.out.println(number);
        scanner.close();
        return number;
    }
}
