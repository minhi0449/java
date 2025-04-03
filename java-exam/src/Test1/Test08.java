package Test1;

/*
 * 날짜 : 2024/07/03
 * 이름 : 김민희
 * 내용 : 자바 반복문 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i<n; i++) {
			
			for(int j=n-1; j>1;  j--) {
				System.out.println("*");
			}
			
			for(int j=n-1; j < 2 * i + 1;  j++) {
				System.out.println("*");
			}
			
			System.out.println("\n");
		}
	}
}
