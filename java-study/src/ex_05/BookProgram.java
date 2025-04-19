package ex_05;

public class BookProgram {

    public static void main(String[] args) {

        Book bookBox1 = new Book();
        Book bookBox2 = new Book();

        // 값이 아니라 주소값이 담기는 상자를 세분화 해서 부르면
        // 레퍼런스 변수(Reference Variable), 참조 변수라고 합니다.

        System.out.println("bookBox1 : " + bookBox1); // 변수명을 통해서 다시 호출할 수 있음
        System.out.println("bookBox2 : " + bookBox2);

        // 객체 = 메모리에 생성된 실제 데이터
        // 변수 = 그 객체를 가리키는 주소(참조)

        // 변수는 그 객체 자체를 저장하지 않습니다.
        // 대신, 그 객체가 메모리의 어디에 있는지 주소값을 기억합니다.
        // 이걸 참조 (reference) 라고 합니다.

        // 예를 들어 Book bookBox1 = new Book();
        // 이때 bookBox1은 새로 만든 Book 객체가 있는 주소를 기억하고 있는 참조변수 입니다.

        // System.out.println("bookBox1 : " + bookBox1);
        // -> 객체 자체가 아닌, 객체의 위치 정보(주소)를 출력합니다.



    }
}
