package ch06.sec06.exam02;

public class Car {
	String company = "현대자동차";
	String model = "제네시스";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	Car(){
		return;
	}
	Car(String model, String color, int maxSpeed){
		System.out.println(model + ", " + color + ", " + maxSpeed);
	}
	
}
