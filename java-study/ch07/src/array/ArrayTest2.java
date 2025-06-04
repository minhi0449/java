package array;

// 배열 길이만큼 출력하기
public class ArrayTest2 {
    public static void main(String[] args) {
        double[] data = new double[5]; // double 형으로 길이 5인 배열 선언

        data[0] = 10.0; // 첫 번째 요소에 값 10.0 대입
        data[1] = 20.0; // 두 번째 요소에 값 20.0 대입
        data[2] = 30.0; // 세 번째 요소에 값 30.0 대입

        // data.length : 전체 배열 길이만큼 반복
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}
