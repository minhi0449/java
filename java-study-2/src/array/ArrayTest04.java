package array;

import java.util.Random;

public class ArrayTest04 {

    public static void main(String[] args) {

        // 배열을 사용해서 랜덤한 숫자 6개를 저장하고 출력해 보자.
        // 배열을 보통 for (반복문과 함께 많이 사용이 된다.)

        // 랜덤한 숫자를 뽑아주는 도구 준비
        Random random = new Random();

        // 배열은 연관된 데이터 타입을 하나. 통으로 관리하기 위해 사용할 수 있다.
        // 정수 값 6개를 담을 수 있는 배열을 선언해 보자.
        int[] intBoxes = new int[6];
        for (int i = 0; i < intBoxes.length; i++) {
            // i = 0, intBoxes[0] = 랜덤 숫자 하나 저장
            // i = 1, intBoxes[1] = 랜덤 숫자 하나 저장
            // i = 2, intBoxes[2] = 랜덤 숫자 하나 저장
            // i = 3, intBoxes[3] = 랜덤 숫자 하나 저장
            // i = 4, intBoxes[4] = 랜덤 숫자 하나 저장
            // i = 5, intBoxes[5] = 랜덤 숫자 하나 저장
            intBoxes[i] = random.nextInt(45) + 1;
            System.out.println("intBoxes[i] : " + intBoxes[i]);

        }



    } // end of main
} // end of class
