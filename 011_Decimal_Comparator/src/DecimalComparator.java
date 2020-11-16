public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        if(((int) (numOne * 1000)) == ((int) (numTwo * 1000))) {
            return true;
        } else {
            return false;
        }
    }
}
