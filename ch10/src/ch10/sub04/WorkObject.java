package ch10.sub04;

// 일을 시켜주는 객체
public class WorkObject {
	// synchronized : 한 번에 하나의 스레드만 이 메서드에 접근 가능
	public synchronized void methodA() {
		// 현재 실행 중인 스레드의 정보를 가져옴
		Thread thread = Thread.currentThread();
		
		// 현재 스레드 이름과 함께 작업 실행 메시지 출력
		System.out.println(thread.getName() + " : methodA 작업 실행");
		
		// 대기 중인 다른 스레드에게 "이제 니 차례야" 신호 전송
		notify();
		
		try {
			// 현재 스레드를 일시정지하고 다른 스레드의 신호를 기다림
			wait();
		} catch (InterruptedException e) {
			// 대기 중 방해받았을 때의 예외 처리
			e.printStackTrace();
		}
	}
	
	// methodA 와 동일한 구조로 작동하는 methodB
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getName() + " : methodB 작업 실행");
		
		notify(); // 대기 중인 스레드에게 신호 전송
		
		try {
			wait(); // 다음 순서를 위해 잠깐 멈추기
		} catch (InterruptedException e) {
			e.printStackTrace(); // 에러가 나면 출력
		}
	}
	
}
