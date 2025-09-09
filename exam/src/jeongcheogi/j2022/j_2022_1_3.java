package jeongcheogi.j2022;
// 객체 레퍼런스 복사
class A {
	int a;
	int b;
}
public class j_2022_1_3 {
	static void func1(A m) {
		m.a *= 10;
	}
	
	static void func2(A m) {
		m.a += m.b;
	}
	public static void main(String[] args) {
		A m = new A();
		m.a = 100;
		func1(m);
		m.b = m.a;
		func2(m);
		System.out.printf("%d", m.a);
	}
	
}
