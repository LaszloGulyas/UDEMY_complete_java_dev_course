public class FactorPrinter {

    public static void printFactors(int number) {

        if(number <1) {
            System.out.println("Invalid Value");
        }

        int divisor = 1;
        while(divisor <= number) {

            if(number % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
}
