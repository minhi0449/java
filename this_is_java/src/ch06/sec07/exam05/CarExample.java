package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); // 생성자 호출 (기본 자동차 생성)
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("테슬라"); // 모델만 지정
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);

		System.out.println();
		
		Car car3 = new Car("자가용","빨강"); // 모델 + 색상
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);

		System.out.println();
		
		Car car4 = new Car("택시","검정",200); // 모두 직접 설정
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}
}
