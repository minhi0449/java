package sub03;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2024/07/24
 * 이름 : 김민희
 * 내용 : 채팅 실습하기
 */
public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]"); // 서버가 시작됨을 알림
		
		ServerSocket serverSocket = null; // null : 아직 아무것도 가리키지 않는 상태
		Socket socket = null; 
		
		try { // 예외 처리 시작 - 오류가 날 수 있는 코드를 감싸기
			serverSocket = new ServerSocket(9001);
			System.out.println("[Server] 연결 대기 ...");
			socket = serverSocket.accept();
			
			System.out.println("[Server] 연결 수립 ...");
			
			Thread t1 = new SendThread(socket);
			Thread t2 = new ReceiveThread(socket);
			
			t1.start();
			t2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
