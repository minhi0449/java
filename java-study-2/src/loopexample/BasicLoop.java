package loopexample;

// 1 부터 10 까지 더하기
public class BasicLoop {
    public static void main(String[] args) {
        int num = 1;
        num += 2; // 복합 대입 연산자 --> num = num + 2; 와 같음
        num += 3;
        num += 4;
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;

        System.out.println("1부터 10까지의 합은 '" + num + "' 입니다.");

    }
}
