package ch07.sec10.exam02;

public final class Employee extends Person {
	@Override
	public void work() {
		System.out.println("Employee - 제품을 생산합니다.");
	}
}
