package _this;

public class PersonMainTest {

    public static void main(String[] args) {

        // Person p1 = new Person("홍길동", 10, "010-1234-1234");
        // Person p1 = new Person("홍길동", 10, "010-1234-1234", "F");


        // 실행되는 순서 : → 1번
        // 출력 : 1번 생성자만 출력
        // 1. 이름, 나이만 있는 사람 만들기
        System.out.println("▶▶ [1] (이름 + 나이) 생성자 호출");
        Person p1 = new Person("영희", 15);
        System.out.println("⏹ 1번 끝\n");

        // 내부적으로 실행되는 순서 → 2번 → 1번
        // 출력 : 1 → 2
        System.out.println("▶▶ [2] (이름 + 나이 + 전화번호) 생성자 호출");
        Person p2 = new Person("민수", 20, "010-1234-5678");
        System.out.println("⏹ 2번 끝\n");

        // 실행 순서 : → 3번 → 2번 → 1번
        // 출력 : 1 → 2 → 3
        System.out.println("▶▶ [3] (이름 + 나이 + 전화번호 + 성별) 생성자 호출");
        Person p3 = new Person("철수", 25, "010-8765-4321", "남자");
        System.out.println("⏹ 3번 끝\n");

    }
}
