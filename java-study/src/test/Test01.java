package test;

/*
    변수 - 연습문제
    1. 데이터 10, 100, 100 을 변수 선언과 동시에 초기화를 하고 화면에 출력해 보세요.
    2. int ageBox 상자에 20을 담아 보세요.
    2-1. ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요.
    3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭 해보세요.

 */

public class Test01 {
    public static void main(String[] args) {
        // 1. 데이터 10, 100, 100 을 변수 선언과 동시에 초기화
        int data1 = 10;
        int data2 = 100;
        int data3 = 100;

        System.out.println("---------------------------------------------------");
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
        System.out.println("---------------------------------------------------");
        System.out.println();

        // 2. int ageBox 상자에 20을 담기
        int ageBox = 20;
        System.out.println("ageBox : " + ageBox);
        System.out.println("---------------------------------------------------");
        System.out.println();

        // 2-1. ageBox 상자의 값을 30으로 변경하고 기존에 담겨있던 데이터를 다른 곳으로 옮기기
        int oldAge = ageBox; // 기존 데이터를 저장하기 위한 변수
        ageBox = 30; // ageBox 상자의 값을 30으로 변경
        System.out.println("ageBox : " + ageBox);
        System.out.println("Old age in a different place : " + oldAge);
        System.out.println("---------------------------------------------------");
        System.out.println();

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        int a = 1;
        int b = 3;
        System.out.println("Before switching - a (변경 전 'a'의 값) : " + a);
        System.out.println("Before switching - b (변경 전 'b'의 값) : " + b);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");


        // 임시 변수를 사용하여 값을 교환
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After switching - a (변경 후 'a'의 값) : " + a);
        System.out.println("After switching - b (변경 후 'b'의 값) : " + b);
        System.out.println("---------------------------------------------------");

    }

}
