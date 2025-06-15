package ch09.sec03.exam02;

public class AExample {
	public static void main(String[] args) {
		// B 객체 생성
		A.B b = new A.B();
		System.out.println("b.field1 : " + b.field1);
		System.out.println();
		
		// B클래스의 정적 필드 및 메소드
		System.out.println("A.B.field2 : " + A.B.field2);
		A.B.method2();
		
	}
}
