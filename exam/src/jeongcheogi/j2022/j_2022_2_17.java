package jeongcheogi.j2022;
// 클래스/생성자/인스턴스 필드 + for 반복문 + 스코프(scope)
public class j_2022_2_17 {
	int a;
	
	public j_2022_2_17(int a) {
		this.a = a; // this.a(필드) = a(매개변수). 들어온 값을 이 객체의 필드 a에 저장
	}
	
	int func() {
		int b = 1; // 지역 변수
		for(int i = 1; i < a; i++) {
			b = a * i + b;
		}
		return a + b;
	}
	
	public static void main(String[] args) {
		// 객체 생성 : 생성자 인수 3으로 시작 --> 내부적으로 a 가 3으로 설정
		j_2022_2_17 obj = new j_2022_2_17(3);
		
		// a 를 5 로 변경
		obj.a = 5;
		
		// func() 호출 : 현재 a = 5 기준으로 b 를 누적 계산한 뒤 (a + b)를 리턴
		int b = obj.func(); // 여기서 b 는 main 의 지역변수. func 내부 b 와는 다른 변수
		System.out.println(obj.a + b);
	}
	
}
