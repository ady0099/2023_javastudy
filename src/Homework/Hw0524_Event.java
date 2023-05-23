package Homework;

import java.awt.BorderLayout;
import java.awt.Font;
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
import javax.swing.text.StyledEditorKit.FontSizeAction;

// 1번 숙제
// panel1 - 수1 : / 수 2: / 연산자 라디오버튼
// jta
// 계산 종료 초기화

public class Hw0524_Event extends JFrame implements ActionListener {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JScrollPane jsp;
	JButton calc, exit, reset;

	public Hw0524_Event() {
		super("계산기");

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

		jp2.add(calc);
		jp2.add(exit);
		jp2.add(reset);

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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		if (obj == exit) {
			System.out.println("프로그램 종료");
			System.exit(0);
		} else if (obj == reset) {
			// bg.clearSelection();
			jrb1.setSelected(true);
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
		String[] jrb = new String[4];
		
		int par = 0;
		double par2 = 0.0;

		try {
			if (a.length() == 0 || b.length() == 0) {
				jta.setText("빈칸에 숫자를 입력해주세요.");
			}
			if (a.matches(regX) || b.matches(regX)) {
				jrb[0] = jrb1.getText();
				if (jrb1.isSelected()) {
					op = jrb1.getText();
					par = Integer.parseInt(a) + Integer.parseInt(b);
					jta.setText(a + " " + op + " " + b + "  =  \n" + par);

					System.out.println("calc() 실행.. [" + op + "]연산.. 값 : " + par);

				} else if (jrb2.isSelected()) {
					op = jrb2.getText();
					par = Integer.parseInt(a) - Integer.parseInt(b);
					jta.setText(a + " " + op + " " + b + "  =  \n" + par);
					System.out.println("calc() 실행.. [" + op + "]연산.. 값 : " + par);

				} else if (jrb3.isSelected()) {
					op = jrb3.getText();
					par = Integer.parseInt(a) * Integer.parseInt(b);
					jta.setText(a + " " + op + " " + b + "  =  \n" + par);
					System.out.println("calc() 실행.. [" + op + "]연산.. 값 : " + par);
				} else if (jrb4.isSelected()) {
					op = jrb4.getText();
					par2 = Double.parseDouble(a) / Double.parseDouble(b);
					jta.setText(a + " " + op + " " + b + "  =  \n" + par2);
					System.out.println("calc() 실행.. [" + op + "]연산.. 값 : " + par2);
				} else if (!(jrb1.isSelected()) || !(jrb2.isSelected()) || !(jrb3.isSelected()) || !(jrb4.isSelected()))
					jta.setText("연산자를 선택해주세요.");

			}

		} catch (ArithmeticException ex) {
			jta.setText("0으로 나눌 수 없습니다.");
		} catch (NumberFormatException ex) {
			jta.setText("숫자를 제대로 입력해주세요.");
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void main(String[] args) {
		new Hw0524_Event();
	}

}
