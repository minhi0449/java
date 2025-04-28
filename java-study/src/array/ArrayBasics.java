package array;

// 배열 기초 예제 코드 1
public class ArrayBasics {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----- 배열 기초 학습 -----");

        // 1. 배열 선언과 생성
        int[] numbers = new int[5];

        // 2. 배열 요소에 값 저장
        numbers[0] = 10; // 첫 번째 칸
        numbers[1] = 20; // 두 번째 칸
        numbers[2] = 30; // 세 번째 칸
        numbers[3] = 40; // 네 번째 칸
        numbers[4] = 50; // 다섯 번째 칸

        // 3. 배열 요소 출력
        System.out.println();
        System.out.println("===== 배열 요소 하나씩 출력 ===== ");

        System.out.println("첫 번째 요소 : " + numbers[0]);
        System.out.println("두 번째 요소 : " + numbers[1]);
        System.out.println("세 번째 요소 : " + numbers[2]);
        System.out.println("네 번째 요소 : " + numbers[3]);
        System.out.println("다섯 번째 요소 : " + numbers[4]);

        // 4. 반복문으로 배열 요소 출력
        System.out.println();
        System.out.println("===== 4. 반복문 배열 요소 출력 ===== ");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(i + " 번 인덱스 값 : " + numbers[i]);
        }


        // 5. 향상된 for문(for-each) 으로 배열 요소 출력
        System.out.println();
        System.out.println("=====  5. 향상된 for문으로 배열 요소 출력 ===== ");

        for (int number : numbers) {
            System.out.println("값 : " + number);
        }


        // -------------------------------------------------------------------------
        // -------------------------------------------------------------------------

        // 1. 일반 for문 예제
        int[] for1 = {10, 20, 30, 40, 50}; // 5개의 숫자가 있는 배열

        // 일반 for문 사용
            System.out.println();
            System.out.println("-- -- -- 일반 for문 예제 -- -- --");
        for (int i = 0; i < for1.length; i++) {
            System.out.println("일반 for문 - 인덱스 '" + i + "' 번째 값: " + for1[i]);
        }

        // -------------------------------------------------------------------------







        // -------------------------------------------------------------------------
        // -------------------------------------------------------------------------


    }

}
