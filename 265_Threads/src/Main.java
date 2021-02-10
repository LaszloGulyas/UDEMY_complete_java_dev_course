public class Main {

    public static void main(String[] args) {
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Runnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);
        runnableThread.start();

        Thread myOtherRunnable = new Thread(myRunnable) {
            @Override
            public void run() {
                System.out.println("Hello from OtherRunnableThread");
                try {
                    anotherThread.join(1000);
                    System.out.println("AnotherThread terminated, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println("I couldn't wait after all. I was interrupted");
                }
            }
        };
        myOtherRunnable.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from AnonymousThread");
            }
        }.start();

        System.out.println("Hello from the MainThread");
    }
}
