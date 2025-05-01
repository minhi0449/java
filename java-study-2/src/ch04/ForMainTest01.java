package ch04;

public class ForMainTest01 {
    public static void main(String[] args) {

        // 반복문 - 반복적인 패턴이 보인다면 반복문을 생각해 보자.

        // 0 부터 9 까지 화면에 출력하시오.
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        System.out.println("---------------------");

        // 초기화 식; 조건식 (true, false), 증감식(감소식)
        int i;
        for (i = 0; i < 10; i++) {
            // 수행 구문; 조건식 true 라면 이 부분이 실행이 된다.
            // 숫자 0 을 i 변수로 치환해 보자.
            // 1.  i = 0
            // 2.  i = 1
            // 3.  i = 2
            // 4.  i = 3
            // 5.  i = 4
            // 6.  i = 5
            // 7.  i = 6
            // 8.  i = 7
            // 9.  i = 8
            // 10.  i = 9
            System.out.println("i : " + i);
        } // end of for

        // 왜 10 일까??
        System.out.println("최종 결과 i 값 : " + i);


    } // end of main
} // end of class
