package uril;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	private static final String user = "testuser"; // PostgreSQL user
	private static final String password = "testpass"; // PostgreSQL pass
	private static final String dbserver = "jdbc:postgresql://localhost:5432/"; // Postgres Server
	private static final String dbname = "testdb"; // DataBase name
	private static final String driverName = "org.postgresql.Driver"; // PostgreSQL Driver name
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			
			// context.xml에 설정된 리소스 이름을 사용합니다. (예: jdbc/postgres)
			DataSource ds = (DataSource)envContext.lookup("jdbc/postgres");
			
			conn = ds.getConnection();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// select를 수행한 후 리소스 해제 메소드
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// insert, update, delete를 수행한 후 리소스 해제 메소드
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
