package ch08.sec06;

public class RemoteConEx {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		
		RemoteControl.changeBattery();
	}
}
