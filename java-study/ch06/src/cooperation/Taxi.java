package cooperation;

// 나 혼자 코딩
// 택시 타는 과정 추가로 구현
/*
    Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다.
    택시 요금은 10,000원을 지불했습니다.
 */
public class Taxi {
    int taxiNum;
    int passengerCount;
    int money;

    public Taxi(int taxiNum){
        this.taxiNum = taxiNum;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("택시 " + taxiNum + " 승객은 " + passengerCount + " 명이고, 수입은 '" + money + "' 입니다.");
    }

}
