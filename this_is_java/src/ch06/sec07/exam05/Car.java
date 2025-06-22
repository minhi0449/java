package ch06.sec07.exam05;

public class Car {
	String company = "테슬라"; // 기본 회사 이름
	String model;			 // 모델명
	String color;			 // 색상
	int maxSpeed;			 // 최고 속도
	
	// 기본 생성자
	Car() {
		
	}

	// 모델만 넣으면 나머지는 기본값 사용
	Car(String model) {
		this(model, "은색", 250);
	}
	
	// 모델과 색만 넣으면 속도는 기본값 사용
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	// 모델, 색, 속도를 모두 설정하는 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
