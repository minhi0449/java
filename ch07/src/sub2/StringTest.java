package sub2;

/*
 * 날짜 : 2024/07/16
 * 이름 : 김민희
 * 내용 : 자바 String 클래스 실습하기
 */
public class StringTest {

	public static void main(String[] args) {
		
		// 문자열(문자+배열)(단어) 생성
		String str1 = "Hello";// 리터럴 문자열  // String = 끈, 로프
		String str2 = new String("Hello");
		
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2	);
		
		
		// 문자열 비교 (str1 == str2) : 동등비교 
		if(str1 == str2) {
			System.out.println("str1, str2 주소값 같다.");
		}else {
			System.out.println("str1, str2 주소값 다르다.");
		}
		
		// 자바 문자열 비교 --> equals !!!
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열 같다.");
		}else {
			System.out.println("str1, str2 문자열 다르다.");
		}
		
		// 문자열 길이       0부터 시작
		String message = "Hello,Korea";               // 메서드 
		System.out.println("message 길이 : " + message.length());
		
		// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		
		System.out.println("1번째 문자 : " + c1);
		System.out.println("7번째 문자 : " + c2);
		
		// 문자열 자르기
		String sub1 = message.substring(0, 5);
		String sub2 = message.substring(6);
		
		System.out.println("문자열 1번에서 6번까지 : " + sub1);
		System.out.println("문자열 6번에서 마지막까지 : " + sub2);
		
		// 문자열 인덱스
		int idx1 = message.indexOf("e"); // 앞에서부터 
		int idx2 = message.lastIndexOf("e");
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		// 문자열 분리
		String[] result = message.split(","); // 반환타입이 [] 배열
		
		for(String str : result) {
			System.out.println("str : " + str);
		}
		
		// 문자열 교체
		String rs1 = message.replace("Korea", "Busan");
		String rs2 = message.replace("Hello", "Welcome");
		
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		
		// 문자열 반환
		int 	var1 = 1;
		double  var2 = 3.14;
		boolean var3 = true;
		
		                  // 클래스 타입으로 직접 호출 : 정적 메서드 static method
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3; // 빈문자열 로 해주면 : 문자열이 됨
		          
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		
	}
}























