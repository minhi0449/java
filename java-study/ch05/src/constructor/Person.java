package constructor;

// 생성자 만들기
public class Person {
    String name;
    float height;
    float weight;

    public Person() {} // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자
    // 따로 생성자를 만들지 않아도 자동으로 디폴트 생성자가 만들어집니다.

    public Person(String pname){
        name = pname; // 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
    }

}
