package Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * 전체보기 버튼 -> db select * from 문 실행 -> 실행 결과를 jta에 표시 getText()?
 * 삽입 -> db insert문 실행 -> 공란이 있을 경우 null값으로 처리하는 게 더 쉬울듯
 * 삭제 -> db delete문 실행 -> 일부만 지울 경우 null? 값으로 처리할까? 아니면 그냥 행을 다 지울까
 * 검색 -> db select문 실행 where값을 어떻게 넣을까?
 * custid로 검색하고 where custid로 찾아온 값을 setText?로 넣어준다
 * 추가로 다른 검색기능을 사용할 것인지는.. 다른 거 완성하고나서 결정
 * 기본키를 제외한 다른 검색값으로 여러 값이 나왔을 때는 min(기본키)로 아래부터 불러오는 거 ㄱㅊ아보임
 * 고치기 - 수정버튼인가?
 * 불러오면 활성화하기?? 비활성화 조건은 ..
 * 
 * 멤버정보 메서드 만들기
 * 
 */




public class Hw0607_DbConn2 {
	
	
	void showMember() {
		//"select * from";
	}
	void addMember() {
		
	}
	void removeMember(){
		
	}
	void searchMember() {
		
	}
	void rewriteMember() {
		
	}
	

	
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

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from customer order by custid asc";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("오류!! 클래스없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		} finally {
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