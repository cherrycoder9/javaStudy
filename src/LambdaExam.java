public class LambdaExam {
    public static void main(String[] args) {
        // 람다식, 익명메서드
        // 한 번만 쓰고 버릴 코드가 필요할 때
        // 함수형 프로그래밍 스타일을 따를 때
        // 콜백이나 이벤트 처리에 사용할 때
        // 코드 가독성과 유지보수를 개선하고 싶을 때
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        }).start();
    }
}
