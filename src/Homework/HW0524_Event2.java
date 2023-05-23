package Homework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//2번
//panel1 - 이름 : 홍길동
//panel2 - 국영수
//jta 이름 총점 평균 학점
//계산 / 종료 / 초기화

public class HW0524_Event2 extends JFrame implements ActionListener {
	JPanel jp1, jp2, jp3, jp4;
	JTextField name, kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton calc, exit, reset;
	String str="";
	
	String name2="";
	double korNum=0.0, engNum=0.0, mathNum=0.0;
	double sum=0.0;
	double avg=0.0;
	
	public HW0524_Event2() {
		super("성적");
		
		jp1 = new JPanel();
		name = new JTextField(5);
		

		jp1.add(new JLabel("이름 : "));
		jp1.add(name);
		
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
			name.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
			name.requestFocus(); // 초기화 시 이름에 focus
			jta.setText("");
			System.out.println("값 초기화");
		} else if (obj == calc) {
			calc();
	
		}

		
		
	}
	void calc() {
			name();
		try {
			korNum = Double.parseDouble(kor.getText());
			engNum = Double.parseDouble(eng.getText());
			mathNum = Double.parseDouble(math.getText());
		}catch (Exception e) {
			jta.append("숫자를 입력해주세요.");
		}
			jta.append("이름 : " + str+"\n");
			sum();
			
			jta.append("총점 : " + str+"\n");
			avg();
			
			jta.append("평균 : " + str+"\n");
			hak();
			jta.append("학점 : " + str+"\n");
		}

	void name() {
		jta.append("이름 : "+name.getText());
	}
	void sum() {
		sum = korNum + engNum + mathNum;
	}
	void avg() {
		avg = sum / 3;
		name.getText();
		// (int) (sum);
		// (int) (avg * 10) / 10.0;
	}
	void hak() {
		if (avg >= 90) {
			str = "A학점";
		} else if (avg >= 80) {
			str = "B학점";
		} else if (avg >= 70) {
			str = "C학점";
		} else {
			str = "F학점";
		}
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	public static void main(String[] args) {
		new HW0524_Event2();
	}
}
