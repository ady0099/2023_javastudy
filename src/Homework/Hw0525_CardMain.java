package Homework;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

//개인)0524-25
//계산기,  성적, 나라입력 을
//카드레이아웃을 이용해서 호출하고 
//이벤트 처리 하자

public class Hw0525_CardMain extends JFrame {
	JPanel pg;
	CardLayout cardLayout;
	
	public Hw0525_CardMain() {
		super("카드레이아웃");

		pg = new JPanel();
		cardLayout = new CardLayout();
		pg.setLayout(cardLayout);
		
		Hw0525_CardMenu menu = new Hw0525_CardMenu(cardLayout, pg);
		Hw0525_CardCalc calc = new Hw0525_CardCalc(this);
		Hw0525_CardScore score = new Hw0525_CardScore(this);
		Hw0525_CardCap cap = new Hw0525_CardCap(this);
		
		pg.add("menu", menu);
		pg.add("calc", calc);
		pg.add("score", score);
		pg.add("cap", cap);
		
		
		add(pg);
		
		//pack();
		//setLocationRelativeTo(null);
		setResizable(false);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		

	public static void main(String[] args) {
		new Hw0525_CardMain();
	}
}
