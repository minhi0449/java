package sub3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 날짜 : 2024/07/18 (목)
 * 이름 : 김민희
 * 내용 : 직렬화 실습하기
 */
public class DESerializeTest2 {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			// 직렬화 객체를 내보내기 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 역직렬화
			Apple apple = (Apple) ois.readObject();
			
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
		
	}
}
