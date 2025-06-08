package sub1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  // SQLException import 추가

/**
 * 날짜 : 2025.05.19 (월)
 * 이름 : 김민희
 * 내용 : Java JDBC 접속 테스트 실습하기
 * 
 * JDBC
 * - Java DataBase Connection
 * - Java 기술로 데이터베이스를 연결하기 위한 기술 표준
 * 
 */

public class JDBCTest {
    public static void main(String[] args) {
    	// DB 정보
        String host = "jdbc:mysql://127.0.0.1:3306/studydb?serverTimezone=Asia/Seoul";
        String user = "root";
        String pass = "Rlaalsgml312!";
        
        Connection conn = null;
        
        try {
            // 1단계 - JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("1단계 - JDBC 드라이버 로드 성공!");
            
            // 2단계 - 데이터베이스 접속
            conn = DriverManager.getConnection(host, user, pass);
            System.out.println("2단계 - 데이터베이스 접속 성공!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패!");
            e.printStackTrace();
        } finally {
            // 데이터베이스 접속 자원 해제
            try {
                if(conn != null) {
                    conn.close();
                    System.out.println("데이터베이스 접속 자원 해제!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}