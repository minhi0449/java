package ch10.sub03;

public class CountThread extends Thread{
	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			count.setNum(); // 	100번 반복해서 setNum() 호출
		}
	}
}