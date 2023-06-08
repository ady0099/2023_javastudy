package Homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// 0531~0602 양식만들기(팀)

public class Hw0602_DbTable extends JFrame {
	JPanel conPanel, leftPanel, rightPanel, btnPanel;
	JPanel lp1, lp2, lp3, lp4, lp5;
	JLabel jl1, jl2, jl3, jl4, jl5, tbjl;
	JLabel[] jl;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, search;
	JTextField[] jtf;
	JTable addressBook;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	DefaultTableModel model;
	JComboBox<String> jcom;
	Vector<String> vec;

	public Hw0602_DbTable() {
		conPanel = new JPanel(new GridLayout(1, 2, 0, 0));
		leftPanel = new JPanel();
		JPanel[] left = new JPanel[5];
		for (int i = 0; i < left.length; i++) {
			left[i] = new JPanel();
		}

		jl1 = new JLabel("ID:");
		jl2 = new JLabel("이름:");
		jl3 = new JLabel("전화:");
		jl4 = new JLabel("주소:");
		jl5 = new JLabel("회사:");
		
		
		
		jl = new JLabel[] { jl1, jl2, jl3, jl4, jl5 };

		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jtf3 = new JTextField(20);
		jtf4 = new JTextField(20);
		jtf5 = new JTextField(20);
		jtf = new JTextField[] { jtf1, jtf2, jtf3, jtf4, jtf5 };

		lp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		lp1.add(jl1);
		lp1.add(jtf1);
		
		lp2.add(jl2);
		lp2.add(jtf2);
		
		lp3.add(jl3);
		lp3.add(jtf3);
		
		lp4.add(jl4);
		lp4.add(jtf4);
		
		lp5.add(jl5);
		lp5.add(jtf5);
		
		leftPanel.add(lp1);
		leftPanel.add(lp2);
		leftPanel.add(lp3);
		leftPanel.add(lp4);
		leftPanel.add(lp5);
		
		leftPanel.setSize(100,100);
//		for (int i = 0; i < left.length; i++) {
//			left[i].add(jl[i], BorderLayout.WEST);
//			left[i].add(jtf[i], BorderLayout.CENTER);
//		}
//		
//		for(int i=0; i<5; i++) {
//			leftPanel.add(left[i]);
//		}
		
//		String[][] data = {
//				{"100", "dada", "010-111-2225", "seoul", "cj"},
//				{"101", "jeeho", "010-1311-2525","seoul", "asianaidt"},
//				{"102", "feeho", "010-421-8812","tokyo", "ytsdt"},
//				{"103", "teeho", "010-251-2843","la", "bbt"},
//				{"104", "veeho", "010-9181-7769","busan", "lg"},
//				{"105", "xeasdeho", "010-111-7542","london", "samsung"}
//			};
		
//		conPanel.add(leftPanel, BorderLayout.WEST);

		
		JPanel jpxx = new JPanel();
		

		
		
	//	tbjl = new JLabel("Address Book");
	//	conPanel.add(tbjl, BorderLayout.NORTH);
		
		vec = new Vector<String>();
		vec.add("ID");
		vec.add("NAME");
		vec.add("Phone");
		vec.add("Address");
		vec.add("Company");
		model = new DefaultTableModel(vec, 12);
		addressBook = new JTable(model);
		JScrollPane jsp = new JScrollPane(addressBook);

		
		
		
		
	//	jpxx.add(tbjl, BorderLayout.NORTH);
		jpxx.add(jsp, BorderLayout.CENTER);
				
		conPanel.add(jpxx, BorderLayout.CENTER);
		
		add(conPanel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		btnPanel = new JPanel();
		jb1 = new JButton("추가");
		jb2 = new JButton("삭제");
		jb3 = new JButton("수정");
		String[] items = { "ID", "이름", "전화", "주소", "회사" };
		jcom = new JComboBox<>(items);
		jcom.setSelectedIndex(1);

		search = new JTextField(15);
		jb4 = new JButton("검색");
		jb5 = new JButton("지우기");
		jb6 = new JButton("전체보기");

		btnPanel.add(jb1);
		btnPanel.add(jb2);
		btnPanel.add(jb3);
		btnPanel.add(jcom);
		btnPanel.add(search);
		btnPanel.add(jb4);
		btnPanel.add(jb5);
		btnPanel.add(jb6);

	
		add(btnPanel, BorderLayout.SOUTH);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	

	public static void main(String[] args) {
		new Hw0602_DbTable();
	}
}
