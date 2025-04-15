package ch03;

/**
 * 논리 연산자 &&, ||, !
 * 비교 연산자 (<, <= ..)와 함께 많이 사용이 됩니다.
 * 연산의 결과가 true, false 로 반환된다.
 */

public class Operation5 {
    // 코드의 진입점
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        // 1. 논리 곱 (&&)
        //                  True   &&   True
        boolean result1 = (n1 > 0) && (n2 > 0);
        System.out.println();
        System.out.println("result 1 : " + result1);
        // result 1 : true

        //                  true   &&   false
        boolean result2 = (n1 > 0) && (n2 < 0);
        System.out.println("result 2 : " + result2);
        // result 2 : false


        // 2. 논리 합 ( || )

        //                  true   ||  false
        boolean result3 = (n1 > 0) || (n2 < 0);
        System.out.println("result 3 : " + result3);
        // result 3 : true

        //                  false  ||  false
        boolean result4 = (n1 < 0) || (n2 < 0);
        System.out.println("result 4 : " + result4);
        // result 4 : false

        // 3. 부정 ( ! )
        System.out.println("부정 연산 확인 (!result4) : " + !result4);

        // 로깅 --> 값 확인을 해 본다.
        System.out.println("실제 변수 값 확인 : " + result4);

    } // end of main
} // end of class
