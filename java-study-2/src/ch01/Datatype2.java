package ch01;

/*
    문자 데이터 타입 char / 자료형의 크기는 2byte;
 */

public class Datatype2 {
    // 코드의 진입점
    public static void main(String[] args) {

        // 자료형 중 --> 기본 자료형 ( char ) 확인
        // 문자를 저장하기 위한 변수를 선언할 때 사용할 수 있다.
        // char 타입에는 단 하나의 문자만을 저장할 수 있다.

        char charBox;
        charBox = 'A'; // 홑 따옴표를 사용해야 된다. (문법 규칙)
        System.out.println("charBox : " + charBox);
        // charBox = 'AB'; <-- 대입불가

        // 문자 자료형 : 선언과 동시에 초기화
        char alphabetA = 'A';
        char alphabetB = 'B';
        char alphabetC = '안';
        // char alphabetD = '안녕'; --> 오류

        System.out.println("alphabetC : "+ alphabetC);

        // 문자형 --> 2byte;
        // 인코딩 이란? 이진수를 문자형으로 바꾸는 과정을 말한다.
        // 디코딩 이란? 문자를 이진수로 바꾸는 과정을 말한다.

    } // end of main
} // end of class
