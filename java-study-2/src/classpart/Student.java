package classpart;

// 학생 클래스 만들기
public class Student {
    // 멤버 변수
    int studentID;      // 학번
    String studentName; // 학생 이름
    int grade;          // 학년
    String address;     // 사는 곳

    public void showStudentInfo(){
        System.out.println(studentName + "," + address); // 이름, 주소 출력
    }

    // 학생의 이름을 반환하는 메서드
    public String getStudentName(){
        return studentName;
    }

    // 학생 이름을 부여하는 메서드
    public void setStudentName(String name){
        studentName = name; // 학생 이름을 매개변수로 전달
    }

    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안승연";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }

}
