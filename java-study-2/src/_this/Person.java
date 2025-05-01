package _this;

/*
    this 란?
    1. 인스턴스(객체) 자신의 메모리를 가리킨다.
    2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
    3. 자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.
 */
// 클래스 설계하는 측 코드
public class Person {

    // this 에 3가지 사용법이 존재한다.
    // 1. 자기 자신의 주소를 가리킨다.
    // 2. 생성자에서 다른 생성자를 호출할 때, 사용할 수 있다.
    // 3. 자신의 줏조를 반환 시킬 수 있다.

    // 사람의 기본 정보 : 이름, 나이, 전화번호, 성별을 저장할 공간
    private String name;
    private int age;
    private String phone;
    private String gender;

    // 첫 번째 생성자 사용 방법 this.
    // 1. 사용 방법 (문법, 왜)
    public Person(String name, int age) {
        // 매개변수 = 매개변수
        // 멤버변수 = 매개변수
        this.name = name; // 이 클래스의 name 에 전달받은 name 을 저장 (this 는 '나 자신')
        this.age = age;
        System.out.println("1번 생성자 호출됨");
    }

    // 2. 사용방법 this();
    // this 는 생성자에서 다른 생성자를 호출할 수 있다.
    public Person(String name, int age, String phone){
        // this.name = name;
        // this.age = age;
        this(name, age);
        this.phone = phone;
        System.out.println("2번 생성자 호출됨");
    }

    public Person(String name, int age, String phone, String gender) {
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
        this(name, age, phone);
        this.gender = gender;
        System.out.println("3번 생성자 호출됨");
    }
}
