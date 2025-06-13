package ch08.sec05;

// Audio 는 RemoteControl을 구현한 클래스
public class Audio implements RemoteControl{
	// 오디오가 기억할 볼륨 상태
	private int volume;
		
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// 오디오 볼륨 조절
	@Override
	public void setVolume(int volume) {
		// 최대값 초과 시 강제로 최대값으로 설정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} 
		// 최소값 미만 시 강제로 최소값으로 설정
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} 
		// 정상 범위면 그대로 저장
		else {
			this.volume = volume;
		}
		// 현재 볼륨 상태 출력
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	// 필드
	// 무음 전에 기억했던 볼륨을 저장하는 공간
	private int memoryVolume;
	
	// 오디오 전용 무음 처리 기능 (볼륨 복원 포함)
	public void setMute(boolean mute) {
		if(mute) { // mute 가 true 이면 이 안의 코드를 실행해라
			// 현재 볼륨을 memory 에 저장 후 0으로
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			// 무음 해제 시 이전 볼륨 복원
			System.out.println("무음 해제 합니다.");
			setVolume(memoryVolume);
		}
	} // end setMute
}
