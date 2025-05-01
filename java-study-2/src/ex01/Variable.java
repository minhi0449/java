package ex01;

/*
    변수란? (Variable)
    변하는 수 (변할 수 있는 데이터)
    데이터(값)을 담을 수 있는 메모리 공간(상자)
 */

public class Variable {
    // 코드의 시작점 (메인함수)
    public static void main(String[] args) {

        // 변수를 활용하는 3가지 유형
        // int <-- 예약어
        // 1. 변수를 선언 / 2. 변수에 값을 대입 / 3. 변수에 접근해서 사용(이름이 필요)

        // 1. 변수 선언
        int ageBox; // 정수값을 담을 수 있는 상자를 선언
        int telBox; // 정수값을 담을 수 있는 상자를 선언

        // 2. 변수에 값을 대입
        ageBox = 30; // 상자에 값을 넣다 (초기화 하다) -> 어떤 상자에 접근해야 할지 이름이 필요하다.

        // 3.1 변수 사용
        System.out.println(ageBox);

        // 3.2 변수 사용
        ageBox = 40; // 변할 수 있는 수(데이터)
        System.out.println("-------------");
        System.out.println(ageBox);

    } // end of main
} // end of class
