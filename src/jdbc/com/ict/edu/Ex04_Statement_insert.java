package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//insert
public class Ex04_Statement_insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("custid : ");
		int custid = sc.nextInt();
		
		System.out.println("name : " );
				
				
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

			// insert (6번, 이강인, 대한민국 서울, 000-9000-0001) 추가
			String sql = "insert into customer(custid, name, address, phone)"
					+ "values(8, '팔강인', '대한민국 서울', '000-9000-0001' )";

			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if (result > 0) {
				// 성공하면 select문을 이용해서 보자
				sql = "select * from customer order by custid asc";
				// stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.println(rs.getString(4)+"\t");
				}
				
			} else {
				System.out.println("실패함");
			}

		} catch (Exception e) {
			System.out.println("제대로 된 데이터를 넣어주세요.");
			e.printStackTrace();
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
