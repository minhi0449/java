package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025.06.08 (일)
 * 이름 : 김민희
 * 내용 : PreparedUpdate 테스트 실습하
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		// 아이디 J101 이름 김철수, 주소 부산광역시 수정하기
		try {
			
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL 객체 (PreparedStatement)
			String sql = "UPDATE `user2` SET `name`= ?, `addr`= ? where `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "김철수");
			psmt.setString(2, "부산광역시");
			psmt.setString(3, "J101");
			
			// 3단계 - SQL 실행
			psmt.executeUpdate();
			
			// 4단계 - ResultSet 결과 처리
			
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		System.out.println("Update 완료 !");
	}
}
