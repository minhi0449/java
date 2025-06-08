package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025.06.08 (일)
 * 이름 : 김민희
 * 내용 : PreparedDelete 테스트 실습하기
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL 객체 (PreparedStatement)
			String sql = "DELETE FROM `user2` WHERE `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "J101");
			
			// 3단계 - SQL 실행
			psmt.executeUpdate();
			
			// 4단계 - ResultSet 결과 처리
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		System.out.println("Delete 성공 !");
	}
}
