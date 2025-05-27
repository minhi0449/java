package ifexample;

// 나이에 따라 다른 문장 출력하기
public class IfExample1 {
    public static void main(String[] args) {
        int age = 7;

        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

        // 예제에서 age 변수 값이 '7' 이므로
        // '학교에 다니지 않습니다.' 라는 결과값 출력
    }
}
