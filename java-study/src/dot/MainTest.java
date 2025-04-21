package dot;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("코드의 진입점 ↓ ↓ ↓");
        System.out.println("여기는 MainTest -> . 연산자의 여행 !!! (도트 연산자의 여행) "); // 도트 연산자의 여행

        // A 객체를 생성합니다. 생성자에서 B도 함께 생성됩니다.
        A a1 = new A();
        System.out.println("-------------------------------------");
        System.out.println("여기는 MainTest -> A 객체 생성");

        // A 내부의 B --> 그 내부의 C --> 그 안의 callFinal 메서드를 호출
        a1.b.c.callFinal(); // 여기까지 도달하면 모든 연결이 잘 된 것 !
        System.out.println("여기는 MainTest ->  a1.b.c.callFinal() 호출 완료");
    }

}
