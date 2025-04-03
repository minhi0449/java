package sub1;

//클래스 정의
public class Car {

	// 속성(멤버변수)
	String name; // 변수 선언 
	String color;
	int speed;
	
	
	
	// 기능
	public void speedUp(int speed) {
		this.speed += speed; // this 클래스를 지칭하는 키워드 (int speed를 가리킴)
	}
		
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
