package thisex;

// this 출력하기
// 자신의 메모리를 가리키는 this
class BirthDay {
    int day;
    int month;
    int year;

    // 태어난 연도를 지정하는 메서드
    public void setYear(int year) {
        this.year = year; // bDay.year = year; 와 같음
    }

    // this 출력 메서드
    public void printThis(){
        System.out.println(this);
        // System.out.println(bDay); 와 같음
    }
}


public class ThisExample {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);         // 태어난 연도를 2000으로 지정
        System.out.println(bDay);   // 참조 변수 출력
        bDay.printThis();           // this 출력 메서드 호출
    }
}
