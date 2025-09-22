package jeongcheogi.j2023;

// 2023년 1회 기출문제 14번
// 중첩 반복문을 이용한 버블 정렬 알고리즘 구현 및 동작 원리 이해
public class j_2023_1_14 {
	/**
	 * swap 메서드 : 배열의 두 원소 위치를 바꾸는 메서드
	 * @param a		: 정렬할 배열
	 * @param idx1	: 첫 번째 인덱스 (바꿀 위치1)
	 * @param idx2	: 두 번째 인덱스 (바꿀 위치2)
	 */
	static void swap(int[] a, int idx1, int idx2) {
		// 임시 변수 t에 첫 번째 위치의 값을 저장 (컵 예시의 빈 컵 역할)
		int t = a[idx1];
		
		// 첫 번째 위치에 두 번째 위치의 값을 넣음
		a[idx1] = a[idx2];
		
		// 두 번째 위치에 임시 저장해둔 값을 넣음 (완전한 교환 완료)
		a[idx2] = t;
	}
	
	/**
	 * Usort 메서드 : 버블 정렬을 수행하는 메서드
	 * @param a	  : 정렬할 배열
	 * @param len : 배열의 길이 (원소 개수)
	 */
	static void Usort(int[] a, int len) {
		// 외부 반복문 : 전체 정렬 과정을 len 번 반복
		// i 번째 순회가 끝나면 뒤에서 i + 1 개의 원소가 정렬 완료됨
		for(int i = 0; i < len; i++) {
			
			// 내부 반복문 : 인접한 원소들을 차례로 비교
			// len-1-i 까지만 비교하는 이유:
			// 1) 매 순회마다 뒤에서 i 개는 이미 정렬됨 (len-i)
			// 2) j+1과 비교하므로 배열 범위 초과 방지
			for(int j = 0; j < len-i-1; j++) {
				
				// 현재 원소가 다음 원소보다 크면 (오름차순 정렬 기준)
				if(a[j] > a[j+1]) {
					// 두 원소의 위치를 바꿈 (큰 수를 뒤로 보냄)
					swap(a, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 정렬할 배열 초기화 (정렬 전 상태)
		int[] item =  {5, 4, 9, 1, 3, 7};
		
		// 배열의 크기 (원소 개수)
		int nx = 6;
		
		// 버블 정렬 실행 (배열과 크기를 매개변수로 전달)
		Usort(item, nx);
		
		// 정렬 결과 출력 (Enhanced for문 사용)
		// 배열의 모든 원소를 순차적으로 data 변수에 담아 처리
		for(int data : item) {
			// 각 원소를 공백과 함께 출력 (줄바꿈 없이)
			System.out.print(data + " ");
		}
		// 최종 출력 : 1 3 4 5 7 9
	}
	
}
