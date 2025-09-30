package jeongcheogi.j2020;

// 2020년 3회 기출문제 17번
// while 반복문과 continue를 이용한 짝수 합 구하기
public class j_2020_3_17 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i<10){
			i++;
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
