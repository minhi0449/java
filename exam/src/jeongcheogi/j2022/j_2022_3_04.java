package jeongcheogi.j2022;

// 2023년 3회 기출문제 4번
// 배열 순위 구하기 문제
public class j_2022_3_04 {
	public static void main(String[] args) {
		// 각 요소의 순위를 지정할 배열 선언 (크기 : 5)
		int[] result = new int[5];
		
		// 순위를 구할 원본 데이터 배열 (79, 34, 10, 99, 50)
		int[] arr = {79, 34, 10, 99, 50};
		
		// 외부 반복문 : 각 요소의 순위를 구하기 위해 0 ~ 4번째까지 순회
		for(int i = 0; i < 5; i++) {
			// 기본 순위를 1로 초기화 (나보다 큰 수가 없다면 1등)
			result[i] = 1;
			
			// 내부 반복문 : 현재 요소(arr[i])를 모든 요소와 비교
			for(int j = 0; j < 5; j++) {
				// 만약 다른 요소(arr[j])가 현재 요소(arr[i])보다 크다면
				if(arr[i] < arr[j]) {
					// 현재 요소의 순위를 1 증가 (더 뒤 순위로 밀림)
					result[i]++;
				}
			}
		}
		
		// 결과 출력 : 각 요소의 순위를 연속으로 출력
		for(int k = 0; k < 5; k++) {
			System.out.print(result[k]);
		}
		
		/*
		 * 출력결과 : 24513
		 */
	}
}
