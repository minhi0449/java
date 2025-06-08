package classpart;

// 참조 값 출력하기
public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "안연수";

        Student student2 = new Student();
        student2.studentName = "안승연";

        System.out.println(student1);
        System.out.println(student2);
        /*
            [출력 내용]
            클래스 이름@주소 값
            classpart.Student@7a81197d
            classpart.Student@5ca881b5

            여기에 나오는 주소 값은 다른 말로 해시 코드(hash code) 값이라고도 합니다ㅣ.
            이 값은 자바 가상 머신에서 객체가 생성되었을 때, 생성된 객체에 할당하는 가상 주소 값
            student1 변수를 사용하여 student1 인스턴스를 참조할 수 있음
            이때, student1을 참조 변수, 주소 값을 참조 값이라고 합니다.
         */

    }
}
