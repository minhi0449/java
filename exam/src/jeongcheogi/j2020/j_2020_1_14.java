package jeongcheogi.j2020;

// 2020년 1회 기출문제 14번
// switch문 에서 break 가 없을 때 발생하는 fall-through(폴-쓰루) 동작 이해
public class j_2020_1_14 {
	public static void main(String[] args) {
		int i = 3;
		int k = 1;
		switch(i) {
		case 0:
		case 1:
		case 2:
		case 3: k=0;
		case 4: k+=3;
		case 5: k-=10;
		default: k--;
		}
		System.out.print(k);
	}
}

// 출력 결과 : -8