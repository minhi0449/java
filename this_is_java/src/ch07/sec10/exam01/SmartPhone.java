package ch07.sec10.exam01;

public class SmartPhone extends Phone{

	// 생성자 선언
	public SmartPhone(String owner) {
		// 폰 생성자 호출
		super(owner);
	}
	
	// 메서드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
