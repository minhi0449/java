package ch10.sub01;

public class SubThread extends Thread{
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { // 작업 스레드로 처리할 메서드 run()
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "Sub Thread 실행 ...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 1000은 1초
		}
		System.out.println(name + "Sub Thread 종료 ...");
	}
}
