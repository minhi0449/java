package ch09;

// 사용자 정의 생성자 (Overloaded Constructor) - 매개변수가 있는 생성자
// 사용자가 필요에 의해서 직접 생성자 코드를 넣어 주는 것을 말한다.
public class Bus {
    // 속성
    int busId;      // 버스 ID
    String busType; // 버스 종류 (시내버스, 고속버스)
    String company; // 운영 회사

    // 생성자가 여러가 있으면 생성자 오버로딩이라 한다.

    // 매개변수 1 받는 생성자
    public Bus(int id){
        busId = id;
    }

    public Bus(int id, String type){
        busId = id;
        busType = type;
    }

    public Bus(int id, String type, String com){
        busId = id;
        busType = type;
        company = com;
    }

    // 메서드
    public void showInfo(){
        System.out.println("- - - - 상태창 - - - -");
        System.out.println("버스 ID : " + busId);
        System.out.println("버스 type : " + busType);
        System.out.println("버스 company : " + company);
    }

    /*
        ✓ 생성자 (Constructor)는 클래스의 인스턴스,
        즉 객체를 생성할 때 호출되는 특별한 유형의 메서드입니다.
        객체의 초기화를 담당하며, 객체가 올바르게 사용될 수 있도록 필요한 값을 설정하고,
        필요한 초기화 코드를 실행합니다.

        [ 생성자의 주요 특징 ]
        • 생성자의 이름은 클래스의 이름과 동일해야 함
        • 생성자는 반환 타입을 가지지 않으며, 심지어 void 도 사용하지 않음
        • 객체 생성시 new 키워드와 함께 자동으로 호출됨
        • 생성자는 크기 기본 생성자와 사용자 정의 생성자로 구분할 수 있음

        ✓ 기본 생성자 (default constructor)
        • 클래스에는 반드시 적어도 하나 이상의 생성자가 존재한다.
        • 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
        • 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어줌
        • public Student(){}
     */
}
