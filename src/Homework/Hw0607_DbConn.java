package Homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// CUSTID : , NAME : , ADDRESS : , PHONE :
// JTA
// 전체보기 삽입 삭제 검색 불러오기 고치기

public class Hw0607_DbConn extends JFrame {
	JPanel jp, jpBtn, jpId, jpName, jpAddr, jpPhone;
	JLabel jlId, jName, jlAddr, jlPhone;
	JTextField jtfId, jtfName, jtfAddr, jtfPhone;
	JTextArea jta;
	JButton jb1, jb2, jb3, jb4; //, jb5, jb6;

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
//		jb5 = new JButton("불러오기");
//		jb6 = new JButton("고치기");

		jpBtn.add(jb1);
		jpBtn.add(jb2);
		jpBtn.add(jb3);
		jpBtn.add(jb4);
//		jpBtn.add(jb5);
//		jpBtn.add(jb6);
//		jb6.setEnabled(false);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jpBtn, BorderLayout.SOUTH);

		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				ArrayList<Hw0607_VO> list = Hw0607_DAO.getInstance().getSelectAll();
				jta.append("\n\t\t 회원 전체 정보 \n\n");
				jta.append("\t번호\t이름\t주소\t전화번호\n");
				for (Hw0607_VO k : list) {
					jta.append("\t" + k.getCustid() + "\t");
					jta.append(k.getName() + "\t");
					jta.append(k.getAddress() + "\t");
					jta.append(k.getPhone() + "\n");
				}
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtfId.getText().trim();
				String name = jtfName.getText().trim();
				String address = jtfAddr.getText().trim();
				String phone = jtfPhone.getText().trim();

				if (custid.length() > 0) {
					boolean idchk = Hw0607_DAO.getInstance().getIdChk(custid);
					jta.setText("");
					if (idchk) {
						Hw0607_VO vo = new Hw0607_VO();
						vo.setCustid(custid);
						vo.setName(name);
						vo.setAddress(address);
						vo.setPhone(phone);
						int res = Hw0607_DAO.getInstance().getInsert(vo);
						if (res > 0) {
							JOptionPane.showMessageDialog(getParent(), "삽입 성공");

						} else {
							JOptionPane.showMessageDialog(getParent(), "삽입 실패");
						}

					} else {
						JOptionPane.showMessageDialog(getParent(), "같은 custid가 존재합니다.");
					}
					ArrayList<Hw0607_VO> list = Hw0607_DAO.getInstance().getSelectAll();
					jta.append("\n\t\t 회원 전체 정보 \n\n");
					jta.append("\t번호\t이름\t주소\t전화번호\n");
					for (Hw0607_VO k : list) {
						jta.append("\t" + k.getCustid() + "\t");
						jta.append(k.getName() + "\t");
						jta.append(k.getAddress() + "\t");
						jta.append(k.getPhone() + "\n");
					}
					
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtfId.setText("");
				jtfName.setText("");
				jtfAddr.setText("");
				jtfPhone.setText("");
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtfId.getText().trim();
				if (custid.length() > 0) {
					// custid 중복이면 삭제가능
					boolean idchk = Hw0607_DAO.getInstance().getIdChk(custid);
					jta.setText("");
					// false 중복
					if (idchk) {
						JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						ArrayList<Hw0607_VO> list = Hw0607_DAO.getInstance().getSelectAll();
						jta.append("\n\t\t 회원 전체 정보 \n\n");
						jta.append("\t번호\t이름\t주소\t전화번호\n");
						for (Hw0607_VO k : list) {
							jta.append("\t" + k.getCustid() + "\t");
							jta.append(k.getName() + "\t");
							jta.append(k.getAddress() + "\t");
							jta.append(k.getPhone() + "\n");
						}
					} else {
						Hw0607_VO vo = new Hw0607_VO();
						vo.setCustid(custid);
						int result = Hw0607_DAO.getInstance().getDelete(vo);
						if (result > 0) {
							JOptionPane.showMessageDialog(getParent(), "삭제 성공");
							ArrayList<Hw0607_VO> list = Hw0607_DAO.getInstance().getSelectAll();
							jta.append("\n\t\t 회원 전체 정보 \n\n");
							jta.append("\t번호\t이름\t주소\t전화번호\n");
							for (Hw0607_VO k : list) {
								jta.append("\t" + k.getCustid() + "\t");
								jta.append(k.getName() + "\t");
								jta.append(k.getAddress() + "\t");
								jta.append(k.getPhone() + "\n");
							}

						} else {
							JOptionPane.showMessageDialog(getParent(), "삭제 실패");
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtfId.setText("");
				jtfName.setText("");
				jtfAddr.setText("");
				jtfPhone.setText("");
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) (e.getSource());
				String msg = obj.getText();
				if (msg.equals("검색")) {
					String custid = jtfId.getText().trim();
					if (custid.length() > 0) {
						boolean idchk = Hw0607_DAO.getInstance().getIdChk(custid);
						jta.setText("");
						// false 중복
						if (idchk) {
							JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						} else {
							Hw0607_VO vo = new Hw0607_VO();
							vo.setCustid(custid);
							Hw0607_VO vo2 = Hw0607_DAO.getInstance().getSelectOne(vo);
							jtfName.setText(vo2.getName());
							jtfAddr.setText(vo2.getAddress());
							jtfPhone.setText(vo2.getPhone());
							jtfId.setEditable(false);
							jb4.setText("고치기");
							jb1.setEnabled(false);
							jb2.setEnabled(false);
							jb3.setEnabled(false);
						}
					} else {
						JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
					}

				} else if (msg.equals("고치기")) {
					Hw0607_VO vo = new Hw0607_VO();
					vo.setCustid(jtfId.getText());
					vo.setName(jtfName.getText());
					vo.setAddress(jtfAddr.getText());
					vo.setPhone(jtfPhone.getText());

					int result = Hw0607_DAO.getInstance().getUpdate(vo);
					if (result > 0) {
						jta.setText("");
						JOptionPane.showMessageDialog(getParent(), "수정 성공");
						ArrayList<Hw0607_VO> list = Hw0607_DAO.getInstance().getSelectAll();
						jta.append("\n\t\t 회원 전체 정보 \n\n");
						jta.append("\t번호\t이름\t주소\t전화번호\n");
						for (Hw0607_VO k : list) {
							jta.append("\t" + k.getCustid() + "\t");
							jta.append(k.getName() + "\t");
							jta.append(k.getAddress() + "\t");
							jta.append(k.getPhone() + "\n");
						}
					}

					jb4.setText("검색");
					jb1.setEnabled(true);
					jb2.setEnabled(true);
					jb3.setEnabled(true);
					jtfId.setText("");
					jtfId.setEditable(true);
					jtfName.setText("");
					jtfAddr.setText("");
					jtfPhone.setText("");
				}
			}
		});
//		jb5.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				jb6.setEnabled(true);
//			}
//		});
	}

	public static void main(String[] args) {
		new Hw0607_DbConn();
	}
}
