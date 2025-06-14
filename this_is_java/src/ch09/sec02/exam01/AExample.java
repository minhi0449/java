package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		System.out.println("main() 시작");
		
		// A 객체 생성
		A a = new A();
		System.out.println("A 객체 생성 완료");
		
		// B 객체 생성
		A.B b = a.new B();
		System.out.println("a.new B() 호출 → B 객체 생성 완료");
	}
}
