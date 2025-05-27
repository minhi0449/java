package operator;

// 산술 연산자를 사용하여 총점과 평균 구하기
public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;
        System.out.println("totalScore : " + totalScore);

        double avgScore = totalScore / 2.0;
        System.out.println("avgScore : " + avgScore);
    }
}
