package dot;

// A 내부에 들어가는 객체, 내부에 C 객체를 가짐
public class B {

    // B 클래스는 C 타입의 필드 c를 가짐 (C는 B의 구성요소)
    C c;

    // 생성자
    // B의 생성자 - A 생성자에서 B가 생성될 때, 자동 호출됨
    public B() {
        System.out.println("여기는 public B() -> B 생성자 호출");
        // 무언가 코드를 작성해야 해 !
        // C 객체도 생성하여 c 에 넣어줌
        c = new C();
    }

}
