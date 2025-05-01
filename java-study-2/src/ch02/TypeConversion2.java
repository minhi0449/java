package ch02;

public class TypeConversion2 {
    public static void main(String[] args) {

        // 1. 자동 형 변환
        int apple = 5;
        double bigApple = apple; // 형 변환 --> 자동 형 변환이다.
        System.out.println();
        System.out.println("[자동 형 변환]");
        System.out.println("사과 개수 (int ⟶ double) : " + bigApple); // 출력 : 5.0

        // 2. 강제 형 변환
        double height = 170.5;
        // 컴파일러가 오류라고 알려주고 있다.
        // 강제 형 변환
        int shortHeight = (int)height;
        System.out.println("----------------------------------");
        System.out.println("[강제 형 변환]");
        System.out.println("정수 키 (double ⟶ int) : " + shortHeight); // 출력 : 170
        // 데이터 손실 --> 소수점을 그냥 버린다 (원래 값: 170.5 ⟶ 출력 : 170)

        // 3. 문자 --> 숫자 형 변환
        char myLetter = 'B';
        int myNumber = myLetter; // 자동 형 변환이라고 할 수 있다.
        System.out.println("----------------------------------");
        System.out.println("[문자 --> 숫자 형 변환]");
        System.out.println("myNumber (int) : " + myNumber); // 출력 : 66
        System.out.println("myLetter (char) : " + myLetter); // char 타입이기 때문에 B 문자형으로 출력됨

        // [정리] : 강제 형 변환 시 --> 데이터 손실이 발생할 수 있다.
        // byte : 1byte(8bit) ---> [][][][][][][][] --> 표현할 수 있는 정수 범위 127 표현 가능

        // 4. 숫자 --> 문자 형 변환
        int myNum = 67;
        char myChar = (char) myNum; // 강제 형 변환 했다.
        System.out.println("----------------------------------");
        System.out.println("[숫자 --> 문자 형 변환]");
        System.out.println("myChar (int ⟶ char) : " + myChar);

        System.out.println("==================================");
        // 데이터 검증
        System.out.println("[데이터 검증]");
        System.out.println("(char)67 : " + (char)67);

    }
}
