package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// smartPhone 객체 생성
		SmartPhone myphone = new SmartPhone("iphone 13 PRO", "스페이스 그레");
		
		System.out.println("모델 : " + myphone.model);
		System.out.println("생성 : " + myphone.color);
		
		System.out.println("와이파이 상태 : " + myphone.wifi);
		System.out.println();
		
		myphone.bell();
		myphone.sendVoice("여보세요?");
		myphone.receiveVoice("안녕하세요@! 저는 홍길동인데요.");
		myphone.sendVoice("아~ 네 반갑습니다.");
		
		myphone.hangUp();
		
		System.out.println();
		
		myphone.setWifi(true);
		myphone.internet();
	}
}
