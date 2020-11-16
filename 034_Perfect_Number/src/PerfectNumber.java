public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if(number <1) {
            return false;
        }

        int divisor = 1;
        int sumOfDivisors = 0;
        while(divisor < number) {

            if(number % divisor == 0) {
                sumOfDivisors += divisor;
            }

            divisor++;
        }

        if(sumOfDivisors == number) {
            return true;
        }
        return false;
    }
}
