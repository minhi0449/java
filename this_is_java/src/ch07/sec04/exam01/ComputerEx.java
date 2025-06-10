package ch07.sec04.exam01;

public class ComputerEx {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
		System.out.println();
		
		
		/*
		 	[출력 결과]
		 	
		 	Calculator 객체의 areaCircle() 실행
			원 면적 : 314.0
			
			Computer 의 areaCircle() 실행
			원 면적 : 314.1592653589793
		 */
		
	}
}
