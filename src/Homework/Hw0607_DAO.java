package Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Hw0607_DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	private static Hw0607_DAO dao = new Hw0607_DAO();

	public static Hw0607_DAO getInstance() {
		return dao;
	}
	
	// DB 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ady";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
		}
		return null;
	}

	// 각종 DB처리 메서드
	// 전체보기
	public ArrayList<Hw0607_VO> getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer order by custid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ArrayList<Hw0607_VO> list = new ArrayList<>();
			while (rs.next()) {
				Hw0607_VO vo = new Hw0607_VO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}

	// 삽입
	public int getInsert(Hw0607_VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into customer(custid, name, address, phone) values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			pstm.setString(2, vo.getName());
			pstm.setString(3, vo.getAddress());
			pstm.setString(4, vo.getPhone());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 삭제
	public int getDelete(Hw0607_VO vo) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 하나 불러오기
	public Hw0607_VO getSelectOne(Hw0607_VO vo) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			rs = pstm.executeQuery();
			Hw0607_VO vo2 = new Hw0607_VO();
			while (rs.next()) {
				vo2.setCustid(rs.getString(1));
				vo2.setName(rs.getString(2));
				vo2.setAddress(rs.getString(3));
				vo2.setPhone(rs.getString(4));
			}
			return vo2;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}

	// 고치기
	public int getUpdate(Hw0607_VO vo) {
		try {
			conn = getConnection();
			String sql = "update customer set name=?, address=?, phone=? where custid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getName());
			pstm.setString(2, vo.getAddress());
			pstm.setString(3, vo.getPhone());
			pstm.setString(4, vo.getCustid());
			int result = pstm.executeUpdate();
			return result;

		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 아이디 체크
	public boolean getIdChk(String custid) {
		// 중복이면 false , 중복아니면 true;
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "select custid from customer where custid= ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, custid);
			rs = pstm.executeQuery();

			int cnt = 0;
			if (rs.next()) {
				cnt++;
			}
			if (cnt == 0) {
				idchk = true;
			}
			return idchk;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return idchk;
	}
}
