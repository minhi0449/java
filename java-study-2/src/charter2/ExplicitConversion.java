package charter2;

// 명시적 형 변환
// 같은 연산이라도 형 변환이 언제 이루어졌는지에 따라 그 결과 값이 다르게 나타남
public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
        int iNum4 = (int)(dNum1 + fNum2);    // 두 실수의 합이 먼저 계산되고 형 변환됨

        System.out.println("iNum3 : " + iNum3);
        System.out.println("iNum4 : " + iNum4);
    }
}
