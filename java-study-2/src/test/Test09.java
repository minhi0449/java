package test;

public class Test09 {

    // 메인 함수
    public static void main(String[] args) {
        // 호출 연습

        // 1. 인사말 출력
        System.out.println();
        greet("길동");

        // 2. 제곱 계산하기 (하나의 정수를 입력 받아 그 수의 제곱을 반환하는 함수)
        int sum1 = square(10);
        System.out.println("sum1 (10 * 10) : " + sum1);

        // 3. 수의 부호 판별 (0 : zero, 1 : positive, -1: negative)
        String result1 = signOfNumber(-1);
        System.out.println("result1 (-1) : " + result1);

        // 4. 나이 확인 (18세 이상 확인 / 성인이면 true, 아니면 false)
        boolean isAdult = checkAdult(20);
        System.out.println("isAdult (20) : " + isAdult);

        // 5. 최대값 찾기 함수 (입력 받은 값 중 가장 큰 수)
        int max = findMax(100, 1000);
        int max2 = findMax(1000, 999);
        System.out.println("max (100, 1000 큰 수 비교) : " + max);
        System.out.println("max2 (1000, 999 큰 수 비교) : " + max2);


    } // end of main


    /*
        1. 인사말 출력하기

        - 함수 이름: `greet`
        - 입력: 이름(String)
        - 출력: 없음 (콘솔에 직접 출력)
        - 설명: 사용자의 이름을 입력받아 "안녕하세요, [이름]님!"이라고 콘솔에 출력하는 함수입니다.
     */

    public static void greet (String greet){
        System.out.println("안녕하세요 [ " + greet + " ] 님! ");
    }

    /*
        2. 제곱 계산하기

        - 함수 이름: `square`
        - 입력: 정수(int)
        - 출력: 입력된 수의 제곱(int)
        - 설명: 하나의 정수를 입력받아 그 수의 제곱을 반환하는 함수입니다.
     */

    static int square(int n1){
        return n1 * n1;
    }

    /*
        3. 수의 부호 판별

        ( 입력값이 0 —> “ZERO” , 1 —>  “positive” , - 1  → “negative”)

        - 함수 이름: `signOfNumber`
        - 입력: 정수(int)
        - 출력: 문자열(String) - "positive", "negative", "zero"
        - 설명: 입력받은 정수의 부호에 따라 "positive", "negative", "zero" 중 하나를 반환합니다.
     */

    static String signOfNumber(int value){
        if (value == 0){
            return "zero";
        } else if(value > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    /*
        4. 나이 확인

        - 함수 이름: `checkAdult`
        - 입력: 나이(int)
        - 출력: 성인 여부(Boolean)
        - 설명: 입력받은 나이가 18세 이상인지 확인하여 성인이면
               `true`, 아니면 `false`를 반환합니다.
     */

    static Boolean checkAdult(int age){
        boolean result = (age >= 18);
        return result;
    }

    /*
        5. 최대값 찾기 함수

        - 함수 이름: `findMax`
        - 입력: 정수 배열
        - 출력: 입력 받은 값 중 가장 큰 수
        - 설명: 입력받은 두 수중에서 가장 큰 값을 반환하는 함수를 작성하세요.
     */

    static int findMax(int n1, int n2){
        // 삼항 : (조건식) ? 결과1 : 결과2
        int result = (n1 > n2) ? n1 : n2;
        return  result;
    }
}
