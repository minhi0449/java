package ch09.sec05.exam02;

// 외부 클래스 A 정의
public class A {
	String field = "A-field"; // A의 정보
	
	void method() {
		System.out.println("A method"); // A의 행동
	}
	
	// A의 인스턴스 메소드
	// A가 내부 클래스 B를 사용하는 기능
	void useB() {
		B b = new B(); // B 객체 만들기
		b.print();	   // B의 print 기능 실행
	}
	
	// 내부 클래스 B
	class B {
		String field = "B-field"; // B의 정보
		
		void method() {
			System.out.println("B-method"); // B의 행동
		}
		
		// B가 자기 자신과 A를 함께 사용하는 기능
		void print() {
			// B의 객체와 필드 메소드 사용
			System.out.println(this.field); // B의 필드 출력
			this.method(); // B의 메소드 실행
			
			// A의 객체와 필드 메소드 사용
			System.out.println(A.this.field); // A의 필드 접근
			A.this.method(); // A의 메서드 접근
		}
	}
}
