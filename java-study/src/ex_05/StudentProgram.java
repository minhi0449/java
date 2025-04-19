package ex_05;

public class StudentProgram {

    // 코드의 시작점 (메인 메소드)
    public static void main(String[] args) {
        int grade = 10;
        String name = "홍길동";

        Student studentKim = new Student(); // 클래스를 인스턴스화 (메모리에 올림)
        Student studentLee = new Student();

        System.out.println("grade : " + grade);
        System.out.println("name : " + name);
        System.out.println("studentKim : " + studentKim);
        System.out.println("studentLee : " + studentLee);
    }
}
