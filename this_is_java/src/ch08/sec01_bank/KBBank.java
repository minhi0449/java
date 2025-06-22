package ch08.sec01_bank;

public class KBBank implements Bank{
	
	@Override
	public void withDraw(int price) {
		System.out.println("KB은행만의 인출 로직...");
		if(price < Bank.MAX_INTEGER) {
			System.out.println(price + " 원을 인출한다.");
		} else {
			System.out.println(price + " 원을 인출 실패.");
		}
	}
	
	public void deposit(int price) {
		System.out.println("KB은행만의 입금 로직..." + price + " 원을 입금한다.");
	}
	
	/*
	 	KB은행은 휴면계좌 찾아주기 메소드를 재구현하지 않았다.
	 	즉, 금융결제원이 제공해주는 메소드를 사용하겠다는 뜻이거나
	 	혹은 아직 사용하지 않겠다라고 이해하면 된다.
	 */
}
