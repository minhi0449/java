package ch03;

// 논리 연산자 복습
public class Operation6 {
    public static void main(String[] args) {

        // 쇼핑몰 회원 정보 설정

        int userAge = 20; // 사용자의 나이
        int cartTotal = 50_000; // 장바구니 총액(원) 정수에 숫자 단위에 _ 언더바 사용 가능
        System.out.println();
        System.out.println("cartTotal = 50_000 --> " + cartTotal); // 출력 : 50000
        boolean isMember = true; // 회원 여부
        int couponCount = 2; // 보유 쿠폰 개수

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원이어야 한다.
        boolean freshShopping = (cartTotal >= 30_000) && isMember;
        System.out.println("무료 배송 가능 여부 : " + freshShopping); // true

        // 2. 할인 조건 : 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야 함.
        boolean canDiscount = (userAge >= 19) || (couponCount >= 1);
        System.out.println("할인 적용 가능 여부 : " + canDiscount); // true

        // 3. 구매 제한 조건 : 나이가 19세 미만이고, 회원이 아닌 경우 -> &&
        // (&&) : 두 조건이 모두 참일 때만 참을 반환
        //                               false      &&   false
        boolean purchaseRestricted = (userAge < 19) && !isMember;
        System.out.println("구매 제한 조건 : " + purchaseRestricted); // false

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만 참여 가능
        // (||) : 논리 OR -> 두 조건 중 하나라도 참이면 참을 반환 (쿠폰 개수가 3개 미만이라서 true)
        boolean canJoinEvent = (cartTotal < 50_000) || (couponCount < 3);
        System.out.println("이벤트 참여 가능 여부 : " + canJoinEvent); // true

        // 연습문제
        // > 직접 문제를 만들어 식을 세워 출력 하시오.
        // 1. 실버 회원 조건 :
        // 성인(나이 20세이상) 회원이며, 장바구니 10만원이상, 보유 쿠폰 개수는 2개 이상이어야 한다.
        boolean sliver = (userAge >= 20) && (cartTotal >= 100_000) && isMember && (couponCount >= 2);
        System.out.println("실버 회원 조건 : " + sliver); // false
        // 문제 풀이 ) userAge, isMember, couponCount = true / cartTotal = false --> false
        // 논리 AND 는 조건이 모두 참 일 때만, 참을 반환하기 때문.


    }
}