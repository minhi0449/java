package staticex;

// 클래스 메서드와 인스턴스 변수
public class Student2 {
    private static int serialNum = 1000; // private 변수로 변경
    int studentID;
    String studentName;
    int grade;
    String address;

    // serialNum 의 get() 메서드(클래스 메서드)
    public static int getSerialNum(){
        // 내부에서 선언한 변수 : 지역 변수
        int i = 10; // 지역 변수는 메서드가 호출될 때 메모리에 생성되어 메서드가 끝나면 사라지는 변수
        // studentName = "이지원"; // 오류 발생
        return serialNum; // static 변수 --> 클래스 메서드인 getSerialName() 메서드 내부에서도 사용할 수 있습니다.
    }

}
