package access;

// Bank 클래스를 설계하는 측 코드 (우리가 설계)
// 계좌
public class Bank {

    // ** 접근 제어 지시자 (public, default, private)

    // public
    // name 변수는 누구나 어디에서든 접근해서 사용할 수 있다.
    public String name;

    // default
    // 같은 패키지  내에서만 접근할 수 있다.
    int balance;

    // private
    // 같은 클래스 안에서만 접근할 수 있다.
    private String number;

    public void showInfo(){
        System.out.println("현재 계좌 번호는 : " + number + " 입니다 !");
    }

}
