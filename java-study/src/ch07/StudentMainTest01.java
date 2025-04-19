package ch07;

/*
    학습 목표
    · 메소드와 함수의 차이점을 이해한다.
    · 변수의 위치에 따라 지역변수와 멤버변수로 부를 수 있다.
    · 객체의 속성은 멤버 변수로 객체의 기능은 메서드로 구현한다.
 */

public class StudentMainTest01 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 1;
        s1.studentName = "학생1";
        s1.address = "부산진구";

        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "학생2";
        s2.address = "연제구";

        // 객체 동착 시켜보기
        s1.showInfo();
        s2.showInfo();
        System.out.println();
        s1.study();
        s2.study();
        System.out.println();
        s1.breakTime();
        s2.breakTime();
        System.out.println();
        s1.takeExam();
        s2.cleanUp();
        // 코드 (메서드 테스트)
    }
}