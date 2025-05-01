package ch10;

// 객체지향이란?
// 객체와 객체 간의 관계를 형성하고 상호작용하게 코드를 작성하는 것
public class Bus {

    int busNumber; // 버스 호선 (예: 68번, 87번)
    int count;     // 버스 승객 수 (버스에 탄 승객 수)
    int money;     // 버스 수익금 (승객에게 받은 총 요금)

    // 생성자 (Constructor)
    // 버스를 만들 때, 번호를 지정해서 생성한다.
    public Bus(int number){
        busNumber = number; // 생성된 버스의 번호 설정
        // 객체 생성 시에 제일 먼저 실행되는 부분
    }

    // 승객을 태우다. - 승객을 태우는 메서드
    public void take(int pay){
        // money = money + pay;
        money += pay; // 받은 요금 누적
        count++;      // 승객 1명 증가
    }

    // 현재 버스 상태 - 출력 메서드
    public void showInfo(){
        System.out.println("- - - - 버스 상태창 - - - -");
        System.out.println("버스 호선 : " + busNumber);
        System.out.println("버스 승객 수 : " + count);
        System.out.println("버스 수익금 : " + money);
        System.out.println();
    }

}
