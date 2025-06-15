package ch08.sec11.exam01;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// 타이어 객체 교체 Hankook --> Kumho
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}
}
