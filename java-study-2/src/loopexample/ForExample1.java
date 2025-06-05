package loopexample;

// for문 예제
public class ForExample1 {
    public static void main(String[] args) {
        int i;
        int sum;

        // for 문에서 가장 자주 사용하는 변수 이름은 i
        // 주로 횟수를 표현
        for (i = 1, sum = 0; i <= 10; i++){
            sum += i;
        }

        System.out.println("1부터 10까지의 합은 '" + sum + "' 입니다.");

    }
}
