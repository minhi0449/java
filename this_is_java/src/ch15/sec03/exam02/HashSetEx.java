package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("저장된 객체 수 : " + set.size());
		// [출력 결과] 
		// 저장된 객체 수 : 1
	}
}
