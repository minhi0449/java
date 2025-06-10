package ch07.sec03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myphone = new SmartPhone("아이폰", "스페이스 그레이");
		
		System.out.println("모델 : " + myphone.model);
		System.out.println("색상 : " + myphone.color);
	}
}
