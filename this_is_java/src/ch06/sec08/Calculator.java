package ch06.sec08;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double divide (int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
