package ch09.sec04.exam01;

public class A {
	// 생성자
	A(){
		// 로컬 클래스 선언
		class B {}
		
		// 로컬 객체 선언
		B b = new B();
	}
	
	void method() {
		// 메소드 안에 로컬 클래스 선언
		class B {}
		
		// 로컬 객체 선언
		B b = new B();
	}
}
