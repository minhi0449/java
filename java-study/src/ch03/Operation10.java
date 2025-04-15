package ch03;

/*
    ✓ 삼항 연산자
    • 조건식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨
    • if (조건문)을 간단히 표현할 때 사용할 수 있음

    조건식 ? 결과1 : 결과2;
    기능 ⟶ 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택
    ex) int num = (5 > 3) ? 10 : 20;

 */
public class Operation10 {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;

        int max;
        // 참고 T --> 결과 1을 반환합니다.
        // 참고 F --> 결과 2를 반환합니다.

        //    100 > 500 (false)
        max = (n1 > n2) ? n1 : n2;
        System.out.println();
        System.out.println("max : " + max); // 결과2 반환
    }
}
