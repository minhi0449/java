package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2024/07/18 (목)
 * 이름 : 김민희
 * 내용 : 파일 입출력 스트림 실습하기
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		// FileIOTest 파일이 아니고 프로그램임
		String source = "C:\\Users\\lotte4\\Desktop\\sample1.txt";
		String target = "C:\\Users\\lotte4\\Desktop\\sample2.txt";
		
		try {
			// 입력스트림 생성 및 파일연결
			FileInputStream fis = new FileInputStream(source); // 실행되기 전 예외 발생 
			FileOutputStream fos = new FileOutputStream(target);

			while(true) {
				
				// 파일 읽기
				int data = fis.read(); // try catch 절에서 예외 발생하면 catch절만 추가하면 됨
				
				if(data == -1) {
					// 더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				// int를 char로 영어는 잘 나오는데 한글은 이상하게 나옴
				//char ch = (char) data;

				// 파일 읽은 내용 그대로 출력
				System.out.println(data);
				
				// 파일 쓰기
				fos.write(data);
	
			}
			// 스트림 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료...");
	}
}

















