package ch08.sec05;

public class RemoteConEx {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		System.out.println();
		
		rc.setMute(true);
		rc.setMute(false);
	}
}
