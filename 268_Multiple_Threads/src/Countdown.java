public class Countdown {

    private int i;
    private final String color = "";

    public void doCountdown() {

        synchronized (color) {
            for (i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + ": i= " + i + color);
            }
        }
    }
}
