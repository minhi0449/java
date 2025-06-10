package ch07.sec10.exam01;

public class PhoneEx {
	
	public static void main(String[] args) {
		// Phone phone = new Phone(); --> 추상 클래스는 객체 생성 불가능
		
		SmartPhone smart = new SmartPhone("홍길동");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
		
		/*
		 	[출력 결과]
		 	폰 전원을 켭니다.
			인터넷 검색을 합니다.
			폰 전원을 끕니다.
		 */
	}
}
