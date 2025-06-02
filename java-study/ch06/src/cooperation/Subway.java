package cooperation;

// 지하철 클래스 구현하기
public class Subway {
    String lineNumber;  // 지하철 노선
    int passengerCount; // 승객 수
    int money;          // 수입액

    // 지하철 노선 번호를 매개변수로 받는 생성자
    public Subway(String lineNumber){
        this.lineNumber = lineNumber;
    }

    // 승객이 지하철에 탄 경우를 구현한 멤서드
    public void take(){
        this.money += money;
        passengerCount++;
    }
}
