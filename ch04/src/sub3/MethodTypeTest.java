package sub3;
/*
 * 날짜: 2024/07/02
 * 이름: 김민희
 * 내용: Java 메서드 타입 실습하기
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
	}
	
	// 타입 1 - 매개변수 O, 리턴 값 O
	public static double type1(double x) {
		
		double y = (x * x) * Math.PI;
		return y;
	}
	
	// 타입 2 - 매개변수 O, 리턴 값 x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		
	}
	
	// 타입 3 - 매개변수 x, 리턴 값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	// 타입 4 - 매개변수 x, 리턴 값 x
	public static void type4() {
	
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : " + result);
	}
	
}














