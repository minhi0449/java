package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 날짜 : 2025.06.08 (일)
 * 이름 : 김민희 
 * 내용 : PreparedSelect 테스트 실습
 */
public class PrepareSelectTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		List<User2VO> user2s = new ArrayList<User2VO>();
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL 실행
			String sql = "SELECT * FROM `user2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			
			while (rs.next()) {
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				
				user2s.add(vo);
			}
			
			// 3단계 - SQL 실행
			// 4단계 - ResultSet 결과 처리
			// 5단계 - 데이터베이스 종료
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		 for (User2VO vo : user2s) {
			 System.out.println(vo);
		 }
	}
}
