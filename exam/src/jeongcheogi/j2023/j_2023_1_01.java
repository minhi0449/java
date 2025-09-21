package jeongcheogi.j2023;

// 2023년 1회 기출문제
// Static 과 Instance 변수의 차이를 보여주는 문제
class Static{
	public int a = 20; // 인스턴스 변수 : 각 객체마다 개별적으로 존재 (개인 공책)
	static int b = 0;  // 정적 변수 : 모든 객체가 공유하는 하나의 변수 (공용 칠판)
}

public class j_2023_1_01 {
	public static void main(String[] args) {
		// 1단계 : 지역변수 선언 및 초기화
		int a;  // 지역변수 a 선언 (main 메서드 내에서만 사용 가능)
		a = 10; // 지역변수 a 에 10 할당
		
		// 2단계 : static 변수에 값 할
		Static.b = a; // 클래스의 static 변수 b 에 지역변수 a 의 값(10) 할당
					  // 이제 Static.b = 10 이 됨	
		
		// 3단계 : 객체 생성
		Static st = new Static(); // Static 클래스의 새로운 인스턴스(객체) 생성
								  // st.a = 20 (클래스에서 정의한 초기값)
								  // st.b 는 여전히 Static.b와 같은 메모리 공간을 참조
		
		// 4단계 : 출력 및 결과 확인
		System.out.println(Static.b++); // Static.b 의 현재 값(10) 출력 후 1 증가 -> 출력 : 10
										// 이후 Static.b = 11 이 됨
		
		System.out.println(st.b);       // 객체를 통해 static 변수 접근 -> 출력 : 11
										// st.b와 Static.b는 같은 메모리 공간
		
		System.out.println(a);			// 지역변수 a 출력 -> 출력 : 10
										// static 변수와 무관하게 독립적
		
		System.out.println(st.a);		// 객체 st의 인스턴스 변수 a 출력 -> 출력 : 20
										// 각 객체마다 개별적으로 존재하는 변수
	}
}


/* 
 * 최종 출력 결과 : 
 * 10
 * 11
 * 10
 * 20
 * 
 * 핵심포인트 : 
 * 1. static 변수는 클래스 레벨에서 공유되는 하나의 변수
 * 2. instance 변수는 각 객체마다 개별적으로 존재
 * 3. 후위증가연산자(++)는 값을 먼저 사용한 후 증가
 * 4. 객체를 통해서도 static 변수에 접근 가능하지만, 실제로는 같은 메모리 공간
 */
