package jeongcheogi.j2020;

// 2020년 2회 기출문제 19번
// 상속(Inheritance)과 생성자 체이닝(Constructor Chaining)
// 상속에서 부모 클래스의 생성자와 메서드를 자식 클래스에서 어떻게 호출하는지 테스트하는 문제
class A {
	private int a;
	public A(int a) {
		this.a = a;
	}
	public void display() {
		System.out.println("a="+a);
	}
}
class B extends A {
	public B(int a) {
		super(a);
		super.display();
	}
}
public class j_2020_2_19 {
	public static void main(String[] args) {
		B obj = new B(10);
	}
}
