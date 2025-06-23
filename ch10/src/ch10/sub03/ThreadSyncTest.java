package ch10.sub03;

/*
 * 날짜 : 2024/07/22
 * 이름 : 김민희
 * 내용 : 스레드 동기화 실습하기
 */
public class ThreadSyncTest {
	public static void main(String[] args) {
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("count : " + count.getNum());
	}
}
