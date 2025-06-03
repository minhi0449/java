package singleton;

public class Car {
    // static : 클래스 레벨 변수 - 모든 Car 객체가 공유하는 변수
    // static 변수는 메모리에 딱 하나만 존재
    // 모든 Car 객체가 이 하나의 serialNum 을 공유
    private static int serialNum = 10000;
    private int carNum; // 각 자동차의 고유 번호를 저장할 변수
                        // 이 변수는 static 이 아니므로 각 Car 객체마다 독립적으로 존재

    public Car() {
        serialNum++;
        // serialNum 값을 1 증가시킴 (10000 --> 10001 --> 10002 ...)
        // 이는 새로운 자동차가 만들어질 때마다 번호가 증가함을 의미 / Increment (증가)

        carNum = serialNum;
        // 현재 증가된 serialNum 값을 이 자동차의 carNum 에 할당
        // 각 자동차는 고유한 번호를 갖게 됨
    }

    // carNum 값을 반환하는 메서드
    public int getCarNum() {
        return carNum;
    }

    // carNum 값을 설정하는 메서드
    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
