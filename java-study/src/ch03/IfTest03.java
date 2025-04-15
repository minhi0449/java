package ch03;

public class IfTest03 {
    public static void main(String[] args) {

        int studentAge = 30; // 학생 나이 30살이라고 가정

        // if else if else 조건식 순서도 중요하다.

        // 만약 학생이 7살 이하라면 "유치원생"
        // 만약 학생이 13살 이하라면 "초등학생"
        // 만약 학생이 16살 이하라면 "중학생"
        // 만약 학생이 19살 이하라면 "고등학생"

        // 수행이 될 수도 있고 안 될 수도 있다.
        // 첫 번째 조건 블록 - else 없이 조건만 검사
        if (studentAge <= 7) { // 7살 이하면 유치원생
            System.out.println("유치원생");
        } else if (studentAge <= 13) { // 13살 이하면 초등학생
            System.out.println("초등학생");
        } else if (studentAge <= 16) { // 16살 이하면 중학생
            System.out.println("중학생");
        } else if (studentAge <= 19) { // 19살 이하면 고등학생
            System.out.println("고등학생");
        } // 여기서는 아무 조건도 해당하지 않아서 아무 것도 출력 안 됨

        // 수행 안 됨!
        // if - else if 문은 조건에 맞는 나이가 없기 때문에
        // 아무것도 출력하지 않고 그냥 지나가기 때문

        /*
            if (만약 ~ 라면)
            else if (조건을 여러 개 검사할 때 사용)
            else ("그 외에" 라는 의미)
         */

        // 두 번째 조건 블록 - else 포함
        if (studentAge <= 7) {
            System.out.println("유치원생");
        } else if (studentAge <= 13) {
            System.out.println("초등학생");
        } else if (studentAge <= 16) {
            System.out.println("중학생");
        } else if (studentAge <= 19) {
            System.out.println("고등학생");
        } else {
            // 위 조건들이 하나도 포함이 안 된다면 else 구문이 수행이 된다.
            System.out.println("studentAge : 성인");
        }

    }
}
