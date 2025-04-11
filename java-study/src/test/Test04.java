package test;

public class Test04 {

    public static void main(String[] args) {

        // 도전과제 2. 삼각형의 면적을 계산하는 가장 기본적인 방법은
        // 밑변과 높이를 알고 있을 때, 사용할 수 있는 공식을 이용하는 것 입니다.
        // 공식 : (밑변 * 높이) / 2

        // 밑변 길이 : 상수 선언 및 초기화
        final double BASE_LINE = 1000;

        // 높이 : 정수 선언 및 초기화
        final int HEIGHT = 50;

        // 코딩 컨벤션 -- 이름 규칙
        // 파스칼 케이스, 카멜 케이스, 스네이크 케이스
        // t_area 스네이크 케이스 대신 변수는 카멜 케이스로 권장한다. (자바에서)
        double t_area = (BASE_LINE * HEIGHT) / 2;
        System.out.println("삼각형 면적 : " + t_area + "m^2");

        // * 파스칼 케이스 (PascalCase) : 각 단어의 첫 글자를 대문자로 작성
        // 사용대상 -⟶ 클래스 이름, 생성자, 타입 정의 등

        // 카멜 케이스 (camelCase) : 첫 단어는 소문자, 이후 단어는 첫 글자만 대문자
        // 사용대상 -⟶ 변수명, 함수명, 메서드명 등

        // 스네이크 케이스 (snake_case) : 모든 문자를 소문자로, 단어 사이를 언더스코어 _로 구분
        // 사용대상 -⟶ SQL 쿼리, 테이블명, 컬럼명, JSON 또는 외부 API 매핑, 정적 상수(static constant)

        /*
            정적 상수란?
            • static final 로 선언된 값
            • 프로그램 실행 중 절대 바뀌지 않음

            ex) public static final int MAX_USERS = 100;
            -> 이건 마치 "이 값을 바꾸면 지구가 멸망한다"는 선언 같은 것

            왜 정적 상수만 SCREAMING_SNAKE_CASE 를 쓰는가?
            --> "절대 변하지 않는 값이라는 의사 표현"

            이유:
            1. 눈에 띄게 강조
            -> 전역에서 참조되는 값 한눈에 드러내기
            -> MAX_SIZE, TIMEOUT_SECONDS 처럼 대문자 + 언더스코어 조합은 눈에 띔

            2. 불변임을 명확히 전달
            -> camelCase 로 적으면 실수로 수정하는 경우 생김
            -> SCREAMING_SNAKE_CASE 는 일종의 시각적 경고

            3. 전통과 관례
            -> C언어 시절부터 전해 내려오는 패턴
            -> #define MAX_VALUE 1000 같은 매크로에서 유래

            [요약]
            SCREAMING_SNAKE_CASE
            모든 문자를 대문자, 단어는 _로 구분.
            정적 상수에 사용. 강조와 불변을 표현
            정적 상수에 쓰는 이유 : 눈에 띄고, 변하지 않으며, 실수 방지. C언어 전통 계승
         */
    }

}
