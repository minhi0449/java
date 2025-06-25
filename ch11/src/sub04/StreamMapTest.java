package sub04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 날짜 : 2024/07/23
 * 이름 : 김민희
 * 내용 : 자바 스트림 맵 실습하기
 */
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class StreamMapTest {
	public static void main(String[] args) {
		// 사람들을 저장할 리스트 생성
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		// Map Stream
		// 스트림을 이용해서 사람들 중 이름만 뽑아서 리스트로 저장
		List<String> names = people
				.stream() // 새로운 데이터 변환해서 다음 스트림으로 전달
				.map(t -> t.getName()) // (person) -> {return person.getName();}
				// 각 사람에서 이름만 추출
				.collect(Collectors.toList()); // 스트림으로 전송된 데이터를 취합해 컬렉션으로 변환
				// 결과를 리스트로 수집
		
		System.out.println("names : " + names);
		
		// FlatMap Stream
		// 2차원 배열
		List<List<String>> lists = List.of(
				Arrays.asList("apple", "banana"),
				Arrays.asList("cherry", "grape"),
				Arrays.asList("orange", "mango")
				);
		
		System.out.println(lists); // 2차원 리스트 출력
		
		// 2차원에서 1차원으로
		List<String> fruits = lists.stream()
				.flatMap(list -> list.stream()) // lists 의 list 를 나열시킴
				// 각 내부 리스트를 스트림으로 변환 후 펼침
				.collect(Collectors.toList()); // 하나의 리스트로 수집
		
		System.out.println(fruits); // 과일 리스트 출력
	}
}







