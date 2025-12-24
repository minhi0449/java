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
	}
}
