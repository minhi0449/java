package ch07.sec07;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends A{
	
}
class E extends A{
	
}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동 타입 변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		// 컴파일 에러 : 상속 관계에 있지 않음
		// B b3 = e;
		// C c2 = d;
		
		
		System.out.println("a1 class: " + a1.getClass().getSimpleName());
		System.out.println("a2 class: " + a2.getClass().getSimpleName());
		System.out.println("a3 class: " + a3.getClass().getSimpleName());
		System.out.println("a4 class: " + a4.getClass().getSimpleName());

		System.out.println("a1 instanceof B: " + (a1 instanceof B));
		System.out.println("a2 instanceof C: " + (a2 instanceof C));
		System.out.println("a3 instanceof D: " + (a3 instanceof D));
		System.out.println("a4 instanceof E: " + (a4 instanceof E));
	}
}
