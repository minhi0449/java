package jeongcheogi.j2020;

// 2020년 4회 기출문제 5번
// 10진수를 2진수로 변환하는 알고리즘
public class j_2020_4_05 {
	public static void main(String[] args) {
		int []a = new int[8];
		int i = 0;
		int n = 10;
		while(n > 0) {
			a[i++] = n % 2;
			n /= 2;
		}
		for(i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
