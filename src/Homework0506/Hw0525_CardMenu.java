package Homework0506;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Hw0525_CardMenu extends JPanel{
	JPanel pg;
	CardLayout cardLayout;
	JButton btnCal, btnScore, btnCap, btnExit;
	
	public Hw0525_CardMenu(CardLayout cardLayout, JPanel pg) {
		this.cardLayout = cardLayout;
		this.pg = pg;
		
		JPanel pgMenu = new JPanel(new GridLayout(4,1,0,40));
		
		btnCal = new JButton("계산기");
		btnScore = new JButton("성적 처리 프로그램");
		btnCap = new JButton("수도 찾기");
	
		btnExit = new JButton("종료");
		
		btnCal.setPreferredSize(new Dimension(200,85));
		btnScore.setPreferredSize(new Dimension(200,85));
		btnCap.setPreferredSize(new Dimension(200,85));
		btnExit.setPreferredSize(new Dimension(200,85));
		
		pgMenu.add(btnCal);
		pgMenu.add(btnScore);
		pgMenu.add(btnCap);
		pgMenu.add(btnExit);
		
		
	
		add(pgMenu);
		
		
		
		
		btnCal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				cardLayout.show(pg, "calc");
			}
		});
		btnScore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				cardLayout.show(pg, "score");
			}
		});
		btnCap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				cardLayout.show(pg, "cap");
			}
		});
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				System.exit(0);
			}
		});

	}
}
