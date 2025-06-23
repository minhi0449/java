package ch10.sub02;
/*
 * 날짜 : 2025/06/22
 * 이름 : 김민희
 * 내용 : 스레드 상태 실습하기 
 */
class SubThread extends Thread{
	@Override
	public void run() { // 작업 스레드로 처리할 메소드 run()
		int i = 1;
		
		try {
			for(;;) {
				System.out.println("Work Thread 실행 ...");
				i++;
				Thread.sleep(1000); // 1000은 1초
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 무한 반복문으로 인해 실행될 수 없는 코드이기 때문에 죽은 코드 표시
		// System.out.println("Sub Thread 종료 ...");
	}
}

public class ThreadInterrupt {
	public static void main(String[] args) {
		SubThread sub = new SubThread();
		
		sub.start();
		try {
			Thread.sleep(1000 * 10); // main 스레드 10초 대기 (일시정지)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sub.interrupt(); // InterruptedException 을 발생시켜 작업 스레드 종료
		System.out.println("Main Thread 종료 ...");
	}
}

