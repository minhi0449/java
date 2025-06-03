package staticex;

// 나 혼자 코딩
// static 변수와 static 메서드 연습하기
/*
    학생마다 각각 다른 학생 카드가 발급됩니다.
    학생 카드 번호는 학번에 100을 더한 값입니다.
    Student3 클래스를 만들어 학생 카드 번호 멤버 변수를 추가하고,
    학생이 생성될 때마다 학생 카드 번호를 부여합니다.
    StudentTest6 클래스를 만들어 학생 두 명을 생성합니다.
    두 학생의 카드 번호를 출력해 보세요.
 */
public class StudentTest6 {
    public static void main(String[] args) {

        Student3 studentKim = new Student3();
        System.out.println("김** : " + studentKim.studentID + ", 카드 번호 : " + studentKim.cardNumber);

        Student3 studentLee = new Student3();
        System.out.println("이** : " + studentLee.studentID + ", 카드 번호 : " + studentLee.cardNumber);


    }
}
