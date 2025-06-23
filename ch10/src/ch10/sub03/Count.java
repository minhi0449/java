package ch10.sub03;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭 : 스레드 간 경합을 막고 동기방식으로 실행
	public synchronized void setNum() {
		// 임계 영역 : 멀티 스레드에 의해 공유 자원이 참조되는 영역
		num ++;
	}
}
