package access;

public class AccessTest {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10_000); // 입금
        account.withdraw(6_000); // 출금
        account.showInfo();
        // 현재 계좌 잔액은 : 4000 입니다.

        // 접근 제어지시자 문법, 왜 사용하는가?

        // 신입 개발자가 실수로 메서드를 통해서 코드를 작성한 게 아니라.
        // 바로 멤버 변수에 접근해서 수정하는 코드를 작성해 버렸다.
        // account.balance = 10_000; // 입금 명령어 ! 작성했다 ! 본인 생각 !!!
        account.showInfo();
        // 실수할 수 있는 가능성이 있다. !!
        // balance 변수를 외부에서 안 보이게 접근 차단해 보자.
        // private 를 선언해서 외부에서 접근 차단

        // 외부에서 오직 출금 기능, 입금 기능 메서드로만 사용이 가능해 진다.

        // >>> 현재 잔액 <<<  <--- 출력하고 싶어.
        // int n1 = account.balance;


    }
}
