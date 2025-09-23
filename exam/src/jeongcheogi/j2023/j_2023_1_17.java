package jeongcheogi.j2023;

// 2023년 1회 기출문제 17번
// 추상 클래스, 상속, 다형성, 메소드 오버로딩/오버라이딩

/**
 * Vehicle(탈것) - 추상 클래스
 * - 모든 탈것들이 가져야 할 공통 기능과 강제 구현사항을 정의
 * - abstract 키워드로 직접 객체 생성 불가
 * - 상속 전용 클래스 (템플릿 역할)
 */
abstract class Vehicle {
	// 인스턴스 변수 (객체마다 고유한 값을 저장)
	// 접근제한자 없음 = package-private (같은 패키지 내 접근 가능)
	String name; // 탈것의 이름을 저장할 변수
	
	/**
	 * 추상 메소드 (Abstract Method)
	 * - 선언만 있고 구현부({})가 없는 메소드
	 * - 자식 클래스에서 반드시 구현 해야 함 (강제성)
	 * - 각 탈것마다 다르게 구현될 수 있도록 강제
	 */
	abstract public String getName(String val);
	
	/**
	 * 일반 메소드 (구현된 메소드)
	 * - 매개변수가 없는 getName() 메소드
	 * - 메소드 오버로딩 : 위의 getName(String val)과 같은 이름은 같지만 매개변수가 다름
	 * - 상속 받은 자식 클래스들이 공통으로 사용할 수 있는 기본 기능
	 */
	public String getName() {
		return "Vehicle name : " + name; // 저장된 name 과 문자열을 연결해서 반환
	}
	
	/**
	 * Setter 메소드
	 * - name 변수에 값을 설정하는 메소드
	 * - 캡슐화 원칙에 따라 변수에 직접 접근하지 않고 메소드로 접근
	 */
	public void setName(String val) {
		name = val; // 매개변수로 받은 값을 인스턴스 변수 name 에 저장
	}
}

/**
 * Car(자동차) - Vehicle 을 상속받는 구체적인 클래스
 * - extends 키워드로 Vehicle 의 모든 것을 상속 받음
 * - Vehicle 의 추상 메소드를 반드시 구현해야 함
 */
class Car extends Vehicle {
	public Car(String val) {
		setName(val);
	}
	public String getName(String val) {
		return "Car name : " + val;
	}
	public String getName(byte val[]) {
		return "Car name : " + val;
	}
}

public class j_2023_1_17 {
	public static void main(String[] args) {
		// ★ 핵심: 다형성 (Polymorphism) 구현
        // 부모 타입(Vehicle) 참조변수로 자식 객체(Car) 참조
        // 업캐스팅: Car 객체가 자동으로 Vehicle 타입으로 변환됨
        Vehicle obj = new Car("Spark");
        
        // 데이터 흐름:
        // 1. new Car("Spark") 실행
        // 2. Car 생성자 호출: public Car(String val)
        // 3. 생성자 내부에서 setName("Spark") 호출
        // 4. 부모 클래스의 setName() 메소드 실행
        // 5. name 변수에 "Spark" 저장
        // 6. Car 객체 생성 완료
        // 7. 생성된 Car 객체를 Vehicle 타입 변수 obj가 참조
        
        // ★ 메소드 호출 및 실행 결과 분석
        // obj.getName() 호출 (매개변수 없음)
        System.out.println(obj.getName());
        
        // 메소드 결정 과정:
        // 1. obj는 Vehicle 타입이지만 실제로는 Car 객체를 가리킴
        // 2. getName() 호출 시 매개변수가 없음
        // 3. Car 클래스에는 매개변수 없는 getName()이 없음
        //    - getName(String val) 있음 (매개변수 1개)
        //    - getName(byte val[]) 있음 (매개변수 1개)
        // 4. 상속에 의해 부모 클래스 Vehicle 의 getName() 호출
        // 5. Vehicle 의 getName() 메소드 실행:
        //    return "Vehicle name : " + name;
        // 6. name 변수에는 생성자에서 설정한 "Spark"가 저장되어 있음
        // 7. 최종 결과: "Vehicle name : Spark" 반환
        // 8. System.out.println()으로 콘솔에 출력
        
        // 출력 결과 --> Vehicle name : Spark
	}
}
