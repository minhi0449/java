package array;

// 배열 초기화하고 출력하기
public class ArrayTest {
    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 배열의 첫 번째 요소 (num[0]) 부터
        // 열 번째 요소(num[9])까지 10개 요소 값 출력
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
