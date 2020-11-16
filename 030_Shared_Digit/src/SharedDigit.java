public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if( !(firstNumber >=10 && firstNumber <=99 && secondNumber >=10 && secondNumber <=99)) {
            return false;
        }

        int compareDigit;
        int tempSecondNumber;
        while(firstNumber != 0) {

            compareDigit = firstNumber % 10;

            tempSecondNumber = secondNumber;
            while(tempSecondNumber != 0) {

                if(compareDigit == (tempSecondNumber % 10)) {
                    return true;
                }
                tempSecondNumber /= 10;

            }

            firstNumber /= 10;
        }

        return false;
    }
}
