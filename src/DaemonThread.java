import java.time.Duration;

public class DaemonThread implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonThread());
        // 데몬 스레드는 주로 "주요 작업을 보조하는 부수적인 역할"에 적합
        // 로그를 기록하거나 모니터링 같은 작업을 백그라운드에서 돌리는데, 메인 작업이 끝나면 굳이 이걸 기다릴 필요 없을 때
        // 부수적인 작업이 끝없이 돌다가 프로그램 종료 후에도 남아 있으면 메모리나 CPU를 쓸데없이 잡아먹을 수 있는 경우
        // 스레드가 프로그램의 핵심 로직이 아니라 단순히 도와주는 역할일 때
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(Duration.ofMillis(3000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("메인 스레드가 종료됩니다.");
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 스레드 실행중");

            try {
                Thread.sleep(Duration.ofMillis(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
