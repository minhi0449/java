package ch07.sec07.exam02;

public class ChildEx {
	public static void main(String[] args) {
		// 자식 객체 만들기
		Child child = new Child();
		
		child.method1(); // 부모 메서드 실행
		child.method2(); // 자식이 오버라이딩한 메서드 실행
		child.method3(); // 자식 전용 메서드 실행
		System.out.println();
		
		// 자식을 부모 타입 변수에 저장
		Parent parent = child;
		
		parent.method1(); // 부모 메서드
		parent.method2(); // 자식이 오버라이딩한 메서드 (자식 버전 실행)
		// parent.method3(); --> 호출 불가능 (부모 타입이라 method3 호출 불가)
		System.out.println();
		
		// 부모 타입이지만 실제는 자식 객체 --> 명시적 캐스팅
		Parent pa = new Child();
		Child ch = (Child)pa;
		
		ch.method2(); // 자식 버전 --> 출력 : Child method2()
		ch.method3(); // 자식 전용 --> 출력 : Child method3()
		System.out.println();
		
		// 아까 만든 parent 도 자식이었으니 다시 캐스팅 OK
		Child pach = (Child) parent;
		
		pach.method3(); // 자식 메서드 -->  출력 : Child method3()
		pach.method2(); // 자식 버전  -->  출력 : Child method2()
		
	}
}
