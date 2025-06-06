package arraylist;

import java.util.ArrayList;

// Student 클래스 구현하기
public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    // 생성자
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    // 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
    public void addSubject(String name, int score){
        Subject subject = new Subject();    // Subject 생성하기
        subject.setName(name);              // 과목 이름 추가하기
        subject.setScorePoint(score);       // 점수 추가하기
        subjectList.add(subject);           // 배열에 저장하기
    }

    public void showStudentInfo() {
        int total = 0;
        // 배열 요소 값 출력
        for (Subject s : subjectList){
            total += s.getScorePoint(); // 총점 더하기
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 '" + s.getScorePoint() + "' 입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 '" + total + "' 입니다.");
    }

}
