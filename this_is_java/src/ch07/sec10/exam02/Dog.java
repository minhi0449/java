package ch07.sec10.exam02;

public class Dog extends Animal{
	@Override
	public void sound() { // 재정의 오버라이딩
		System.out.println("멍멍 ~!");
	}
}
