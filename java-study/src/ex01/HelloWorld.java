package ex01;

/*
    프로그래밍 세상과의 첫 인사
    화면에 문자열 Hello World 를 출력하기

    프로그래밍을 처음 배우는 사람들이 가장 먼저 만들어보는
    프로그램 중 하나는 'Hello World' 를 출력하는 프로그램입니다.
 */

public class HelloWorld {

    // <-- 주석, 한 줄 주석 (컴파일러가 무시하는 영역입니다.)
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println();
        // 출력 후 다음 줄로 넘어가는 역할을 합니다. (line feed)

        // 숫자 0 부터 9까지 하나식 출력해보기
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        // 우리는 일상생활에서 10진수 체계를 많이 사용하고 있다.
        // 10진수란 0 ~ 9 다음 숫자에 단위를 1 올리고 0부터 다시 시작하는 개념이다. 9 --> [10]

    } // end of main

} // end of class
