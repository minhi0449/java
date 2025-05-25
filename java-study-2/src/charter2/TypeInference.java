package charter2;

// 자료형 추론
// 자바 10에서 var 를 사용하여 변수를 선언하는 기능을 제공하기 하지만
// 자바 하위 버전과의 호환성을 위해서 모든 변수를 사용할 때 자료형을 명시하고 사용
public class TypeInference {
    public static void main(String[] args) {
        var i = 10;         // int i = 10; 으로 컴파일 됨
        var j = 10.0 ;      // double j = 10.0; 으로 컴파일 됨
        var str = "hello";  // String str = "hello"; 으로 컴파일 됨

        System.out.println("i : " + i);
        System.out.println("j : " + j);
        System.out.println("str : " + str);

        str = "test"; // 다른 문자열은 대입 가능
        // str = 3; ---> str 변수는 String 형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음

    }
}
