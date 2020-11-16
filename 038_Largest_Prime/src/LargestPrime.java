public class LargestPrime {

    public static int getLargestPrime(int number) {

        //input criteria
        if(number < 2) {
            return -1;
        }

        //declaration
        int divisor = 2;
        int largestPrimeFactor = -1;
        int divisor2;
        boolean isPrime;

        //program code
        while(divisor <= number) {
            if(number % divisor == 0) {

                //inner while: tests if selected factor is a prime
                isPrime = true;
                divisor2 = 2;
                while(divisor2 <= Math.sqrt(divisor)) {
                    if(divisor % divisor2 == 0) {
                        isPrime = false;
                        break;
                    }
                    divisor2++;
                }

                if(isPrime) {
                    largestPrimeFactor = divisor;
                }
            }
            divisor++;
        }

        return largestPrimeFactor;
    }
}
