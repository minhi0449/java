package sub02;

import java.util.ArrayList;
import java.util.List;

/*
 * Iterator 패턴 기본개념 학습
 * 
 * Iterator 란?
 * - 컬렉션의 요소들을 하나씩 차례대로 접근하는 방법을 제공하는 객체
 * - 비유 : 도서관 책을 한 권씩 차례대로 읽어주는 도서관 사서
 * 
 * 왜 Iterator 가 필요할까?
 * - 컬렉션의 내부 구조를 몰라도 요소에 접근 가능
 * - 통일된 방법으로 모든 종류의 컬렉션 순회 가능
 * - 안전한 순회 (동시 수정 문제 방지)
 */
public class Iterator {
	public static void main(String[] args) {
		// 학생 명단 리스트 생성
		List<String> students = new ArrayList<String>();
		
		students.add("김유신");
		students.add("김춘추");
		students.add("장보고");
		students.add("강감찬");
		students.add("이순신");
		
		System.out.println("학생 명단 : " + students);
		
		// Iterator 객체 생성
		// 비유 : 명단을 읽어줄 도우미 선생님 부르기
		java.util.Iterator<String> iterator = students.iterator();
		
		System.out.println("\n---- Iterator 로 명단 읽기 ----");
		
		// hasNext(): 다음 요소가 있는지 확인
		// next(): 다음 요소를 가져오고 포인터를 다음으로 이동
		while(iterator.hasNext()) {
			String student = iterator.next();
			System.out.println("출석 : " + student);
		}
		
		// 주의 : Iterator 는 한 번 사용하면 끝!
		// 다시 사용하려면 새로 생성해야 함
		System.out.println("\n---- 같은 Iterator 로 다시 시도 ----");
		if(iterator.hasNext()) {
			System.out.println("아직 남은 학생이 있어요!");
		} else {
			System.out.println("더 이상 읽을 학생이 없어요 ! (Iterator 소진됨)");
		}
		
		// 새로운 Iterator 생성해서 다시 순회
		System.out.println("\n--- 새로운 Iterator 로 다시 읽기");
		java.util.Iterator<String> newIterator = students.iterator();
		int count = 0;
		
		while(newIterator.hasNext()) {
			count++;
			String student = newIterator.next();
			System.out.println(count + "번째 : " + student);
		}
		System.out.println();
	}
}
