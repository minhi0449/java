package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {
	public class FileIOTest {
		public static void main(String[] args) {
			
			// FileIOTest 파일이 아니고 프로그램임
			String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
			String target = "C:\\Users\\lotte4\\Desktop\\workspace2.zip";
			
			try {
				// 입력스트림 생성 및 파일연결
				FileInputStream fis = new FileInputStream(source); 
				FileOutputStream fos = new FileOutputStream(target);
				
				// 파일 복사     // 출력 스트림에 연결되어있는 파일(fos)로 
				fis.transferTo(fos);
				   // 메서드 함수 .transferTo
				
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
}
