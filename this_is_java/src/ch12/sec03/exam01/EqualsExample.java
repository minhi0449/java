package ch12.sec03.exam01;

/*
 * Object 의 equals() 메소드는 재정의해서 동등 비교용으로 사용된다.
 * 동등 비교란? 객체가 비록 달라도 내부의 데이터가 같은지 비교하는 것을 말한다.
 * 예를 들어 String 은 equals() 메소드를 재정의해서 내부 문자열이 같은지를 비교한다.
 * 
 */
public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("ob1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if(obj1.equals(obj3)) {
			System.out.println("ob1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
		
	}
}
