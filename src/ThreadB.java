import java.time.Duration;

public class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다.");
                total += i;
                try {
                    Thread.sleep(Duration.ofMillis(500));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            notify();
        }
    }
}
