package sub03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 날짜 : 2025/06/26
 * 이름 : 김민희
 * 내용 : 소켓 통신 실습하기
 */
public class ReceiveThread extends Thread{
	private Socket socket;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				} 
				
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 자원 해제
			
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
