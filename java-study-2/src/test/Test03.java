package test;

public class Test03 {
    public static void main(String[] args) {

        // 도전과제 1. 사각형의 면적을 구하는 코드를 작성해 보시오.
        // 공식 ) 밑볕 * 높이

        final int WIDTH = 10;
        final double HEIGHT = 5.55;
        // 의미 ⟶ 한 번 값을 저장하면 변경할 수 없는 메모리 공간

        double area = WIDTH * HEIGHT;
        System.out.println();
        System.out.println("사각형의 면적 : " + area);
    }
}
