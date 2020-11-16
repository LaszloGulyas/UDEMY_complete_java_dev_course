public class PlayingCat {

        public static boolean isCatPlaying(boolean summer, int temperature) {
            if(temperature >= 25) {
                if(temperature <= 35) {
                    return true;
                } else if((summer == true) && (temperature <= 45)){
                    return true;
                }
            }

            return false;
        }
}
