package ch10;

// 객체지향이란?
// 객체와 객체 간의 관계를 형성하고 상호작용하게 코드를 작성하는 것
public class Bus {

    int busNumber; // 버스 호선
    int count;     // 버스 승객 수
    int money;     // 버스 수익금

    // 생성자
    public Bus(int number){
        busNumber = number;
        // 객체 생성 시에 제일 먼저 실행되는 부분
    }

    // 승객을 태우다.
    public void take(int pay){
        // money = money + pay;
        money += pay;
        count++;
    }

    public void showInfo(){
        System.out.println("- - - - 상태창 - - - -");
        System.out.println("버스 호선 : " + busNumber);
        System.out.println("버스 승객 수 : " + count);
        System.out.println("버스 수익금 : " + money);
    }

}
