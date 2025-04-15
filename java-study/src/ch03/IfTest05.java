package ch03;

import java.util.Scanner; // 키보드 입력 도구인 Scanner 불러오기

public class IfTest05 {
    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);
        System.out.printf("성적을 입력하세요 (0~100) : ");
        // 만약 저 범위의 수가 잘못 입력 된다면? 잘못된 입력입니다. 출력.
        int score = sc.nextInt(); // 키보드 정수값을 받을 수 있는 명령문 (키보드로 점수 입력 받아서 score 상자에 저장)

        char grade = 'x'; // 아직 학점이 없으니까 'x'로 초기 설정

        // 100 ~ 90 : A 학점입니다.
        // 89 ~ 80  : B 학점입니다.
        // 79 ~ 70  : C 학점입니다.
        // 69 ~ 60  : D 학점입니다.
        // ~ 59     : F 학점입니다.
        // 단, 100 ~ 0 값이 아닌 값을 입력했다면
        // 잘못된 입력입니다. 출력하기!

        // 점수가 0 ~ 100 사이가 아니면 틀렸다고 알려주기
        //   101 > 100     -1 < 0
        if (score > 100 || score < 0) {
            System.out.println("잘못된 입력입니다.");
        } else if (score >= 90) { // 점수가 90점 이상이면 A
            grade = 'A';
        } else if (score >= 80) { // 점수가 80점 이상이면 B
            grade = 'B';
        } else if (score >= 70) { // 점수가 70점 이상이면 C
            grade = 'C';
        } else if (score >= 60) {  // 점수가 60점 이상이면 D
            grade = 'D';
        } else if (score <= 59) { // 나머지는 F
            grade = 'F';
        }

        System.out.println("grade : " + grade); // 무조건 실행되는 코드

        // 만약 잘못된 값이 들어왔다면 아래 구문 출력 안 할 수 있도록 코드를 수정하시오.
        // 만약 학점이 'x'가 아니면 (= 정상적인 점수면)
        if (grade != 'x') {
            System.out.println("당신의 학점은 : " + grade + " 입니다.");

        }
    }
}
