package sub01;
/*
 * 날짜 : 2024/07/23
 * 이름 : 김민희
 * 내용 : 자바 람다식 실습하기
 */
@FunctionalInterface
interface Person {
	public void hello();
}

class Student implements Person{
	public void hello() {
		System.out.println("Hello Student!");
	}
}

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double b);
}

@FunctionalInterface
interface C {
	public boolean method();
}


@FunctionalInterface
interface M {
	public double func(double num);
}


public class LambdaTest {
	public static void main(String[] args) {
		// 객체 지향 프로그래밍
		Student student = new Student();
		
		// 함수형 프로그래밍 (람다식)
		Person teacher = () -> {
			System.out.println("Hello Teacher!");
			System.out.println("-------------------");
		}; // Person 의 hello() 를 람다식으로 () 으로 표현하고 그것을 구현부에서 재정의하여 사용
		
		teacher.hello();
		
		// 람다식 예제 
		// ======================================================================
		// A interface 람다식 예제
		// 매개변수를 받는 메소드 --> 타입을 일치 시켜줘야 함
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		// 데이터 타입 생략 가능
		A a2 = (a, b) -> {
			return a + b;
		};
		
		// 중괄호 생략하면 바로 return 을 의미함
		A a3 = (a,b) -> a+b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("-------------------");
		
		// ======================================================================
		// B interface 람다식 예제
		B b1 = (double a) -> {
			System.out.println("a : " + a);
		};
		
		B b2 = a -> System.out.println("a : " + a);
		
		// :: => 람다식
		B b3 = System.out::println; // 메소드 참조 연산자 (::)
		
		b1.method(1.0);
		b2.method(1.2);
		b3.method(3.0);
		System.out.println("-------------------");
		
		// ======================================================================
		// C interface 람다식 예제
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		System.out.println("-------------------");
		
		// ======================================================================
		// 람다식을 활용한 수학 클래스
		M m1 = Math::ceil;
		M m2 = Math::floor;
		M m3 = Math::round;
		
		System.out.println("올림값 : " + m1.func(1.2));
		System.out.println("내림값 : " + m2.func(1.2));
		System.out.println("반올림값 : " + m3.func(1.2));
		
	}
}





