package ch09.sec02.exam01;

public class A {
	// 인스턴스 멤버 클래스
	class B{}
	
	// 인스턴스 필드값으로 B객체 대입
	B field = new B();
	
	// 생성자
	A() {
		System.out.println("A 생성자 호출됨");
		B b = new B();
		System.out.println("A 생성자 내부에서 B 객체 생성됨");
	}
	
	// 인스턴스 메소드
	void method() {
		System.out.println("method() 호출됨");
		B b = new B();
		System.out.println("method() 내부에서 B 객체 생성됨");
	}
}
