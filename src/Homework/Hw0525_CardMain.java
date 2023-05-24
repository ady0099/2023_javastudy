package Homework;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import day21.com.ict.edu.Ex03_Join;
import day21.com.ict.edu.Ex03_Main;

//개인)0524-25
//계산기,  성적, 나라입력 을
//카드레이아웃을 이용해서 호출하고 
//이벤트 처리 하자

public class Hw0525_CardMain extends JFrame {
	JPanel pm,jp;
	JButton jb1, jb2, jb3;
	CardLayout cardLayout;
	
	public Hw0525_CardMain() {
		super("카드레이아웃");

		pm = new JPanel();
		cardLayout = new CardLayout();
		pm.setLayout(cardLayout);
		
//		Hw0525_CardCalc calc = new Hw0525_CardCalc(this);
//		Hw0525_CardScore score = new Hw0525_CardScore(this);
//		Hw0525_CardCap cap = new Hw0525_CardCap(this);
//		
//		pm.add("calc", calc);
//		pm.add("score", score);
//		pm.add("cap", cap);
	
		jp = new JPanel();
		jb1 = new JButton("계산기");
		jb2 = new JButton("성적 처리 프로그램");
		jb3 = new JButton("수도 찾기");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);

		add(pm);
		add(jp);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
//				new Hw0525_CardMain("calc", calc);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Hw0525_CardMain();
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Hw0525_CardMain();
			}
		});

	}

	public static void main(String[] args) {
		Hw0525_CardMain cm = new Hw0525_CardMain();
//		cm.setFr
	}
}
