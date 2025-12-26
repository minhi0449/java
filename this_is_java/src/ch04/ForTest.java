package ch04;

public class ForTest {
	public static void main(String[] args) {
		// 별삼각형
		for(int start=1 ; start<=10 ; start++) {
			
			for(int end=1 ; end<=start ; end++) {
				System.out.print("☆");
			}
		
			System.out.println();
		
		}
		
		int n = 5;
		
		for(int i = 0; i<n ; i++) {
			for(int j = n-1; i < j; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		// 다이아몬드
		for (int i = 1; i <= 3; i++) {
			// 상단 공백
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			// 상단 *
			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");
			}
			System.out.println();
		} //for

		for (int i = 2; i >= 1; i--) {
			// 하단 공백
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
            
			// 하단 *
			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		} //for
		
		
		
	}
}
