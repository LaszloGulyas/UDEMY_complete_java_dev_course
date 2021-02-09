public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from AnotherThread");

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            System.out.println("Another thread woke me up");
            return;
        }

        System.out.println("Three seconds have passed and I'm awake");
    }
}
