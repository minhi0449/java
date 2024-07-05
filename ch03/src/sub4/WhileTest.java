package sub4;
/*
 * 날짜 : 2024/07/01
 * 이름 : 김민희
 * 내용 : 반복문 while 실습
 */
public class WhileTest {

	public static void main(String[] args) {
	
		// 1부터 10까지 합
		int sum = 0;
		int k = 1; 
		
		while( k <= 10 ) {
			
			sum += k;
			k++;
		}	
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// do ~ while
		int total = 0;
		int j = 1;
		
		do {
			if(j % 2 == 0) {
				total += j;
			}
			
			j++;
			
		}while(j <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + total);
		
		
		// break
		int num = 1;
		
		while(true) {
			
			
			if(num % 5 == 0 && num % 7 == 0) {
				break; // 반복문 탈출 (35가 되었을 때 빠져나올 수 있음)
			}
			
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 " + num);
		
		// continue
		int tot = 0;
		int i = 0;
		
		while(i <= 10) {
			
			i++;
			if(i % 2 == 1) {
				continue; // 반복문의 처음으로 이동
				//홀수는 되돌리고 짝수는 밑으로 내려가서 더하기 하는 거
				//continue는 필터링이라고 생각하면 됨
			}
			tot += i;
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
	}
}
