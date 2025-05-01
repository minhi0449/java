package _static;

public class Card02 {

    // static 변수: 모든 Card 객체가 공유하며, 고유 번호를 생성하기 위해 사용할 수 있다.
    private static int cardCounter = 0;
    // 모든 카드가 공유하는 카드번호 카운터

    // 인스턴스 변수
    private final int cardId;
    private final String cardName;

    public Card02(String cardName) {
        this.cardId = ++cardCounter; // 카드가 만들어질 때마다 번호를 1 증가시키고 --> 그 번호를 카드에 붙임
        this.cardName = cardName;
    }

    // static 메서드
    public static int getCardCounter() {
        // static 메서드 안에서 인스턴스 변수를 사용할 수 있다.
        // 왜 ? 인스턴스 변수는 객체가 생성된 이후에 사용될 수 있기 때문이다.

        // System.out.println("cardName : " + cardName); // ❌ 오류
        // ↑↑↑ 이 줄은 static 메서드 안에서 인스턴스 변수(cardName) 를 사용하려 해서 오류남.
        // 왜냐면 ? 아직 객체가 없는데 객체 속 내용을 보려고 했기 때문


        // static 변수
        return cardCounter;
    }

    // 인스턴스 메서드 만들어 보자.
    public void showInfo() {
        System.out.println("cardCounter : " + cardCounter);
        System.out.println(cardName + " 에 고유 번호는 " + cardId + "입니다.");
    }

    // 메인 함수
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------- Card02() main 함수 호출 --------");

        // static 변수는 객체 생성 전에 사용가능
        // 사용하는 방법 (클래스의 이름으로 접근 가능하다.)
        System.out.println(Card02.cardCounter);
        // 인스턴스 메서드 일까? ---> static 메서드이다.
        // 그래서 객체 생성 전에 호출해 볼 수 있다.
        System.out.println(Card02.getCardCounter());

        // 코드 테스트는 여기서 해주세요.
        Card02 c1 = new Card02("우리카드1");
        System.out.println("c1.cardId : " + c1.cardId);

    }



}
