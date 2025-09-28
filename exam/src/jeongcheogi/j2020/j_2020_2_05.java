package jeongcheogi.j2020;

// 2020년 2회 기출문제 5번
// 다형성과 동적 바인딩
class Parent{
	public void show() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("Child");
	}
}
public class j_2020_2_05 {
	public static void main(String[] args) {
		Parent pa = new Child();
		pa.show();
	}
}
