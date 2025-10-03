package jeongcheogi.j2020;

// 2020년 4회 기출문제 6번
// 2차원 배열을 중첩 for 문으로 순회하며 규칙적인 수열 저장 및 출력
public class j_2020_4_06 {
	public static void main(String[] args) {
		int[][] a = new int[3][5];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = j*3+(i+1);
				System.out.print(a[i][j] + " ");
			}
			System.out.println( );
		}
	}
}
