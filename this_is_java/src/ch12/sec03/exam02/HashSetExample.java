package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet(); // HashSet 컬렉션 생성
		
		Student s1 = new Student(1, "홍길동"); 
		hashSet.add(s1); // HashSet 에 Student 객체 저장
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동"); 
		hashSet.add(s2); // HashSet 에 Student 객체 저장
		System.out.println("저장된 객체 수 : " + hashSet.size());
	
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3); // HashSet 에 Student 객체 저장
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		/*
		   [출력 결과]
		   저장된 객체 수 : 1
		   저장된 객체 수 : 1  <---- 동등 객체는 중복 저장 되지 않음 
		   저장된 객체 수 : 2
		 */
		
	}
}
