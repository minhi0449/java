package jeongcheogi.j2020;

// 2020년 4회 기출문제 19번
// 메서드 오버라이딩 / 동적 바인딩
class Parents {
	public int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1) + compute(num-2);
	}
}
class Childs extends Parents {
	public int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1)+compute(num-3);
	}
}
public class j_2020_4_19 {
	public static void main(String[] args) {
		Parents obj = new Childs();
		System.out.println(obj.compute(4));
	}
}
