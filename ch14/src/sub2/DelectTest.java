package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DelectTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "Rlaalsgml312!";
		
		try {
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "Delete from `user1` where `uid` = 'J101';";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Delete 성공 !");
	}
}
