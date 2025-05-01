package _static;

/*
    static - 키워드의 이해
    static 변수는 프로그래밍에서 중요한 개념 중 하나입니다.
    클래스 변수라고도 불리며, 클래스의 모든 인스턴스가 공유하는 변수입니다.
    즉, 객체가 동일한 static 변수의 값을 공유합니다.

    static 변수는, static 메서드는 객체 생성 없이 클래스 이름으로 바로 접근가능 하다.
    왜? heap 메모리에 들어가기 위해서는 new 키워드와 생성자를 호출한 뒤
    동작할 수 있지만 method area 영역은 프로그램을 실행시키면
    바로 메모리를 할당받아 실행되는 영역이기 때문이다.
 */

public class NumberPrinter {

    private int id;
    // 멤버 변수 (NumberPrinter 소속된 변수)
    // public int waitNumber;

    // waitNumber <-- 멤버 변수가 아니라 class area 영역에 포함된다.
    public static int waitNumber; // static 변수 선언(클래스 변수)

    public NumberPrinter(int id) {
        this.id = id;
        this.waitNumber = 1;
    }

    // 번호표를 출력합니다.
    public void printWaitNumber(){
        System.out.println(id + "기기에 대기 순번은 : " + waitNumber);
        waitNumber++;
    }

}
