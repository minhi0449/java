package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2025.06.07
 * 이름 : 김민희
 * 내용 : JDBC 접속 테스트 실습 
 */

public class DBConnectTest {
	public static void main(String[] args) {
		
		// 데이터베이스 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		
		// 1단계 - JDBC 드라이버 로드 - 보통 생략 가능
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 연결
			// DriverManager.getConnection() : 데이터베이스 연결을 생성하는 메서드
			Connection conn = DriverManager.getConnection(host, user, pass);
		
			if (conn != null) {
				System.out.println("데이터베이스 접속 성공 !");
			} else {
				System.out.println("데이터베이스 접속 실패 !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // end of main - 메인 메서드 종료 
} // end of class - 클래스 종료 
