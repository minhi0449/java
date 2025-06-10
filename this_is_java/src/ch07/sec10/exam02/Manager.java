package ch07.sec10.exam02;

public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("Manager - 생산 관리를 합니다.");
	}
}
