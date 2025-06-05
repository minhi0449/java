package ch00;

public class NanEX {

    double x = 5.0;
    double y = 0.0;
    double z = 5 % y;

    public void isNan(){
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }

    public static void main(String[] args) {
        NanEX nanEX = new NanEX();
        nanEX.isNan();
    }
}
