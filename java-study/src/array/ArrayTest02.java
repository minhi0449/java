package array;

public class ArrayTest02 {
    public static void main(String[] args) {

        char[] alphabet = new char[26];

        // char 타입은 원래 정수 값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자, 문자열을 아주 많이 다루고 있다.
        // 컴퓨터에서 문자를 표현하기 위해서 문자료라는 것을 사용한다.
        // 아스키 코드, EUC-KR, 유니코드 문자표를 전세계 공통으로 사용하기 위해 만들었음.
        // 아스키 코드 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        // [][][][][][][][] <--- 정수 0 ~ 127

        alphabet[0] = 'A';  //  정수값 --> 65
        System.out.println();
        System.out.println("(int)alphabet[0] : " + (int)alphabet[0]);
        System.out.println("alphabet[0] : " + alphabet[0]);

        alphabet[1] = 'B';


    }
}
