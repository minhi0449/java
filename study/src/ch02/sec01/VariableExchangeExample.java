package ch02.sec01;

/*
    날짜 : 2025.02.28 (금)
    이름 : 김민희
    내용 :
 */

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + ", y " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x + ", y " + y);

    }

}
