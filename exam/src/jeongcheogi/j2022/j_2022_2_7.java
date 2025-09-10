package jeongcheogi.j2022;
// switch 문 폴스루(fall-through)
public class j_2022_2_7 {
	public static void main(String[] args) {
		int i = 3;  // 입력값 역할 : switch 가 어떤 case 부터 실행할지 결정 (여기선 3)
		int k = 1;  // 결과를 만들어갈 변수. 아래 case 들을 거치며 값이 계속 변함
		
		switch(i) { // switch(스위치) : i 와 일치하는 case 레이블부터 "아래로" 실행
		case 0:		// case 0/1/2 는 실행문 없음 --> 도달 시 곧바로 다음 case 로 폴스루(연쇄 실행)
		case 1:
		case 2:
		case 3:  k = 0; 	 // i 가 3이므로 여기서 시작. k 를 0으로 재설정 (1 --> 0)
		case 4:  k += 3;	 // break 가 없으므로 폴스루: k 에 3 더하기 (0 --> 3)
		case 5:  k -= 10;	 // 폴스루 계속 : k 에서 10 뺴기 (3 --> -7)
		default: k--;		 // 폴스루 계쏙 : default 까지 실행, k -> 1 감소 (-7 --> -8)
		}
		System.out.print(k); // 최종 결과 출력 : -8
	}
}
