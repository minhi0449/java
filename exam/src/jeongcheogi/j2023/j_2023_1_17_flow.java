package jeongcheogi.j2023;

// 실행 순서를 확인할 수 있게 번호를 붙인 버전

abstract class Vehicle2 {
    String name;
    
    // 추상 메소드 - 자식 클래스에서 구현 필수
    abstract public String getName(String val);
    
    // 일반 메소드 - 매개변수 없는 getName()
    public String getName() {
        System.out.println("🔥 [4단계] Vehicle의 getName() 메소드 실행 시작!");
        System.out.println("🔥 [5단계] name 변수 값 확인: " + name);
        
        String result = "Vehicle name : " + name;
        System.out.println("🔥 [6단계] 반환할 문자열 생성 완료: " + result);
        System.out.println("🔥 [7단계] Vehicle의 getName() 메소드에서 값 반환! (아직 출력 아님)");
        
        return result;  // 여기서는 출력이 아니라 값을 돌려줌!
    }
    
    // Setter 메소드
    public void setName(String val) {
        System.out.println("📝 [생성자-2] setName() 메소드 실행: " + val + "을(를) name에 저장");
        name = val;
        System.out.println("📝 [생성자-3] name 변수에 저장 완료! name = " + name);
    }
}

class Car1 extends Vehicle2 {
    
    // 생성자
    public Car1(String val) {
        System.out.println("🚗 [생성자-1] Car 생성자 실행 시작! 받은 값: " + val);
        setName(val);  // 부모 클래스의 setName() 호출
        System.out.println("🚗 [생성자-4] Car 객체 생성 완료!");
    }
    
    // 추상 메소드 구현 (매개변수 있는 버전)
    public String getName(String val) {
        System.out.println("🚗 Car의 getName(String val) 메소드 - 이건 호출되지 않을 예정");
        return "Car name : " + val;
    }
    
    // 메소드 오버로딩 (byte 배열 버전)
    public String getName(byte val[]) {
        System.out.println("🚗 Car의 getName(byte val[]) 메소드 - 이것도 호출되지 않을 예정");
        return "Car name : " + val;
    }
}

public class j_2023_1_17_flow {
    
    public static void main(String[] args) {
        System.out.println("🎬 [1단계] 프로그램 시작! main 메소드 실행");
        System.out.println("🎬 [2단계] new Car(\"Spark\") 실행 - Car 객체 생성 시작");
        
        // 다형성: 부모 타입으로 자식 객체 참조
        Vehicle obj = new Car("Spark");
        
        System.out.println("🎬 [3단계] Car 객체가 생성되고 Vehicle 타입 변수 obj가 참조 완료!");
        System.out.println("🎬 [3단계] 이제 obj.getName() 메소드를 호출할 예정...");
        System.out.println();
        System.out.println("==================================================");
        System.out.println("📞 이제 obj.getName() 호출!");
        System.out.println("==================================================");
        
        // 여기서 실제 메소드 호출 및 출력
        System.out.println(obj.getName());
        
        System.out.println("==================================================");
        System.out.println("🎉 [8단계] println()이 반환받은 값을 화면에 출력 완료!");
        System.out.println("🎉 [9단계] 프로그램 종료");
        
        System.out.println();
        System.out.println("💡 정리:");
        System.out.println("   - return은 값을 돌려주기만 함 (출력 아님)");
        System.out.println("   - println()이 받은 값을 실제로 화면에 출력함");
        System.out.println("   - Car 클래스에 매개변수 없는 getName()이 없어서");
        System.out.println("   - 상속에 의해 부모 Vehicle의 getName()을 호출함");
    }
}