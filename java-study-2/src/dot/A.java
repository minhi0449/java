package dot;

// A 클래스 : 최상위 객체, 내부에 B 객체를 가짐
public class A {

    // A 클래스는 B 타입의 필드 b를 가짐 (B는 A의 구성요소)
    B b;

    // 생성자 (인스턴스 화 될 때 - 제일 먼저 수행하는 코드이다.)
    // A 의 생성자 - 객체가 생성될 때 자동 호출
    public A(){
        System.out.println("여기는 class A -> A 생성자 호출");

        // B 객체도 생성하여 b에 넣어줌
        b = new B();
    }

    /*
        Class 클래스 = 설계도
        Instance 인스턴스 = 설계도로 만들어진 실제 물건
        Instantiation 인스턴스화 = 설계도(class) 를 보고 실제 물건을 (Instance) 만드는 행위

        [설계도 : A 클래스]
             |
             |   new A()   <-- 인스턴스 화
             ⌄
        [실제 자동차 : a1 객체]

        ** 인스턴스 화 : 클래스를 기반으로 실제 객체를 만드는 과정
        자바에서는 new 클래스명() 을 통해 이루어짐
     */

}
