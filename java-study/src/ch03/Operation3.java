package ch03;

public class Operation3 {
    public static void main(String[] args) {

        // 증감, 감소 연산자 ++, -- 변수에 접근해서 그 값을 오직 1을 증가, 감소 시킨다.
        int value1 = 1;
        System.out.println();
        System.out.println("value1 : " + value1);
        value1++;
        System.out.println("value1 : " + value1);

        int value2 = 1;
        System.out.println("------------------------");
        System.out.println("value2 : " + value2);
        value2--;
        System.out.println("value2 : " + value2);

        // 증감 연산사 위치 확인하기
        int a = 10;
        int resultDataBox1;

        // 증감 후위 연산자
        resultDataBox1 = a++;
        System.out.println("------------------------");
        System.out.println("resultDataBox1 : " + resultDataBox1); // 출력 (resultDataBox1 : 10)
        System.out.println("a : " + a); // 출력 (a : 10)

        System.out.println("========================");

        // 증감 전위 연산자
        int b = 10;
        int result2 = ++b;
        System.out.println("result2 : " + result2); // 출력 (result2 : 11)

        // 결론 : 증감 연산자는 변수에 값을 1증가 시킨다.
        // 단, 단항 앞,뒤 위치에 따라서 연산의 순서가 달라질 수 있다.
    }
}
