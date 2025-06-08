package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025.06.08 (일)
 * 이름 : 김민희 
 * 내용 : PreparedInsert 테스트 실습
 */
public class PreparedInsertTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		try {
			
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL 객체 (prepareStatement)
			// 준비된 쿼리문 (쿼리 파라미터? 가 사용된 임시 쿼리문)
			String sql = "INSERT INTO `user2` VALUES (?, ?, ?, ?)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// ?에 매핑이 필요함(사상)
			psmt.setString(1, "J102");
			psmt.setString(2, "강감찬");
			psmt.setString(3, "1990-08-09");
			psmt.setString(4, "부산광역시");
			
			// 3단계 - SQL 실행
			psmt.executeUpdate();
			
			// 4단계 - ResultSet 결과 처리
			// 5단계 - 데이터베이스 종료
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		System.out.println("Insert 완료 !");
	}
}
