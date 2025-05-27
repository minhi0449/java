package charter2;

// 묵시적 형 변환
// 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // byte 형 값이 'int 형' 변수로 대입됨

        System.out.println("bNum : " + bNum);
        System.out.println("iNum : " + bNum);

        // 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
        int iNum2 = 20;
        float fNum = iNum2; // int 형 값이 'float 형' 변수로 대입됨

        System.out.println("iNum2 : " + iNum2);
        System.out.println("fNum : " + fNum);

        // 연산 중에 자동 변환되는 경우
        double dNum;
        dNum = fNum + iNum;
        System.out.println("dNum(fNum + iNum) : " + dNum);


    }
}
