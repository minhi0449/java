package ch03;

/*
    조건문이란?
    조건문은 프로그래밍에서 특정 조건을 평가하고, 그 결과에 따라 다른 실행 흐름을 따르도록 하는 구문입니다.
    즉, 조건문을 사용하면 주어진 조건이 참(true)일 때와 거짓(false)일 때 수행할 작업을 다르게 지정할 수 있습니다.

    [if문 문법]
    if(조건식){
        수행문; // 조건식이 '참' 인 경우에 (조건이 맞는 경우) 수행문이 수행됨
      }
    -> 조건식이 '참'이 아니면(조건에 맞지 않는 경우) 수행문이 수행되지 않음
 */

public class IfTest {
    // 메인 함수 (코드의 진입점)
    public static void main(String[] args) {

        // 조건문 (제어문) if
        // 주어진 조건에 따라서 실행이 다르게 이루어지도록 구현할 수 있다.
        // 만약 ... 이라면
        boolean flag = false; // 조건을 판단할 불리언 변수 선언, false

        if (flag) { // 만약 flag 가 true 면, 아래 코드 실행
            // 수행 구문;
            System.out.println("조건 식이 true 이면 실행됩니다."); // flag 가 true 일 때만 나오는 문장
        }

        System.out.println("코드가 여기까지 내려 옵니다."); // 무조건 실행되는 문장

        // 단독 if 구문은 -> 수행 구문 실행이 될 수도 있고, 안 될 수도 있다.
        // if 는 '필수'가 아니라 '선택'. 조건이 맞지 않으면 안 할 수도 있다.
        // 단독 if 문은 조건이 맞을 때만 실행됨. 조건이 false 면 건너뜀 !


    }
}
