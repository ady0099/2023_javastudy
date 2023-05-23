package Homework;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hw0518_Cal2 extends JFrame{
	public Hw0518_Cal2() {
		super("계산기");
		
		
		JPanel btn = new JPanel();
		btn.setLayout(new GridLayout(5,3,5,7));
	
		JTextField jtf = new JTextField(20);
		
		
		
		String[] jBtn = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/","="};
		
		for(int i = 0; i<jBtn.length; i++) {
			JButton j = new JButton(jBtn[i]);
			btn.add(j, new GridLayout(5,2,3,3));
		}
	
		add(jtf, BorderLayout.NORTH);
		add(btn);

		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-125, 300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Hw0518_Cal2();
	}
}
