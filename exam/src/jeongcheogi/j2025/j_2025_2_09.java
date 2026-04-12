package jeongcheogi.j2025;

// Java 람다 + 함수형 인터페이스 + 예외 처리
public class j_2025_2_09 {
	static interface F {
		int apply(int x);
	}
	
	public static int run(F f) {
		try {
			return f.apply(3);
		} 
		catch (Exception e) {
			return 7;
		}
	}
	
	public static void main(String[] args) {
		F f = (x) -> {
			if(x>2) {
				throw new RuntimeException();
			}
			return x*2;
		};
		System.out.println(run(f)+run((int n)->n+9));
	}
}
