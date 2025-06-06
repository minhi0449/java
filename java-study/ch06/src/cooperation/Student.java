package cooperation;

// 학생 클래스 구현하기
public class Student {
    public String studentName;  // 학생 이름
    public int grade;           // 학년
    public int money;           // 학생이 가지고 있는 돈


    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }


    public void takeBus(Bus bus){
        bus.take(1000); // 버스에 1000원 요금 전달
        this.money -= 1000;    // 학생 돈에서 1000원 차감
    }

    public void takeSubway(Subway subway){
        subway.take(1500);   // 지하철에 1500원 요금 전달하도록 매개변수 추가
        this.money -= 1500;         // 학생 돈에서 1500원 차감
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo(){
        System.out.println("\n'"+ studentName + "' 님의 남은 돈은 '" + money + "' 입니다.");
    }
}
