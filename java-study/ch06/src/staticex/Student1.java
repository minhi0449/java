package staticex;

// static 변수 사용하기
public class Student1 {
    // static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
    public static int serialNum = 1000;

    // 인스턴스 변수들 - 각 객체마다 개별적으로 생성
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1(){
        serialNum++;            // 학생이 생성될 때마다 증가
        studentID = serialNum;  // 증가된 값을 학번 인스턴스 변수에 부여
    }

    // getter 메서드 - studentName 값 반환
    public String getStudentName(){
        return studentName;
    }

    // setter 메서드 - studentName 값 설정
    public void setStudentName(String name){
        studentName = name;
    }

}
