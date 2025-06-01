package thisex;

// 생성자에서 다른 생성자를 호출하는 this (p.86)
// this 로 다른 생성자 호출하기
class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1); // this 를 사용해 Person(String, int) 생성자 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnItSelf(){
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf();
        System.out.println(p);
        System.out.println(noName);
    }
}
