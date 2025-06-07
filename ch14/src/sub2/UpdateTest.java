package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025.06.07 (토)
 * 이름 : 김민희 
 * 내용 : Update 테스트 실습
 */

public class UpdateTest {
	public static void main(String[] args) {
		// 데이터베이스 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		try {
			System.out.println("DB 연결 시도...");
			Connection conn = DriverManager.getConnection(host, user, pass);
			System.out.println("DB 연결 성공...");
			
			
			Statement stmt = conn.createStatement();
			
			String sql = "Update `user1` set ";
			sql += "`hp` = '010-1234-1111',";
			sql += "`age` = 25 ";
			sql += "where `uid` ='J101';";
			
			System.out.println("실행할 SQL : " + sql);
			
			// 실행 시도 전 로그
			System.out.println("SQL 실행 시작...");
			stmt.execute(sql);
			// 실행 후 로그 
			System.out.println("SQL 실행 완료...");
			
			stmt.close();
			conn.close();
			System.out.println("DB 연결 종료");
			
		} catch (Exception e) {
			System.err.println("❌ 예외 발생: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Update 성공 !");
	}
}
