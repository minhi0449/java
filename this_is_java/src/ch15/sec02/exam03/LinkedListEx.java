package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		List<String> list2 = new LinkedList<String>();
		
		// 시간 측정을 위한 변수들
		long startTime;
		long endTime;
		
		// === ArrayList 성능 측정 시작 ===
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime - startTime));
		
		
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (endTime - startTime));
		
		
	}
}
