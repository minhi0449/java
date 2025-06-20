package ch09.sec07.exam02;

// 리모컨의 기본 규칙을 정의하는 인터페이스 
public interface RemoteControl {
	// 추상 메서드 - 구현부가 없고 규칙만 정의
	// 모든 리모컨은 반드시 켜기 기능을 구현해야 함
	void turnOn();
	void turnOff();
}
