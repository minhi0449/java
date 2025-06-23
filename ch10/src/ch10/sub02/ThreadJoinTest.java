package ch10.sub02;
/*
 * 날짜 : 2025/06/22
 * 이름 : 김민희
 * 내용 : 스레드 상태 및 join() 메서드 실습하기 
 */
class WorkThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Work Thread 실행 ...");
			
			try {
				Thread.sleep(1000); // 1000은 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Work Thread 종료 ...");
	}
}


public class ThreadJoinTest {
	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		
		work.start();
		
		try {
			work.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread 종료 ..."); // 프로그램 종료
	}
}
