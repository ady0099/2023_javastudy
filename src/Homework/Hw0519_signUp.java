package Homework;

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

public class Hw0519_signUp extends JFrame {
	public Hw0519_signUp() {
		super("회원 가입");

		JPanel jp1_name = new JPanel();
		//이름 :
		JTextField name = new JTextField(10);
		jp1_name.add(new JLabel(" 이  름 : "));
		jp1_name.add(name);
		
		//성별: 남여 라디오
		
		JPanel jr = new JPanel();
		JRadioButton jrb1 = new JRadioButton("남");
		JRadioButton jrb2 = new JRadioButton("여");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		jp1_name.add(jrb1);
		jp1_name.add(jrb2);
	
		
		
		JPanel jp2_brith = new JPanel();
		//생년월일:
		
		JPanel jp3_addr = new JPanel();
		//주소
		
		JPanel jp4 = new JPanel();
		//부서명 : 콤보 부서
		
		JPanel jp5 = new JPanel();
		//취미: 체크박스 운동 영화 독서 컴퓨터
		
		JPanel jp6_intro = new JPanel();
		//자기소개
		
		JPanel jp7 = new JPanel();
		//텍스트A
		JTextArea jta = new JTextArea(20,0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		JPanel jp8 = new JPanel();
				
		JButton jbtn1 = new JButton("저장");
		JButton jbtn2 = new JButton("종료");
		JButton jbtn3 = new JButton("취소");
		
		jp8.add(jbtn1);
		jp8.add(jbtn2);
		jp8.add(jbtn3);
		
		
		



		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Hw0519_signUp();
	}
}
