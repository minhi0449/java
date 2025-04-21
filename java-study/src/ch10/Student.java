package ch10;

public class Student {

    String name; // 이름
    int money;   // 소지금

    // 매개변수 2개를 받는 생성자를 만들어 보자.
    // 생성자 : 학생 객체를 만들 때, 이름과 가진 돈을 함께 설정
    public Student(String n, int m){
        name = n;
        money = m;
    }

    // 학생이 버스를 탄다. - 버스를 타는 메서드
    // 버스에 요금을 내고, 내 소지금에서 차감한다
    public void takeBus(Bus bus){
        bus.take(1000); // 버스에 1000원을 낸다.
        // 버스에 천원을 내고, 내 멤버 변수 money (천원을 빼자)
        money = money - 1000; // 내 돈에서 1000원 빠짐
    }

    // 학생이 지하철을 탄다. - 지하철 타는 메서드
    public void takeSubway(Subway subway){
        subway.take(1000); // 지하철에 1000원 낸다.
        money -= 1000; // 내 돈에서 1000원 빠짐
        // 지하철에 천원을 내고, 내 멤버 변수 money (천원을 빼자)
    }

    // 학생의 상태창을 보여준다. - 학생의 현재 상태 출력
    public void showInfo() {
        System.out.println();
        System.out.println("***** 학생 상태창 *****");
        System.out.println("학생 이름 : " + name);
        System.out.println("학생 소지금 : " + money);
        System.out.println();
    }
}
