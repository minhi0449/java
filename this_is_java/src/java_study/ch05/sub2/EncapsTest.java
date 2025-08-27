package java_study.ch05.sub2;
/*
 * 날짜 : 2025/08/27
 * 이름 : 김민희
 * 내용 : 캡슐화 실습하기
 */
public class EncapsTest {
	public static void main(String[] args) {
		// Car 객체 생성과 초기화
		Car sonata = new Car("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.setColor("은색");
		sonata.show();
		
		Car avante = new Car("아반떼", "검정", 0);
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		
		// kb 객체 생성과 초기화 
		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(30000);
		// 김유신 -> 김유진 개명하기
		kb.setName("김유진");
		kb.show();
		
		// wr 객체 생성과 초기화
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 10000);
		wr.deposit(20000);
		wr.withdraw(15000);
		// 우리은행 -> 유리은행 상호 변경
		wr.setBank("유리은행");
		wr.show();
		
		// 클래스 연습문제
		/*
		    도서관 관리 시스템의 일부로 Book 클래스를 정의하세요. 이 클래스는 다음 요구사항을 충족해야 합니다.
			 	
		    <속성>
			- title (String) : 책 제목
			- author (String) : 저자 이름
			- isbn (String) : ISBN 번호
			- availableCopies (int) : 이용 가능한 복사본 수
			
			<생성자>
			- 모든 인스턴스 변수를 초기화 하는 생성자
			
			<메서드>
			borrowBook()
		      - 이용 가능한 복사본이 있으면 availableCopies 를 1 감소시키고 true 를 반환
		      - 이용 가능한 복사본이 없으면 false 를 반환
		    
		    returnBook()
		    - availableCopies 를 1 추가
		    
		    show
		    - 모든 인스턴스 변수의 값을 출력
		    
		    <Getter, Setter>
		    - 각 인스턴스 변수에 대한 getter와 setter 메서드 정의
		 */
		Book java = new Book("이것이 자바다", "신용권", "121-11-1001", 3);
		
		if(java.borrowBook()) {
			System.out.println("대출 성공");
		} else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수 : " + java.getAvailableCopies());
		java.show();
		
		Book sql = new Book("혼자 공부하는 SQL", "우재남", "112-10-1102", 2);
	}
}
