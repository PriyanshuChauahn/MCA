public class prog20 {
    private static volatile boolean running = true;
     public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread started.");
            while (running) {
             //simulating Work
            }
            System.out.println("Worker thread stopped.");   });
     worker.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread setting running = false");
        running = false;
    }
}

