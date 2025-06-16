package ch09.sec04.exam03;

public class A {
	public void method1(int arg) { // final int arg
		// 로컬 변수
		int var = 1; // final int var
		
		// 로컬 클래스
		class B {
			// method
			void method2() {
				// 로컬 변수 읽기 
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
				
				// 로컬 변수 수정 --> X
				// arg = 2;
				// var = 2;
				
			}
		}
		
		B b = new B();
		b.method2();
		
		// 로컬 변수 수정 --> 수정 불가
		// arg = 3; // X
		// var = 1; // X
		
	}
}
