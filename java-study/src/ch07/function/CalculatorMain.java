package ch07.function;

/*
    함수란 ? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록이야
    static 을 사용하면 객체 없이 바로 호출 가능 해 !
 */
public class CalculatorMain { // 함수 복습

    public static void main(String[] args) {

        // 테스트용 숫자
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;
        System.out.println();

        // 더하기 함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // 빼기 함수 호출
        int difference = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + difference);

        // 곱하기 함수 호출
        int product = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + product);

        // 나누기 함수 호출
        double quotient = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + quotient);


        // 홀수 판별 함수 호출
        boolean odd = isOdd(testNumber);
        System.out.println(testNumber + "은(는) 홀수인가요? " + odd);

        // 짝수 판별 함수 호출
        boolean even = isEven(testNumber);
        System.out.println(testNumber + "은(는) 짝수인가요? " + even);

        /*
            10 + 5 = 15
            10 - 5 = 5
            10 * 5 = 50
            10 / 5 = 2.0
            7은(는) 홀수인가요? true
            7은(는) 짝수인가요? false
         */

    } // end of main

    // 두 숫자를 더하는 함수
    static int add (int a, int b){
        return a + b; // 입력받는 a와 b를 더하고 반환
    }

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b){
        return a - b; // 입력 받은 a 에서 b를 빼서 반환
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b){
        return a * b; // a 와 b를 곱해서 반환
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b){
        // 방어적 코드를 잘 작성해야 한다.
        if (b == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    // 짝수인지 판별하는 함수 - 매개변수 1
    static boolean isEven(int number){
        return number % 2 == 0; // 나머지가 0이면 짝수 -> true, 아니면 false
    }

    // 홀수인지 판별하는 함수 - 매개변수 1
    static boolean isOdd(int number){
        return number % 2 != 0; // 나머지가 0이 아니면 홀수 -> true
    }

} // end of class
