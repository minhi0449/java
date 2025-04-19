package ch10;

public class Subway {

    int lineNumber;
    int count;
    int money;

    // 생성자
    public Subway(int number){
        lineNumber = number;
    }

    // 승객을 태우다.
    public void take(int pay){
        money += pay;
        count++;
    }

    public void showInfo(){
        System.out.println("- - - - 상태창 - - - -");
        System.out.println("지하철 호선 : " + lineNumber);
        System.out.println("지하철 승객 수 : " + count);
        System.out.println("지하철 수익금 : " + money);
    }

}
