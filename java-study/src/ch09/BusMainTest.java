package ch09;

public class BusMainTest {
    public static void main(String[] args) {

        // 생성자를 사용하는 목적은
        // 강제성을 부여하기 위함이다.
        Bus b1 = new Bus(133, "시내버스", "미니");
        b1.showInfo();

        /*
            ✓ 정리
            • 기본 생성자 (컴파일러 자동 생성)
            • 사용자 정의 생성자
            • 생성자 여러개라면 : 생성자 오버로딩
            • 생성자 객체가 생성될 때, 가장 먼저 수행되는 코드이다.
         */

    }
}
