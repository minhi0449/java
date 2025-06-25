package ch10.sub05;

import java.awt.Toolkit;

/*
 * 날짜 : 2024/07/22
 * 이름 : 김민희
 * 내용 : 데몬스레드 실습하기 
 */
class SubThread extends Thread {
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { // 작업 스레드로 처리할 메서드 run()
		for(;;) {
			System.out.println(name + "Sub Thread 실행 ...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 1000은 1초 
		}
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		SubThread sub = new SubThread("sub");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		sub.setDaemon(true);
		
		sub.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread 실행 ...");
		}
		System.out.println("Main Thread 종료 ...");
	}
}
