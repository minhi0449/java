package sub2;

/*
 * 날짜 : 2024/06/28
 * 이름 : 김민희
 * 내용 : 자바 출력 실습하기
 */
public class printTest {

	public static void main(String[] args) {
		
		// 기본출력
		System.out.println("Hello Java~");
		System.out.println("Hello Korea~");
		System.out.println("Hello Busan~");
		
		// 한줄출력
		System.out.print("welcome"); // ln(줄바꿈) 처리가 안되었기 때문에 그다음 출력문이 이어서 출력됨
		System.out.print("Java~");
		
		// 개행처리
		System.out.println(); // 줄바꿈
		System.out.print("welcome\n"); // \n 이스케이프 문자로 줄바꿈(개행)처리
		System.out.print("Korea~");
	}
}
