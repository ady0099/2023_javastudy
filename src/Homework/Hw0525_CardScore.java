package Homework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import day21.com.ict.edu.Ex03_Join;
import day21.com.ict.edu.Ex03_Main;

public class Hw0525_CardScore extends JFrame implements ActionListener{
	JPanel jp1, jp2, jp3, jp4;
	JTextField nameF, kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton calc, exit, reset;
	String hak = "";

	double korNum = 0.0, engNum = 0.0, mathNum = 0.0;
	double sum = 0.0;
	double avg = 0.0;

	public Hw0525_CardScore() {
		super("성적");

		jp1 = new JPanel();
		nameF = new JTextField(5);

		jp1.add(new JLabel("이름 : "));
		jp1.add(nameF);

		jp2 = new JPanel();
		kor = new JTextField(5);
		eng = new JTextField(5);
		math = new JTextField(5);

		jp2.add(new JLabel("국어 : "));
		jp2.add(kor);
		jp2.add(new JLabel("영어 : "));
		jp2.add(eng);
		jp2.add(new JLabel("수학 : "));
		jp2.add(math);

		jta = new JTextArea(20, 40);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp3 = new JPanel();

		calc = new JButton("계산");
		exit = new JButton("종료");
		reset = new JButton("초기화");

		jp3.add(calc);
		jp3.add(exit);
		jp3.add(reset);

		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());

		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		calc.addActionListener(this);
		exit.addActionListener(this);
		reset.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		if (obj == exit) {
			System.out.println("프로그램 종료");
			System.exit(0);
		} else if (obj == reset) {
			nameF.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
			nameF.requestFocus(); // 초기화 시 이름에 focus
			jta.setText("");
			System.out.println("값 초기화");
		} else if (obj == calc) {
			calc();
			System.out.println("성적 계산");
		}

	}
	void calc() {

		try {
			int nameL = nameF.getText().length();
			int korL = kor.getText().length();
			int engL = eng.getText().length();
			int mathL = math.getText().length();

			if (nameL == 0) {
				jta.append("이름을 입력해주세요.\n\n");
				nameF.requestFocus();
			} else if (korL == 0) {
				jta.append("국어 점수를 입력해주세요.\n\n");
				kor.requestFocus();
			} else if (engL == 0) {
				jta.append("영어 점수를 입력해주세요.\n\n");
				eng.requestFocus();
			} else if (mathL == 0) {
				jta.append("수학 점수를 입력해주세요.\n\n");
				math.requestFocus();
			} else {

				korNum = Double.parseDouble(kor.getText());
				engNum = Double.parseDouble(eng.getText());
				mathNum = Double.parseDouble(math.getText());

				jta.append(name());
				jta.append(sum(korNum, engNum, mathNum));
				jta.append(avg(sum));
				jta.append(hak(avg));
				nameF.requestFocus();
			}
		} catch (Exception e) {
			System.out.println(e);
			jta.append("빈칸을 제대로 입력해주세요.\n\n");
		}

	}

	public String name() {
		return "이름 : " + nameF.getText() + "\n";
	}

	public String sum(double korNum, double engNum, double mathNum) {
		sum = korNum + engNum + mathNum;
		return "총점 : " + sum + "\n";
	}

	public String avg(double sum) {
		avg = (int) (sum * 100 / 3) / 100;
		return "평균 : " + avg + "\n";
	}

	public String hak(double avg) {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		return "학점 : " + hak + "\n\n";
	}

	public static void main(String[] args) {
		new Hw0525_CardScore();
	}
}
