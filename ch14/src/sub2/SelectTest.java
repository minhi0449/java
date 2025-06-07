package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2025.06.07 (토)
 * 이름 : 김민희 
 * 내용 : Select 테스트 실습
 */

public class SelectTest {

	public static void main(String[] args) {
		
		// 데이터베이스 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		List<User1VO> user1s = new ArrayList<User1VO>();
		
		try {
			// 1단계 
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계
			Statement stmt = conn.createStatement();
			
			// 3단계
			// 4단계
			String sql = "select * from `user1`";
			
			ResultSet rs = stmt.executeQuery(sql); 
			
			// ResultSet 의 결과 출력
			while(rs.next()) {
				// 조회된 데이터 갯수(튜플) 만큼 cursor를 한 행씩 내려가면서 데이터를 조회
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String hp = rs.getString(4);
				int age = rs.getInt(5);
				
				// 리스트 생성
				User1VO vo = new User1VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setBirth(birth);
				vo.setHp(hp);
				vo.setAge(age);
				
				user1s.add(vo);
				
				// System.out.println(uid + " " + name + " " + birth + " " + hp + " " + age);
			}
			
			
		} catch (Exception e) {
			
		}
		
		// 리스트 출력
		for (User1VO vo : user1s) {
			System.out.println(vo);
			System.out.println("select 완료 !");
		}
		
		
	}
}
