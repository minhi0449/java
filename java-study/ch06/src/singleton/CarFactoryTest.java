package singleton;

public class CarFactoryTest {
    public static void main(String[] args) {

        // 1. 유일한 CarFactory 인스턴스를 가져옴
        // getInstance()는 static 메서드이므로 클래스명.메서드명() 으로 호츌
        // 유일한 공장을 가져옴 (공장 자체는 새로 만들지 않음!)
        // 기존 공장 가져오기
        CarFactory factory = CarFactory.getInstance();

        // 2. 첫 번째 자동차 생성
        // factory.createCar() 호출 --> new Car() 실행 -->
        // serialNum 이 10001로 증가 --> carNum 에 10001 할당
        // 그 공장에서 첫 번째 자동차 제작 (새로운 Car 객체 생성!)
        // new Car() 실행 --> 새 자동차
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        // 각 자동차의 번호 출력
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());

    }
}
