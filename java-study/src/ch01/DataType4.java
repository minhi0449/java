package ch01;

public class DataType4 {
    public static void main(String[] args) {

        // 논리 자료형
        // 어떠한 사실을 관찰하고 그 결과가 참, 거짓인지 판별할 때 사용한다.
        // 크기는 1byte

        // 변수 선언과 동시에 초기화 (값을 넣다)
        boolean isMarried = false;
        isMarried = true;
        System.out.println();
        System.out.println("isMarried : " + isMarried);
        System.out.println();

        boolean isOk;
        isOk = false;
        System.out.println("isOk : " + isOk);
        isOk = true;
        System.out.println("isOk : " + isOk);
        System.out.println();

        System.out.println("====================");
        System.out.println("true : " + true);
        System.out.println("false : " + false);

    } // end of main
} // end of class
