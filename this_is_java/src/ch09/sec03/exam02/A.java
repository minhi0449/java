package ch09.sec03.exam02;

public class A {
	// 정적 멤버 클래스
	static class B {
		int field1 = 1;
		
		static int field2 = 2;
		
		B(){
			System.out.println("1️⃣ B 생성자 실행");
		}
		
		void method1() {
			System.out.println("2️⃣ B method1 실행");
		}
		
		static void method2() {
			System.out.println("3️⃣ B method2 실행");
		}
	}
}
