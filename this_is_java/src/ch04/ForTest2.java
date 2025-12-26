package ch04;

public class ForTest2 {
	public static void main(String[] args) {
		int n = 5; // 총 줄 수: 위 5줄, 아래 4줄 → 총 9줄

        for (int i = 0; i < n * 2 - 1; i++) {
            int spaceCount;
            int starCount;

            // ★ if문 단 1번 사용!
            if (i < n) {
                // 위쪽 삼각형 (i: 0~4)
                spaceCount = n - i - 1;
                starCount = i * 2 + 1;
            } else {
                // 아래쪽 삼각형 (i: 5~8)
                spaceCount = i - n + 1;
                starCount = (n * 2 - 1 - i) * 2 - 1;
            }

            // 공백 출력
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
}
