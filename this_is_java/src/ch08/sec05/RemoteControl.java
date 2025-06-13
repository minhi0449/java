package ch08.sec05;

// 리모컨 기능을 정의한 인터페이스
public interface RemoteControl {
	// 상수 선언
	
	// 최대 볼륨 (모든 기기 공통 상수)
	int MAX_VOLUME = 10;
	// 최소 볼륨 (모든 기기 공통 상수)
	int MIN_VOLUME = 0;
	
	void turnOn();  // 전원 켜기
	void turnOff(); // 전원 끄기
	void setVolume(int volume); // 볼륨 조절 기능 (필수 구현)
	
	// default 예제
	// 기본 무음 처리 기능 (오버라이딩 가능)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			setVolume(MIN_VOLUME); // 소리 0으로
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
}
