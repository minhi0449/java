package ch06.sec06.exam02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		System.out.println();
		myCar.speed = 60;
		System.out.println(myCar.speed);
		
		Car newCar = new Car("테슬라", "검정", 250);
	}
}
