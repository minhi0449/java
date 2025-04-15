package ch03;

public class Operation4_1 {
    public static void main(String[] args) {

        int num1 = 0;
        num1 = num1 + 2;
        num1 += 2;

        System.out.println();
        System.out.println("num1 : " + num1);

        int num2 = 0;
        // num2 = num2 - 2;
        num2 -= 2;
        System.out.println("num2 : " + num2);

        int num3 = 1;
        // num3 = num3 * 3
        num3 *= 3;
        System.out.println("num3 : " + num3);

        int num4 = 10;
        num4 /= 2;
        System.out.println("num4 : " + num4);

        int num5 = 5;
        num5 %= 3;
        // num5 = num5 % 3;
        // num5 = 5 % 3; (% 퍼센트는 나머지 값 구하기)
        // 5 % 3 = 몫 1 / 나머지 2
        System.out.println("num5 : " + num5);
    }
}
