package sub01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2024/07/24
 * 이름 : 김민희
 * 내용 : HTTP 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://naver.com"); 
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
