package classpart;

import ch10.Subway;

// 나 혼자 코딩
// 사칙 연산 함수 완성하기
public class FunctionTestEx {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = addNum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = substract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result);

        result = times(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result);

        double value = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + value);




    }

    // 더하기
    public static int addNum(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    // 빼기
    public static int substract(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    // 곱하기
    public static int times(int n1, int n2){
        int result = n1 * n2;
        return result;
    }

    // 나누기
    public static double divide(double n1, double n2){
        double result = n1 / n2;
        return result;
    }

}
