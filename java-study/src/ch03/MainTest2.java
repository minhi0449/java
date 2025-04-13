package ch03;

public class MainTest2 {
    public static void main(String[] args) {

        // 산술 연산자 연습
        int number1 = 5 + 3;
        int number2 = 5 - 2;
        int number3 = 5 * 3;
        // int number4 = 5 / 4; --> (결과값 : 1)
        // double number4 = 5 / 4.0;
        double number4 = 5 / (double) 4;
        int number5 = 5 % 3;

        System.out.println();
        System.out.println("number1 : " + number1);
        System.out.println("number2 : " + number2);
        System.out.println("number3 : " + number3);
        System.out.println("number4 : " + number4);
        System.out.println("number5 : " + number5);

        // 결과값이 실수로 나타내야 된다면 실수 + 정수 해야 정상적으로 결과값을 확인할 수 있다.

        // 문제 1
        // (12 + 3) / 3 값을 화면에 출력하시오. (단, 변수에 값을 저장 후 출력)
        int number6 = (12 + 3) / 3;
        System.out.println();
        System.out.println("number6 : " + number6);

        // 문제 2
        // (25 % 2) 결과 값을 변수를 사용하지 말고 바로 출력하기
        System.out.println();
        System.out.println("(25 % 2) = " + (25 % 2));

    }
}
