package ch09.sec03.exam01;

public class A {
	// 정적 멤버 클래스
	static class B{}
	
	// 인스턴스 필드값으로 B객체 대입
	B field = new B();
	
	// 생성자
	A() {
		B b = new B();
	}
	
	// 인스턴스 메소드
	void method() {
		B b = new B();
	}
	
	// 정적 메소드
	static void method2() {
		B b = new B();
	}
}
