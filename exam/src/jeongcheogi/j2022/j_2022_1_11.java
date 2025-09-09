package jeongcheogi.j2022;
// 스레드
class Car implements Runnable { // Car 클래스는 Runnable 인터페이스 구현
	int a;
	public void run() { // 스레드가 실행될 때 수행되는 코드
		System.out.println("run"); // run() 메서드 오버라이드 (스레드 실행 시 실행될 코드)
	}
}
public class j_2022_1_11 {
	public static void main(String[] args) {
		// Car 객체를 Thread 에 넘겨서 실행할 준비
		Thread t1 = new Thread(new Car());
		
		// start() 를 호출해야 별도의 스레드에서 run() 실행
		t1.start(); // 스레드 실행 시작
	}
}
