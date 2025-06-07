package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025.06.07 (토)
 * 이름 : 김민희 
 * 내용 : Insert 테스트 실습
 */
public class InsertTest {

	public static void main(String[] args) {
		// 데이터베이스 정보 
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL 실행 객체 (statement 생성)
			Statement stmt = conn.createStatement();
			
			// 3단계 - sql 실행
			String sql = "Insert INTO `user1` VALUES ('J101', '김유신', '1990-01-21', '010-1234-1001', '23')";
			
			stmt.executeUpdate(sql);
			
			// 4단계 - 결과 처리 (select 일 경우에만 수행) resultset
			
			// 5단계 - 접속 종료
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Insert 완료 !");
		
	}
}
