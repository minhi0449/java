package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayBufferTest {
	public class FileIOTest {
		public static void main(String[] args) {
			
			// FileIOTest 파일이 아니고 프로그램임
			String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
			String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";

			
			try {
				// 입력스트림 생성 및 파일연결
				FileInputStream fis = new FileInputStream(source); // 실행되기 전 예외 발생 
				FileOutputStream fos = new FileOutputStream(target);
				
				// 버퍼로 이용한 byte 배열
				byte[] = buffer = new byte[1024]; // 1KB
				
				while(true) {
					
					// 파일 읽기
					int data = fis.read(buffer); // 한번에 1KB
					
					if(data == -1) {
						// 더 이상 읽을 파일 내용이 없을 경우
						break;
					}
					
					
					
					// 파일 쓰기
					fos.write(buffer, 0, data);
					
					
					
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
}
