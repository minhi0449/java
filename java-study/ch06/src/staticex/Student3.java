package staticex;

// 나 혼자 코딩
// static 변수와 static 메서드 연습하기
public class Student3 {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;
    int cardNumber;

    public Student3(){
        serialNum++;
        studentID = serialNum;
        cardNumber = studentID + 100;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        // studentName = "aaa"; // Error
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

}
