package ch02.sec02;
/*
    날짜 : 2025.02.28 (금)
    이름 : 김민희
    내용 :
 */
public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;

        // long var3 = 1000000000000; // 컴파일러는 int로 간주하기 때문에 에러 발생
        // java: integer number too large

        long var4 = 1000000000000L;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var4 : " + var4);

    }
}
