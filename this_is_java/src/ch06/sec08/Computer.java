package ch06.sec08;

public class Computer {
	
	/*
	 
	 리턴타입 메서드이름(타입... 변수명) {
	    // 변수명은 배열처럼 사용 가능
	  }
	  
	 */
	
	int sum(int ... values) {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
