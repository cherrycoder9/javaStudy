import java.time.Duration;

public class MusicBox {
    public void playMusicA() {
        for (int i = 0; i < 10; i++) {
            System.out.println("신나는 음악");

            try {
                Thread.sleep(Duration.ofMillis(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void playMusicB() {
        for (int i = 0; i < 10; i++) {
            System.out.println("슬픈 음악");

            try {
                Thread.sleep(Duration.ofMillis(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            System.out.println("웅장한 음악");

            try {
                Thread.sleep(Duration.ofMillis(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
