package ch02;

/*
    형 변환이란? (자료형에 형태를 변경하는 것)
    - 데이터 타입을 다른 데이터타입으로 변경하는 것
    두 가지 종류
    : 자동(암시적) 형 변환, 강제(명시적) 형 변환
 */

public class TypeConversion {
    public static void main(String[] args) {

        int intDataBox = 100;
        double doubleDataBox;
        doubleDataBox = intDataBox;
        System.out.println();
        System.out.println("intDataBox : " + intDataBox);
        System.out.println("doubleDataBox : " + doubleDataBox);
        // int 상자에서 double 상자로 값을 넣었더니 값의 형태가 변했다.
        // 중요 ✸! -> 작은 상자에서 큰 상자로 값을 넣는 것은 자연스럽게 이동이 된다.
        // 자동 형 변환

        System.out.println("============================================");

        // 강제 형 변환
        final double PI = 3.14159;
        // 문법적인 오류를 알려주는 녀석을 컴파일러 (컴파일 시점 오류)
        // int intBox = PI; // <-- 오류 발생
        // 컴파일러야 괜찮아 강제로 그냥 넣어 ! (수강평: ㅋㅋㅋㅋㅋㅋ 쌤.. 이게모에여..!)
        int intBox = (int) PI;
        System.out.println("PI ; " + PI);
        System.out.println("intBox : " + intBox);
        System.out.println("============================================");

        /*
            [정리]
            · 자동 형 변환은 작은 상자 -> 큰 상자로 자연스럽게 들어가 진다.
            · 강제 형 변환은 큰 상자 -> 작은 상자로 들어갈 때, 강제로 집어 넣는다.
            ⟶ 단, 데이터 손실이 발생할 수 있다.
         */
    }
}
