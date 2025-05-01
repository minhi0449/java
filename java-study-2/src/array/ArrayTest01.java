package array;

public class ArrayTest01 {

    public static void main(String[] args) {
        // 배열 이란? - 연관된 데이터 타입을 한 번에 모아서 통으로 관리하기 위해 사용할 수 있다.

        // 배열을 선언하는 문법
        // 규칙 1.
        // 배열은 반드시 먼저 몇 개의 데이터가 들어갈 지 크기를 지정해야 사용할 수 있다.

        // int[] number; // 배열의 선언
        // numbers = new int[]; // 4바이트 네모칸 3개 초기화
        // ✦ 핵심 개념 "배열은 선언 후, 크기를 지정해야 사용 가능"

        int[] numbers = new int[3];   // 데이터 타입에 대괄호 문법 허용
        // int intBoxes[] = new  int[5]; // 변수 뒤에 대괄호 문법 허용

        // [][][]  <--- 값이 아직 안 들어간 상태이다.
        // ✦ 배열 안의 각 칸(cells)은 아직 기본값(default value)이 들어있습니다.
        // - int 타입 배열은 기본 값이 0 입니다.

        // 배열 선언과 동시에 값을 초기화 해보자.
        int[] grades = new int[] {1,2,3};
        // [1][2][3]
        // 'new int[] {1,2,3}' : 배열을 만들면서 1, 2, 3 값을 바로 넣는 방법
        // 결과적으로 [1][2][3]이 들어갑니다.ㄴ

        int[] grades2 = {1,2,3,4,5,6};
        // [1][2][3][4][5][6]
        // 조금 더 간단한 방법, new int[] 생략 가능!
        // 컴파일러가 알아서 new int[] 를 붙여줍니다.

        System.out.println();
        System.out.println("grades : " + grades);
        System.out.println("grade2 : " + grades2);
        // 배열을 그냥 출력하면, '배열이 저장된 메모리 주소'가 나옵니다.
        // 이걸 사람이 보기 쉽게 출력하려면 반복문(for) 등을 써야 합니다.

        // 문제 1
        // 5개의 크기를 가지는 double 타입 배열을 선언하시오.
        // 배열의 이름은 마음대로 작성
        double[] doubles = new double[5]; // 길이를 정해야 한다.
        doubles[0] = 1.0;
        doubles[1] = 1.1;
        doubles[2] = 1.2;
        doubles[3] = 1.3;
        doubles[4] = 1.4;
        // 중요 ! - 모든 프로그래밍 언어에 인덱스 번호는 0 부터 시작한다.

        // doubles 배열의 길이는 얼마일까?  -- 5개
        // doubles 인덱스의 길이는 얼마일까? -- 4개 (인덱스의 길이)
        // ✦ 모든 인덱스의 길이는 'n-1' 이다. ✦
        // doubles[5] = 1.5;

        int[] array1 = new int[57];
        // 배열 길이   : 57
        // 인덱스 길이 : 56
        
        int[] array2 = new int[157];
        // 배열 길이  : 157
        // 인덱스 길이 : 156
        
        // String 배열 선언 방법
        String[] stringBox = new String[3];
        stringBox[0] = "가";
        stringBox[1] = "나";
        stringBox[2] = "다"; // 인덱스 길이 조심!!
        // 한국어 문자도 String 타입에 저장할 수 있습니다.
        // 자바에서 문자열은 모두 String 객체로 다룹니다.

        System.out.println("------------------------");
        System.out.println("stringBox.length : " + stringBox.length);
        // 배열의 '길이'를 알 떄는 '배열명.length'를 사용합니다. (legnth는 변수, () 없음)

        System.out.println("stringBox[0] : " + stringBox[0]);
        System.out.println("stringBox[1] : " + stringBox[1]);
        System.out.println("stringBox[2] : " + stringBox[2]);
        System.out.println();

        //
        for (int i = 0; i < stringBox.length; i++){
            // - i = 0;
            // - i = 1;
            // - i = 2;
            // System.out.println("------------------------");
            System.out.print("stringBox[i] : " + stringBox[i] + ", ");
        }

    } // end of main
} // end of class
