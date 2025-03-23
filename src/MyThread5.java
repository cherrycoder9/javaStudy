import java.time.Duration;

public class MyThread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread5 : " + i);
            try {
                Thread.sleep(Duration.ofMillis(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
