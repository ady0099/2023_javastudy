package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_PreparedStatement_update {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 custid : ");
		int custid = sc.nextInt();

		System.out.print("수정할 name : ");
		String name = sc.next();

		System.out.print("수정할 address : ");
		String address = sc.next();

		System.out.print("수정할 phone : ");
		String phone = sc.next();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ady";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "update customer set name=?, address=?, phone=?, where custid=?";
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setString(3, phone);
			pstm.setInt(4, custid);

			result = pstm.executeUpdate();

			if (result > 0) {
				sql = "select * from customer order by custid asc";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();

				while (rs.next()) {
					System.out.println("수정 성공");
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("수정 실패");
				sql = "select * from customer order by custid asc";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();

				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				// stmt.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
