package jeongcheogi.j2025;

// 2025년 2회 기출문제

public class j_2025_2_05 {
	
	public static void fn(String[] data, String s) {
		data[0] = s;
		s = "Z";
	}
	
	public static void main(String[] args) {
		String data[] = {"A"};
		String s = "B";
		fn(data, s);
		System.out.println(data[0]+s);
	}
}
