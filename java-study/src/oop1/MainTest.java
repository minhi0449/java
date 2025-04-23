package oop1;

public class MainTest {

    public static void main(String[] args) {

        // "김복남"이라는 이름과 10,000원을 가진 학생 객체 생성
        Student s1 = new Student("김복남", 10_000);
        Bus bus1 = new Bus(202); // 202번 버스 객체 생성
        Bus bus2 = new Bus(415); // 415번 버스 객체 생성

        // 학생(s1)이 415번 버스(bus2)를 탑승
        s1.takeBus(bus2);

        s1.showInfo();
        System.out.println("------------");
        bus2.showInfo();

    }
}
