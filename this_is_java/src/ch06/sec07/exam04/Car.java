package ch06.sec07.exam04;

// 오버라이딩
public class Car {
	String company = "Bugatti";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
