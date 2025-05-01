package ch02;

public class Constant {
    public static void main(String[] args) {

        // 상수의 선언과 동시에 초기화
        // 상수는 가능한 대문자를 사용하고 연결에 단어는 _ (언더바를 사용한다)
        final int MAX_NUM = 100;
        final int MIN_NUM; // 상수 선언, 메모리 int 형 크기의 공간에 MIN_NUM 이라고 선언
        MIN_NUM = 0; // 상수에 값을 초기화 하다.

        System.out.println("--------------------------");

        // MIN_NUM = 20; // 컴파일 시점에서부터 오류
        // 상수는 한 번 값을 넣으면(= 초기화) 변경할 수 없다.

        // 상수의 활용
        // 반지름 * 원주율 ---> 원의 면적을 계산할 수 있다.

        // 원주율 선언과 동시에 초기화
        final double PI = 3.14159;

        // 원의 반지름 리터럴 값 선언
        int radius = 5;

        // 원의 면적을 계산하는 식을 작성해 보자.
        // 식: 원주율 * 원의 반지름 * 반지름
        // 원의 면적 공식: π × r² (원주율 × 반지름의 제곱)
        double area = PI * radius * radius;
        System.out.println("원의 면적 : " + area);

        // [문제] 원의 둘레를 계산하시오. (반지름 그대로 활용)
        // 식 구성 : 2 * PI * 반지름
        // 원의 둘레 공식: 2 × π × r (2 × 원주율 × 반지름)
        // 즉, 2 × 3.14159 × 5 = 31.4159
        double area2 = 2 * PI * radius;
        System.out.println("원의 둘레 : " + area2);

        /*
            radius : 반지름을 의미하는 변수
            리터럴(Literal) : 소스코드에 직접 표현된 값(예:5)
            radius 는 상수가 아닌 변수이므로, 필요에 따라 값을 변경할 수 있음

         */


    } // end of main
} // end of class
