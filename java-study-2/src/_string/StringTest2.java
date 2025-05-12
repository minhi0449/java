package _string;

public class StringTest2 {
    public static void main(String[] args) {

        // 스트링 객체는 불변이다.
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 원래 객체 주소가 생성 되어 있고, 내부 변수 값이 변경이 된다면
        // String 클래스는 수정되지 않고 불변이다.
        // 즉, 수정이 되면 새로운 String 객체를 만드는 동작으로 실행된다.

        System.out.println("고유 주소 확인 : " );

    }
}
