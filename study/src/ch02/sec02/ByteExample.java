package ch02.sec02;
/*
    날짜 : 2025.02.28 (금)
    이름 : 김민희
    내용 : byte 타입 변수에 허용 범위를 초과한 값을 대입했을 경우 컴파일 오류 발생하는 예제
 */

public class ByteExample {

    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = -30;
        byte var5 = 127;
        //  byte var6 = 128; // 컴파일 에러 (Type mismatch: cannot convert from int to byte)

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
        // System.out.println("var6 : " + var6);

    }

}
