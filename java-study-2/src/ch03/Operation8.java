package ch03;

/*
    빠른 평가 (Short circuit evaluation)

    : 빠른 평가는 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우,
      두 번째 조건을 평가하지 않는 자바의 특성입니다.

    · 논리 곱(&&)은 두 항의 결과가 모두 true 일 때만 결과가 true
     ⟶ 앞의 항의 결과가 false 이면 뒤 항의 결과를 평가하지 않음

    · 논리 합(||)은 두 항의 결과가 모두 false 일 때만 결과가 false
     ⟶ 앞의 항의 결과가 true 이면 뒤 항의 결과를 평가하지 않음
 */

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정할 경우
 * 두 번째 조건을 평가하지 않는 것
 */
public class Operation8 {
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리 합 (||) 에서 빠른 평가가 되는 식을 만들어 보자.
        // 빠른 평가란?
        // 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우, 두 번째 조건을 평가하지 않는다. !!
        // 논리 합 ---> 첫 번째 조건이 true 라면, 두번째, 세번째 확인 안 함.

        //                      15 > 10 (true) ||  2 < 10 (true)
        boolean result = ((number += 10) > 10) || ((index += 2) < 10);
        System.out.println("result : " + result);
        // 논리 합 ( || ) : 두 조건 중 하나라도 참이면 참을 반환

        // 우리는 대입 연산자를 사용했을 경우 ---> 변수를 접근해서 값을 변경 한다.
        System.out.println("number : " + number);
        System.out.println("index : " + index);

    }


}
