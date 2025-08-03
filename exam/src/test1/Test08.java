package test1;
/*
 * 날짜 : 2025/08/02
 * 이름 : 김민희
 * 내용 : 자바 반복문 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		int n = 5; // 출력 줄 수
		
		for(int i = 0; i < n; i++) { // 줄 반복
			
			for(int j = n - 1; i < j; j--) { // 공백 출력
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2 * i + 1; j++) { // 별 출력
				System.out.print("*");
			}
			
			System.out.print("\n"); // 줄 바꿈
		}
	}
}
