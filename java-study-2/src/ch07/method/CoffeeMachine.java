package ch07.method;

/*
    메서드 연습
    메서드 란? 객체에 소속된 함수로, 클래스의 상태(데이터)를 활용하거나 객체와 관련된
    작업을 처리할 때 사용한다.
 */

public class CoffeeMachine {

    // 속성 설계
    // 커피 머신의 상태 : 물과 커피 원두의 양
    int water;  // 물의 양(ml)
    int coffee; // 커피 원두의 양 (g)

    // 행위 설계
    // 메서드 1 : 물 채우기
    public void refillWater(int amount){
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml의 물을 채웠습니다.");
        } else {
            System.out.println("0 보다 큰 양의 물을 채워주세요 .ᐟ ");
        }
    }

    // 메서드 2 : 커피 원두 채우기
    public void refillCoffee(int amount){
        // 방어적 코드 작성
        if(amount > 0){
            coffee += amount;
            System.out.println(amount + "g의 커피 원두를 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 원두를 채워주세요.");
        }
    }

    // 메서드 3 : 커피 만들기
    public String makeCoffee(){
        // 커피 한 잔에 물 100ml, 원두 10g 필요
        // 방어적 코드 작성
        if(water >= 100 && coffee >= 10){
            water -= 100; // 물 사용
            coffee -= 10; // 원두 사용
            return "맛있는 커피 한 잔 완성";
        } else {
            return "재료가 부족해요 ! 물이나 원두를 채워주세요 !";
        }
    }

    // 생성자가 여러 개라면?
    // (생성자 오버로딩)

    // 연습 문제 1
    // 사용자 정의 생성자를 멤버 변수 water, coffee 값이 초기화 될 수 있도록 코드를 추가해 주세요.
    public CoffeeMachine () {}

    public CoffeeMachine(int w, int c){
        water = w;
        coffee = c;
    }


} // end of class
