package ch06.sec04;

/*
    2025.02.26 (수)
 */
public class StudentExample {

    public static void main(String[] args) {
        // 실행 클래스 main() : 메소드를 가지고 있는 실행 가능한 클래스
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
