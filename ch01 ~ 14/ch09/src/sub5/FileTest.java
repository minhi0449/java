package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2024/07/18 (목)
 * 이름 : 김민희
 * 내용 : 파일 관리 실습하기
 */
public class FileTest {

	public static void main(String[] args) {
		
		// 
		String path1 = "C:\\Users\\lotte4\\Desktop\\source.txt";
		String path2 = "C:\\Users\\lotte4\\Desktop\\temp"; // 윈도우 폴더
		
		// File 객체 생성
		File f1 = new File(path1);
		File f2 = new File(path1);
		
		try {
			f1.createNewFile(); // 파일 생성
			f2.mkdir(); 		// 디렉터리 생성
			
			// 파일 정보 출력
			System.out.println("f1 존재여부 : " + f1.exists());
			System.out.println("f2 존재여부 : " + f2.exists());
			System.out.println("f1 파일여부 : " + f1.isFile());
			System.out.println("f1 존재여부 : " + f1.isDirectory());
			System.out.println("f2 파일여부 : " + f1.isFile());
			System.out.println("f2 존재여부 : " + f1.isDirectory());
			System.out.println("f1 파일명 : " + f1.getName());
			System.out.println("f2 파일명 : " + f2.getName());
			System.out.println("f1 상대경로 : " + f1.getPath());
			System.out.println("f2 상대경로 : " + f2.getPath());
			System.out.println("f1 절대경로 : " + f1.getAbsolutePath());
			System.out.println("f2 절대경로 : " + f2.getAbsolutePath());

			f1.delete(); // 파일 삭제
			f2.delete(); // 디렉토리 삭제
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
		
	}
	
}




