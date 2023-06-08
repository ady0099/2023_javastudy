package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 중복 이강인 삭제
public class Ex05_Statement_delete {
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

			String sql = "delete from customer where custid=7";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			sql = "select * from customer order by custid asc";
			// stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (result > 0) {
				System.out.println("삭제 성공 "+result+"행이 삭제되었습니다.");
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.println(rs.getString(4) + "\t");
				}

			} else if(result==0) {
				System.out.println("삭제 실패 : 없는 데이터입니다.");
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
