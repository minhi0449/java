package hiding;

public class Student {
    int studentID;
    private String studentName; // studentName 변수를 private 로 선언
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
