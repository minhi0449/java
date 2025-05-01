package ch03;

public class MainTest1 {

    // 메인 함수
    public static void main(String[] args) {

        // 대입 연산자 (=)
        int number = 10;
        // 연산의 방향은 오른쪽에서 왼쪽으로 연산이 됩니다.

        // 변수에 변수를 대입할 수 있습니다.
        int number2 = number;
        System.out.println();
        System.out.println("-------------------");

        // 부호 연산지 +,-
        // 부호를 변경하는 연산자 입니다.
        // 주의 : 단, 변수에 들어있는 실제 값을 변경하지는 않습니다.
        System.out.println(+10);
        System.out.println(-5);

        // num3 공간 있는 값을 출력 --> 그 부호를 (-) 변경
        int num3 = 100;
        System.out.println();
        System.out.println("-num3 : " + -num3);

        // 실제 num3 이라는 메모리 공간의 값도 변경이 되었을까?
        System.out.println("num3 : " + num3); // 그대로 100 출력됨 (변경되지 않음)

        // 응용) 실제 변수에 접근해서 100 ⟶ -100 변경하려면 어떻게 해야 할까?
        // 단, 값을 사용하지 말고 변수만 활용해 보자.
        num3 = -num3;

        System.out.println();
        // 실제 값을 변경하려면 대입 연산자와 함께 사용해야 한다.
        System.out.println("num3 : " + num3);
        System.out.println("-num3 : " + -num3);

    }


}
