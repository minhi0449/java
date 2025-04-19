package ch07;

// 학생 클래스를 설계하는 코드 측
public class Student {

    // 속성(상태)
    int studentId;
    String studentName;
    String address;

    // 행위
    public void study(){
        int a;
        System.out.println("studentName : " + studentName + "이 공부를 합니다.");
    }

    public void breakTime(){
        System.out.println(studentName + "이(가) 휴식을 합니다.");
    }

    public void showInfo(){
        System.out.println("-------- 상태창 --------");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studentName);
        System.out.println("학생 주소 : " + address);
    }

    // 메서드란?
    // 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
    // 메서드는 멤버 메서드라고 부르기도 한다.
    // !! 메서드는 함수와 다르게 ** 멤버 변수를 활용해서 기능을 구현한다. **

    // 함수와 메서드를 구분해서 부르자.

    // 연습문제
    // 1. 시험을 친다. 메서드 만들기
    public void takeExam() {
        System.out.println(studentName + "이(가) 시험을 봅니다.");
    }

    // 2. 청소를 한다. 메서드 만들기
    public void cleanUp(){
        System.out.println(studentName + "이(가) 청소를 합니다.");
    }

}
