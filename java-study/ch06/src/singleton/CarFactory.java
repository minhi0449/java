package singleton;

// CarFactory : 자동차를 만드는 공장 클래스
public class CarFactory {
    // 데이터 타입 : CarFactory
    private static CarFactory instance = new CarFactory(); // 이 공장은 단 하나
    // Singleton 패턴의 핵심!
    // 클래스가 로딩될 때, 딱 하나의 객체만 생성됨

    // 외부에서 함부로 들어올 수 없게 막는 거
    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    public Car createCar(){
        Car car = new Car();
        return car;
    }

    /*
        생성자(Constructor) 란?
        • 정의: 객체를 만들 때 자동으로 호출되는 특별한 메서드
        • 역할 : 새로운 객체를 메모리에 생성하고 초기화하는 작업
        • 특징 : 클래스 이름과 동일하고, 반환 타입이 없음

        Java 의 객체 생성 규칙
        • Java 에서 새로운 객체를 만들 때는 반드시 생성자를 호출해야 합니다.
          이는 Java 의 절대적인 규칙
     */

}
