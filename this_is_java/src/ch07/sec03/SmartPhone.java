package ch07.sec03;

public class SmartPhone extends Phone{
	public boolean wifi;

	
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone (String model, String color) 생성자 실행됨");
	}
}
