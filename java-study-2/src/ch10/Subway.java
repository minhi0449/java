package ch10;

public class Subway {

    int lineNumber; // 지하철 호선 번호 (예: 1호선, 2호선)
    int count;      // 지하철에 탄 승객 수
    int money;      // 지하철 수익금

    // 생성자 (Constructor)
    public Subway(int number){
        lineNumber = number; // 지하철 호선 번호 설정
    }

    // 승객을 태우다. - 승객을 태우는 메서드
    public void take(int pay){
        money += pay; // 요금을 더함
        count++;      // 승객 수 증가
    }

    // 현재 지하철 상태 출력
    public void showInfo(){
        System.out.println("- - - - 지하철 상태창 - - - -");
        System.out.println("지하철 호선 : " + lineNumber);
        System.out.println("지하철 승객 수 : " + count);
        System.out.println("지하철 수익금 : " + money);
        System.out.println();
    }

}
