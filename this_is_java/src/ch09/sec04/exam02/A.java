package ch09.sec04.exam02;

public class A {
	void useB() {
		// 로컬 클래스
		class B{
			int field1 = 1;
			static int field2 = 2;
			
			B() {
				System.out.println("B 생성자 실행\n");
			}
			
			void method1() {
				System.out.println("B method1 실행");
			}
			
			static void method2() {
				System.out.println("B static method2 실행");
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
		
		// 로컬 객체의 인스턴스 필드와 메소드 사용
		System.out.println(b.field1);
		b.method1();
		
		// 로컬 B클래스의 정적 필드 및 메소드 사용
		System.out.println(B.field2);
		B.method2();
	}
	
}
