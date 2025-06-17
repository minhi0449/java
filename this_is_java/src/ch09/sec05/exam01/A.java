package ch09.sec05.exam01;

public class A {
	int field1 = 1;
	void method1() {}
	
	static int field2 = 2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			field2 = 2;
			method2();
		}
	}
	
	static class C {
		void method() {
			// A의 인스턴스 필드와 메소드 사용 불가능
			//field = 1;
			//method1();
			
			// 정적필드 사용가능
			field2 = 2; 
			method2();
		}
	}
}
