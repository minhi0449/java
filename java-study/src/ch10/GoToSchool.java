package ch10;

public class GoToSchool {
    public static void main(String[] args) {
        // 교통수단 객체 생성
        Bus bus1 = new Bus(68);
        Bus bus2 = new Bus(87);
        Subway subway1 = new Subway(4);

        // 학생 객체 생성
        Student s1 = new Student("홍길동", 10000);
        Student s2 = new Student("김유신", 5000);

        // s1.showInfo();
        // bus1 -> 실제 값은 주소값이다.

        // 학생이 교통수단을 이용함
        s1.takeBus(bus1);       // 홍길동은 68번 버스를 탐
        s2.takeSubway(subway1); // 김유신은 4호선 지하철을 탐

        System.out.println("---------------");

        s1.showInfo();      // 홍길동 상태창
        s2.showInfo();      // 김유신 상태창
        bus1.showInfo();    // 버스 상태창
        subway1.showInfo(); // 지하철 상태창

        // 사전 기반 지식
        // 기본 데이터 , 참조 타입
        // int a; (값이 담긴다)
        // 대문자로 선언하는 데이터 타입은 (참조 타입이다)
        // Student s1; <--- s1 (주소값)
    }
}
