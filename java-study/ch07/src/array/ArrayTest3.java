package array;

// 배열의 유효한 요소 값 출력하기
public class ArrayTest3 {
    public static void main(String[] args) {
        double[] data = new double[5];
        int size = 0; // 유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언

        // size++; 값을 저장한 후 size 변수 값 증가
        data[0] = 10.0; size++;
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        // size : 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }

    }
}
