package ch08.sec06;

public interface RemoteControl {
	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
