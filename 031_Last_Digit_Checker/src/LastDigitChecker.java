public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if( !(isValid(first) && isValid(second) && isValid(third))) {
            return false;
        }

        int counter = 0;

        if(first % 10 == second % 10) {
            counter ++;
        }
        if(first % 10 == third % 10) {
            counter ++;
        }
        if(second % 10 == third % 10) {
            counter ++;
        }


        if(counter >= 1) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if(number >=10 && number <=1000) {
            return true;
        }

        return false;
    }

//    public static int hasSameLastDigit(int number1, int number2) {
//        if(number1 % 10 == number2 %10) {
//            return 1;
//        }
//
//        return 0;
//    }
}
