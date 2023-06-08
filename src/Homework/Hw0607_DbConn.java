package Homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// 0530~0531
// CUSTID : , NAME : , ADDRESS : , PHONE :
// JTA
// 전체보기 삽입 삭제 검색 불러오기 고치기

public class Hw0607_DbConn extends JFrame {
	JPanel jp, jpBtn, jpId, jpName, jpAddr, jpPhone;
	JLabel jlId, jName, jlAddr, jlPhone;
	JTextField jtfId, jtfName, jtfAddr, jtfPhone;
	JTextArea jta;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public Hw0607_DbConn() {
		super("DB 연동 정보");

		jp = new JPanel(new GridLayout(4, 2, -7, -7));

		jpId = new JPanel();
		jlId = new JLabel("CUSTID : ");
		jpId.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpId.add(jlId);

		jtfId = new JTextField(30);
		jpId.add(jtfId);

		jpName = new JPanel();
		jName = new JLabel("NAME : ");
		jpName.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpName.add(jName);

		jtfName = new JTextField(30);
		jpName.add(jtfName);

		jpAddr = new JPanel();
		jlAddr = new JLabel("ADDRESS : ");
		jpAddr.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpAddr.add(jlAddr);

		jtfAddr = new JTextField(30);
		jpAddr.add(jtfAddr);

		jpPhone = new JPanel();
		jlPhone = new JLabel("PHONE : ");
		jpPhone.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpPhone.add(jlPhone);

		jtfPhone = new JTextField(30);
		jpPhone.add(jtfPhone);

		jlId.setHorizontalAlignment(JLabel.CENTER);
		jName.setHorizontalAlignment(JLabel.CENTER);
		jlAddr.setHorizontalAlignment(JLabel.CENTER);
		jlPhone.setHorizontalAlignment(JLabel.CENTER);

		jp.add(jlId);
		jp.add(jpId);
		jp.add(jName);
		jp.add(jpName);
		jp.add(jlAddr);
		jp.add(jpAddr);
		jp.add(jlPhone);
		jp.add(jpPhone);

		JTextArea jta = new JTextArea(29, 52);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setSize(getPreferredSize());
		// 편집 불가능하게 만들자
		jta.setEditable(false);

		jpBtn = new JPanel();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");

		jpBtn.add(jb1);
		jpBtn.add(jb2);
		jpBtn.add(jb3);
		jpBtn.add(jb4);
		jpBtn.add(jb5);
		jpBtn.add(jb6);
		jb6.setEnabled(false);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jpBtn, BorderLayout.SOUTH);

		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ady";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");

			String sql = "select * from customer order by custid asc";
			
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//sql = "insert into customer(custid, name, address, phone) "
			//		+ "values(8, '팔강인', '대한민국 서울', '000-9000-0001' )";
			
			//sql = "delete from";
			

			
//			pstmt = conn.createStatement();
//			
//			res = stmt.executeUpdate(sql);
//			if (res > 0) {
//				// 성공하면 select문을 이용해서 보자
//				sql = "select * from customer order by custid";
//				rs = stmt.executeQuery(sql);
//			}
			

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("오류!! 클래스없음");
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				System.out.println("제대로 안닫힘");
				System.out.println(e);
			}

		}
		
		
		
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showMember();
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jb6.setEnabled(true);
			}
		});
		

	}
	public String showMember() {
		String str = "select * from customer order by custid asc";
		return str;
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
		new Hw0607_DbConn();
	}
}
