package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// Board 객체들을 담을 리스트 만들기
		List<Board> list = new ArrayList<Board>();
		
		// 리스트에 Board 객체 5개 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 저장된 총 객체 수 얻기
		// 리스트에 들어 있는 Board 개수 구하기
		int size = list.size();
		System.out.println("총 게시글 수 : " + size);
		
		// 특정 인덱스의 객체 가져오기
		// 세 번째 Board 객체 가져와서 출력
		Board board = list.get(2);
		System.out.println("3번쨰 게시글 : " + board);
		// Board 객체 참조 → toString() 메서드 자동 호출 → 미리 정의된 형식으로 출력
		
		System.out.println(board); // toString() 내용 출력됨
		
		// 모든 객체 한 개씩 가져오기
		// 리스트 전체 순회하며 Board 내용 출력
		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			// Board 객체 참조 → getter 메서드들 개별 호출 → 각 필드값을 직접 조합해서 출력
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}

		System.out.println();
		
		// 세 번쨰 Board 객체 삭제
		list.remove(2);
		
		// 향상된 for 문으로 남은 객체 출력
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}
