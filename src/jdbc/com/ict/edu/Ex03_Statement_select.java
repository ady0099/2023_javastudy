package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// customer 테이블에서 박씨로 시작하는 사람을 검색하자

public class Ex03_Statement_select {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int res = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ady";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user,password);
			
			String sql = "select * from customer where name like '박%'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("오류!! 클래스없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("쿼리문 오류");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				System.out.println("제대로 안닫힘");
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
