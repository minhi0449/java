package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("person.name : " + person.name);
		person.walk();
		
		if(person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		} // person 이 참조하는 객체가 student 타입일 경
		
		// 매개값이 student 일 경우
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	} // end personExample
	
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
	
}
