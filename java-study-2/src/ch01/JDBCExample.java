package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    자바로 DB에 접근하는 기술 습득하기
    DB 접근 기술

    JDBC 란?
    Java 애플리케이션이 데이터베이스와 대화 할 수 있도록 도와주는 중간다리
    → 다양한 데이터베이스에 자바가 쉽게 접근할 수 있도록 만든 표준 통신 수단

    JDBC API 만 배우면 다양한 데이터베이스에 접근할 수 있게 되어,
    개발 생산성과 효율성이 크게 향상
 */
public class JDBCExample {
    public static void main(String[] args) {

        // MySQL 8 버전에 접근하려고 함
        // DB 접근 기술은 정형화 되어 있다.
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "Rlaalsgml312!";

        // 규칙 1. Connection 객체를 힙 메모리에 올리기 위해서는 DriverManager 클래스가 필요하다.
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스에 성공적으로 연결 되었습니다..");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스에 연결을 실패 했습니다.");
        }


    } // end of main
} // end of class
