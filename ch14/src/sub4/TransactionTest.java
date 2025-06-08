package sub4;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2025.06.08 (일)
 * 이름 : 김민희
 * 내용 : 트랜잭션 테스트
 */
public class TransactionTest {
	
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
	private final static String USER = "root";
	private final static String PASS = "Rlaalsgml312!";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생하시겠습니까?");
		int answer = sc.nextInt();
		Connection conn = null;
		
		// 개별적
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// auto commit 끄기
			conn.setAutoCommit(false);
			String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000"
					+ " where `a_no` = ?";
			
			String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000"
					+ " where `a_no` = ?";
			
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setString(1, "101-11-1001");
			
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, "101-11-1003");
			
			
			pstmt1.executeUpdate();
			if (answer == 1) {
				throw new Exception("에러가 발생했습니다.");
			}
			pstmt2.executeUpdate();
			
			// 트랜잭션 커밋 (작업 성공처리)
			conn.commit();
			
			pstmt1.close();
			pstmt2.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 트랜잭션 취소
				conn.rollback();
				System.out.println("작업이 실패 ㅠㅠ");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
