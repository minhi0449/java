package ch00;

// 매개변수가 필요없는 함수
public class GetTenTotal {

    // getTenTotal : 인스턴스 메소드 이므로 객체를 생성해야 호출 가능
    // static 메소드는 객체 생성 없이 클래스 이름으로 직접 호출 가능
    public static void main(String[] args) {
        GetTenTotal calculator = new GetTenTotal(); // 객체 생성
        int result = calculator.getTenTotal(); // 메소드 호출
        System.out.println("calculator : " + calculator);
        System.out.println("total : " + result); // 결과 출력
    }

    // 1부터 10까지의 합을 계산하는 메소드
    int getTenTotal(){
        int i; // 반복문에서 사용할 변수 선언
        int total = 0; // 합계를 저장할 변수를 0으로 초기화

        // 1부터 10까지 반복
        for(i = 1; i <= 10; i++){
            total += i; // 현재 숫자를 합계에 더하기
        }
        return total; // 1부터 10까지 더한 값(55)을 반환
    }
}