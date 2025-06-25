package sub03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2024/07/22
 * 이름 : 김민희
 * 내용 : 자바 스트림 필터 실습하기
 */
public class StreamFilterTest {
	public static void main(String[] args) {
		// List 생성
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println("nums : " + nums);
		
		// 중복 제거
		nums.stream().distinct().forEach(num ->
			System.out.print(num + ", "));
		
		System.out.println();
		
		// 5 이상 데이터 필터
		nums.stream()
			.filter(num -> {
				if(num >= 5) {
					return false;
				}
				return true;
			})
			.forEach(num -> System.out.print(num + ", "));
		
		System.out.println();
		
		nums.stream()
			.filter(t -> t < 5)
			.forEach(num -> System.out.print(num + ", "));
		
		System.out.println();
		
		// 중복 제거하고 짝수 데이터, 내림차순 정렬
		nums.stream()
			.distinct() // 중복 제거
			.filter(t -> t%2==0) // 짝수 데이터
			.sorted(Collections.reverseOrder()) // 내림차순 정렬
			.forEach(System.out::println);
	}
}
