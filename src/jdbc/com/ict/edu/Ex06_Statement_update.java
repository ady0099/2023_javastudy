package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 박세리의 주소를 대한민국 제주도, 전화번호를 1로 변경
public class Ex06_Statement_update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ady";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "update customer set address='대한민국 제주도', phone='1' where name='박세리'";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			sql = "select * from customer order by custid asc";
			// stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (result > 0) {
				System.out.println(result+"행이 업데이트되었습니다.");
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.println(rs.getString(4) + "\t");
				}

			} else if(result==0) {
				System.out.println("업데이트 실패");
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.println(rs.getString(4) + "\t");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}

	}
}