package array;

// 문자 저장 배열 만들기
// 알파벳 문자와 아스키 코드 값 출력하기
public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        // 첫 번째 for 문: 배열에 A~Z까지 문자들을 순서대로 저장
        // i는 배열의 인덱스(0~25), ch는 저장할 문자('A'~'Z')
        // i++는 i를 1씩 증가, ch++는 ch를 다음 알파벳으로 증가
        for (int i = 0; i < alphabets.length; i++, ch++) { // 반복문의 다중 증가식 (두 개의 변수를 동시에 증가)
            alphabets[i] = ch; // 아스키 값으로 각 요소에 저장
        }

        // 두 번째 for 문: 배열에 저장된 문자들과 아스키 코드를 출력
        // 배열의 모든 요소를 0번 인덱스부터 25번 인덱스까지 순회
        for (int i = 0; i < alphabets.length; i++) {
            // alphabets[i]: 배열에서 i번째 문자를 가져옴
            // (int)alphabets[i]: 문자를 정수(아스키 코드)로 형변환
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }

    }
}
