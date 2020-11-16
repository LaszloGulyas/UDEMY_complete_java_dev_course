public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        //bigCount: count of big flour bags; 5 kilos each
        //smallCount: count of small flour bags; 1 kilo each
        //goal: goal amount of kilos of flour needed to assemble a package

        if(bigCount <0 || smallCount <0 || goal <0) {
            return false;
        }

        if((bigCount * 5 + smallCount >= goal) && (goal % 5 <= smallCount )) {
            return true;
        }

        return false;
    }
}
