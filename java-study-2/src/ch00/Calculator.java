package ch00;

// 인스턴스 메소드와 정적(static) 메소드의 차이
public class Calculator {

    // 인스턴스 메소드 (Instance Method) : 객체에 종속된 메소드
    // 정적 메소드 (Static Method) : 클래스에 종속된 메소드

    // 인스턴스 변수
    private int result;

    // 인스턴스 메소드
    public void add(int num) { // 다른 클래스에서도 호출 가능
        this.result += num;
    }

    // 인스턴스 메소드
    public int getResult() {
        return this.result;
    }

    // 정적 (static) 메소드
    public static int sum(int a, int b){ // static : 정적 메소드를 선언하는 키워드
        return  a + b;
    }


}
