package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		Iterator<String> iterator = set.iterator();
		
		// 객체를 하나씩 가져와서 처리
		while(iterator.hasNext()) {
			// 객체를 하나씩 가져오기
			String element = iterator.next();
			System.out.println(element);
			
			if(element.equals("JSP")) {
				// 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		// 객체 제거
		set.remove("JDBC");
		
		for(String e : set) {
			System.out.println(e);
		}
		
	}
}
