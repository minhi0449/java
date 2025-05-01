package ch01;

public class DataType3 {
    // 코드의 진입점(메인함수)
    public static void main(String[] args) {

        // 기본 자료형 - 실수형 (1.0, 0.123)
        // float, double
        // 4byte 크기를 가진다.
        float floatBox1 = 0.5F; // float 는 F 라는 접미사를 사용해야 한다.
        float floatBox2 = 0.12f; // 소문자도 가능

        // 8byte 크기를 가진다.
        // 오른쪽에 값을 적을 때, 기본 실수에 연산의 단위는 double 이다.
        double doubleBox1 = 0.123;
        double doubleBox2 = 1.33;

        // 출력
        System.out.println();
        System.out.println("floatBox1 : " + floatBox1);
        System.out.println("floatBox2 : " + floatBox2);
        System.out.println();
        System.out.println("doubleBox1 : " + doubleBox1);
        System.out.println("doubleBox2 : " + doubleBox2);
        System.out.println();

        // 그런데 값을 콘손창에 출력할 때, 꼭 변수로 사용해야 할까?
        System.out.println(0.5);
        System.out.println(0.3F); // 접미사(suffix)를 표기

        /*
            [정리]

            1. 정수 (Integer) 연산 기본은 int
            · int x = 100; // 이건 그냥 int

            2. 실수 (Floating point) 연산 기본은 double
            (소수점 있는 수는 기본적으로 double 타입으로 처리)
            · double pi = 3.14 // 기본은 double

            3. 다른 타입을 쓰고 싶으면 '접미사'를 붙여서 명시해야 함
            float  3.14f  f를 붙이면 float 로 해석됨
            long   100L   L을 붙이면 long 으로 해석됨
            unsigned long long  1234ULL ULL 로 구체적 지정
            float 대신에 그냥 3.14 쓰면? double 로 처리됨 (암묵적 형변환 일어남)

            ex)
            float x = 3.14;  // 경고 발생할 수 있음. float 인데 double 을 대입하니까.
            float y = 3.14f; // OK. float 타입으로 명확히 지정.

            [요약]
            3.14 = double
            3.14f = float
            100 = int
            100L = long
            100UL = unsigned long
         */

    } // end of main
} // end of class
