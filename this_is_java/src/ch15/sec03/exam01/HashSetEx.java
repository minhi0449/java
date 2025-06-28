package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		// HashSet Collection Creating
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // <-- 중복 객체 이므로 저장되지 않음
		set.add("Spring");
		
		// 저장된 객체 수 출력
		System.out.println("size : " + set.size());
	}
}
