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

//개인)0524-25
//계산기,  성적, 나라입력 을
//카드레이아웃을 이용해서 호출하고 
//이벤트 처리 하자

public class Hw0525_CardCalc extends JFrame implements ActionListener {
	Hw0525_CardMain main;
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JScrollPane jsp;
	JButton calc, exit, reset, back;

	public Hw0525_CardCalc(Hw0525_CardMain main) {
		super("계산기");
		this.main = main;
		
		jp1 = new JPanel();
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		

		jp1.add(new JLabel("수1 "));
		jp1.add(jtf1);
		jp1.add(new JLabel("수2 "));
		jp1.add(jtf2);

		jp1.add(new JLabel("연산자 : "));
		jrb1 = new JRadioButton(" + ", true);
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" x ");
		jrb4 = new JRadioButton(" ÷ ");

		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);

		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		jta = new JTextArea(10, 10);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp2 = new JPanel();

		calc = new JButton("계산");
		exit = new JButton("종료");
		reset = new JButton("초기화");
		back = new JButton("뒤로가기");
		
		jp2.add(calc);
		jp2.add(exit);
		jp2.add(reset);
		jp2.add(back);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		calc.addActionListener(this);
		exit.addActionListener(this);
		reset.addActionListener(this);
	
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				main.setVisible(true);

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		if (obj == exit) {
			System.out.println("프로그램 종료");
			System.exit(0);
		} else if (obj == reset) {
			// bg.clearSelection();
			jrb1.setSelected(true); // default => +연산자
			jtf1.setText("");
			jtf2.setText("");
			jtf1.requestFocus();
			jta.setText("");
			System.out.println("값 초기화");
		} else if (obj == calc) {
			calc();
		}

	}

	void calc() {
		String regX = "[0-9]+";

		String a = jtf1.getText();
		String b = jtf2.getText();
		String op = "";
		String xPar = "";
		Object x = null; // 중복 코드를 줄이기 위한 오브젝트 변수 선언

		double par = 0.0;

		try {
			if (a.length() == 0 || b.length() == 0) {
				jta.setText("빈칸에 숫자를 입력해주세요.\n");
			} else {
				if (a.matches(regX) || b.matches(regX)) {
					if (jrb1.isSelected()) {
						op = jrb1.getText();
						par = Double.parseDouble(a) + Double.parseDouble(b);
					} else if (jrb2.isSelected()) {
						op = jrb2.getText();
						par = Double.parseDouble(a) - Double.parseDouble(b);
					} else if (jrb3.isSelected()) {
						op = jrb3.getText();
						par = Double.parseDouble(a) * Double.parseDouble(b);
					} else if (jrb4.isSelected()) {
						op = jrb4.getText();
						if (!(b.equals("0"))) {
							par = Double.parseDouble(a) / Double.parseDouble(b);
						} else {
							jta.append("0으로 나눌 수 없습니다.\n");
						}
						// else if (!(jrb1.isSelected()) && !(jrb2.isSelected()) &&
						// !(jrb3.isSelected()){
						// && !(jrb4.isSelected()))
						// jta.setText("연산자를 선택해주세요."); } / default가 초기화값일 경우 사용
					}

					if ((par == Math.abs(par)) || (par == Math.abs(par) * (-1))) {
						if (jrb4.isSelected()) {
							if (!(b.equals("0"))) {
								x = a + " " + op + " " + b + "  =  " + par + "\n";
							}
						} else {
							xPar = ("" + par).substring(0, ("" + par).length() - 2);
							x = a + " " + op + " " + b + "  =  " + xPar + "\n";
						}
						jta.append((String) x);
					}
				}
			}
		} catch (NumberFormatException ex) {
			jta.append("숫자를 제대로 입력해주세요.\n");
		} catch (Exception ex) {
			jta.append("숫자만 입력해주세요.\n");
		}
	}

}
