package oop1;

public class Student {

    private String name;  // 학생 이름을 저장하는 변수
    private int money;    // 학생이 가진 돈을 저장하는 변수

    // 생성자
    public Student(String name, int money){
        this.name = name;   // 객체가 생성될 때, 이름 초기화
        this.money = money; // 객체가 생성될 때, 돈 초기화
        // this 는 현재 객체 자신을 가리키는 키워드 입니다.
        // 비유 : '내 이름은 ○○이고, 내 돈은 △△원이야' 라고 자기소개 하는 것과 같습니다.
    }

    // 핵심 !! 버스랑 어떻게 상호 작용 시킬까?
    public void takeBus(Bus bus){
        System.out.println("Student() - takeBus() 메소드 1");
        bus.take(1500); // 버스에 1,500원을 지불하고 탑승
        System.out.println("Student() - takeBus() 메소드 2");
        this.money -= 1500;    // 학생의 돈에서 1,500원 차감
        System.out.println("Student() - takeBus() 메소드 3");
    }

    /*
        takeBus 메소드: 학생이 버스를 타는 행동을 정의한 메소드
        bus.take(1500) : 버스 객체의 take 메소드를 호출하여 1500원을 지불한다는 의미
        this.money -= 1500 : 학생의 돈에서 1500원을 차감하는 코드
        버스비를 내고 난 후 자신의 지갑에서 1500원을 꺼내는 것과 같습니다.

     */

    public void showInfo() {
        System.out.println("- Student() - showInfo : 상태창 -");
        System.out.println("학생 이름 : " + name);
        System.out.println("학생 소지금 : " + money);
    }


}
