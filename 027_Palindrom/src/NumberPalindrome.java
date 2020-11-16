public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int tempNumber = number;
        int reversedNumber = 0;

        while(tempNumber != 0) {
            reversedNumber *= 10;
            reversedNumber += tempNumber % 10;
            tempNumber /= 10;
        }

        if(reversedNumber == number) {
            return true;
        }

        return false;
    }
}
