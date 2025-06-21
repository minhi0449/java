package ch06.sec04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명  : " + myCar.model);
		System.out.println("제작회사 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
	}
}
