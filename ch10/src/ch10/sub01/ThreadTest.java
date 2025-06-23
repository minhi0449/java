package ch10.sub01;
/*
 * 날짜 : 2025/06/22
 * 이름 : 김민희
 * 내용 : 스레드 실습하기
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread sub1 = new SubThread("sub1 : ");
		SubThread sub2 = new SubThread("sub2 : ");
		
		// 작업 스레드 시작
		sub1.start();
		sub2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread 실행 ...\n");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			} // 1000은 1초
		}
		System.out.println("Main Thread 종료 ...");
		
	}
}
