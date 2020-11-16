public class NumberToWords {

    public static void numberToWords(int number) {

        if(number <0) {
            System.out.println("Invalid Value");
        }

        String output = "";
        String finalOutput = "";
        int digit;
        int lengthOfOriginalNumber = getDigitCount(number);
        number = reverse(number);
        int lengthOfReverseNumber = getDigitCount(number);

        if(number == 0) {
            finalOutput = "Zero";
        }

        while(number != 0) {
            digit = number % 10;
            number /= 10;
            switch(digit) {
                case 0: output = "Zero"; break;
                case 1: output = "One"; break;
                case 2: output = "Two"; break;
                case 3: output = "Three"; break;
                case 4: output = "Four"; break;
                case 5: output = "Five"; break;
                case 6: output = "Six"; break;
                case 7: output = "Seven"; break;
                case 8: output = "Eight"; break;
                case 9: output = "Nine"; break;
            }

            finalOutput += output;
            finalOutput += " ";
        }

        int diff = lengthOfOriginalNumber - lengthOfReverseNumber;
        for(int i = 1; i <= diff; i++) {
            finalOutput += "Zero ";
        }

        System.out.println(finalOutput);
    }


    public static int reverse(int number) {
        int reversedNumber = 0;

        int i =getDigitCount(Math.abs(number));
        while(i>=1) {
            reversedNumber += number % 10 * Math.pow(10, i-1);
            number /= 10;
            i--;
        }

        return reversedNumber;
    }


    public static int getDigitCount(int number) {
        if(number <0) {
            return -1;
        }

        int numberOfDigits = 1;
        while(number >= 10) {
            numberOfDigits++;
            number /= 10;
        }
        return numberOfDigits;
    }
}