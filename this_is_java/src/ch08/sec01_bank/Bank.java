package ch08.sec01_bank;

public interface Bank {
	// 상수 (최대 고객에게 인출해 줄 수 있는 금액 명시)
	public int MAX_INTEGER = 1_000_000;
	
	// 추상 메소드 (인출하는 메소드)
	void withDraw(int price);
	
	// 추상 메소드 (입금하는 메소드)
	void deposit(int price);
	
	// Java8에서 가능한 default 메소드 (고객의 휴면계좌 찾아주는 메소드 : 필수구현은 선택사항)
	default String findDormancyAccount(String custId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**금융결제원에서 제공하는 로직**");
		return "00은행 000-000-0000-00";
	}
	
	// Java8에서 가능한 정적 메소드 (블록체인 인증을 요청하는 메소드)
	static void BCAuth(String bankName) {
		System.out.println(bankName + " 에서 블록체인 인증을 요청합니다.");
		System.out.println("전 금융사 공통 블록체인 로직 수행");
	}
	
	/*
	 	즉, 만약 추상메소드를 인터페이스에서 추가한다면, 
	 	이를 implements 한 모든 클래스에서 
	 	강제적으로 추상메소드를 구현해야 하고
	 	구현하지 않을 시 전부 에러가 난다.
	 	
	 	하지만 디폴트 메소드를 정의하고 기본 구현부를 제공하고
	 	만약 기본 구현부가 맘에 들지 않으면 
	 	각자 오버라이딩하여 재구현할 수 있도록 
	 	선택적인 메소드를 가이드한다면 시스템 운영 유지보수성이 확보가 될 것이다.
	 	
	 	이를 더 쉽게 말하면, 결국 이미 운영되고 있는 시스템에서
	 	추가 요건으로 인해 불가피하게 반영을 해야할 때,
		디폴트 메소드를 쓰면 효과적.
	 */
}