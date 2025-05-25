package charter2;

// 상수 사용하기
// 프로그램 내부에서 반복적으로 사용하고, 변하지 않아야 하는 값을 상수로 선언하여 사용하면 좋음
public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; // 선언과 동시에 초기화
        final int MIN_NUM;

        MIN_NUM = 0; // 사용하기 전에 초기화. 초기화 하지 않으면 오류 발생

        System.out.println("MAX_NUM : " + MAX_NUM);
        System.out.println("MIN_NUM : " + MIN_NUM);

        // MAX_NUM = 1000; ---> 오류 발생. 상수는 값을 변경할 수 없음.

        // 1분 복습
        // MY_AGE 상수를 선언하고 출력하도록 코드를 완성해 보세요.
        final int MY_AGE = 22;                      // 상수 MY_AGE 를 선언하고 값 22 를 대입함.
        System.out.println("MY_AGE: " + MY_AGE);    // MY_AGE 값을 출력함
    }
}
