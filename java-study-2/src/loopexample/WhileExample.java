package loopexample;

// while 문을 이용하여 1 부터 10 까지 더하기
public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) { // num 값이 10보다 작거나 같은 동안
            // 조건식이 참인 동안 반복 수행
            sum += num;     // 합계를 뜻하는 sum 에 num 을 더하고
            num++;          // num 에 1씩 더해 나감
        }
        System.out.println("1부터 10까지 합은 '" + sum + "' 입니다.");
    }
}
