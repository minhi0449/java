package array;

public class ArrayTest02 {

    public static void main(String[] args) {

        char[] alphabet = new char[26];
        // 26칸 짜리 문자배열 만든다. 알파벳 26개 넣을 공간
        // char[] : 캐릭터 배열

        // alphabet 은 26칸짜리 배열
        // 각 칸은 알파벳을 하나씩 담을 수 있다.
        // alphabet.length 는 그 칸 수, 즉 "26" 이다.

        // 아래 반복문에서 i < alphabet.length
        //             i < 26 과 같다.
        // 즉, i가 0부터 25까지 --> 26번 반복

        System.out.println("alphabet : " + alphabet);

        // char 타입은 원래 정수 값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자, 문자열을 아주 많이 다루고 있다.
        // 컴퓨터에서 문자를 표현하기 위해서 문자표라는 것을 사용한다.
        // 아스키코드, EUC-KR, 유니코드 문자표라는 것을 사용한다.
        // 아스키코드 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        // [][][][][][][][] <--- 정수 0 ~ 127

        alphabet[0] = 'A'; // 정수값 --> 65
        // 첫 번째 칸에 'A'를 넣음
        System.out.println("(int)alphabet[0] : " + (int)alphabet[0]);
        // (int) 는 글자를 숫자로 바꾸는 거

        alphabet[1] = 'B'; // 정수값 --> 66
        System.out.println("(int)alphabet[1] : " + (int)alphabet[1]);
        // 두 번째 칸에 'B'를 넣고 숫자로 바꿔서 확인 --> 'B'는 66


        // 인코딩 (Encoding) = 문자 --> 숫자
        // 문자를 컴퓨터가 이해할 수 있는 숫자(코드값)로 바꾸는 과정을 인코딩이라 한다.
        int code1 = (int)'A'; // 인코딩
        // 'A'를 숫자(정수)로 바꿔서 code1에 저장 --> 이걸 인코딩이라고 한다.


        // 디코딩(Decoding) = 숫자 --> 문자
        // 숫자(코드값)을 사람이 읽을 수 있는 문자로 바꾸는 과정 말한다.
        char code = (char)66; // 디코딩

        // 반복문을 통해서 알파벳 A ~ Z 출력하시오.
        System.out.println("-------------------------------");

        // 1. for 구문 활용해서 alphabet[] 에 A ~ Z 까지 담아 보자.
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('a' + i);
            System.out.println("alphabet[i] : " + alphabet[i]);

        }
        // 'a' + i
        // 자바에서 문자 'a'는 사실 숫자
        // 'a'는 97번 숫자로 저장되어있음 (아스키코드)

        // 'a' + 0 = 97
        // 'a' + 1 = 98
        // 'a' + 2 = 99
        // 즉, i 를 더하면 다음 글자가 되는 거임

        // (char)('a' + i)
        // 이건 숫자 --> 문자로 되돌려주는 거
        // 숫자 97 --> 'a'
        // 숫자 98 --> 'b'
        // 이렇게 디코딩 하는 것

        /**
         전체 데이터 흐름
         1. alphabet[0] 에 'a'가 들어가고
         2. alphabet[1] 에 'b'가 들어가고
         3. 계속해서 alphabet[25] 에 'z'까지 들어감
         4. 그리고 한 번 넣을 때마다 System.out.println(...)으로 화면에 보여
         */


        System.out.println("-------------------------------");
        // 2. for 구문을 활용해서 그대로 출력해보자.
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        } // end of for

        System.out.println("-------------------------------");
    } // end of main


} // end of class