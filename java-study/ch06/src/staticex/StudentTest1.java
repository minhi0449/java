package staticex;

// static 변수 테스트하기
public class StudentTest1 {
    public static void main(String[] args) {

        Student1 studentLee = new Student1();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        // static 변수 값 증가
        studentLee.serialNum++;

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손수경");

        // 증가된 값 출력
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);


    }
}
