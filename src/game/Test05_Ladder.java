package game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test05_ladder extends JFrame {
	int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5=0, x6=0, x7=0;
	int y=70;
	JPanel jp1, jp2;
	JButton jb1, jb2;
	
	public Test05_ladder() {
		super("사다리타기");
		
		add(new ladderCanvas());

//		jp1 = new JPanel();
//		jb1 = new JButton("실행");
//		
//		jp1.add(jb1);
//		
//		add(jp1,BorderLayout.NORTH);
//		
//		jp2 = new JPanel();
//		jp2.add(new ladderCanvas());
//
//		add(jp2,BorderLayout.NORTH);
		
		
		// setSize(1000,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 500, ds.height / 2 - 400, 800, 800);

	}

//	int r1 = (int) (Math.random() * 256);
//	int g1 = (int) (Math.random() * 256);
//	int b1 = (int) (Math.random() * 256);
//
//	g.setColor(new Color(r1, g1, b1));
//	g.fillOval(x-wh/2, y-wh/2, wh, wh);	

	private class ladderCanvas extends Canvas {

		public ladderCanvas() {

		}

		@Override
		public void paint(Graphics g) {
			setBackground(Color.WHITE);
			
			x1=100;
			x2=200;
			x3=300;
			x4=400;
			x5=500;
			x6=600;
			x7=700;
			
			
			g.setColor(Color.LIGHT_GRAY);
			System.out.println("입력");
			Scanner sc = new Scanner(System.in);
			int num=sc.nextInt();
			
			for(int i=0; i<num; i++) {
				g.fillRect(x1, num, 5, 600);
				x1=num*i*x1;
				System.out.println(i);
			}
//			
//			g.fillRect(x1, y, 5, 600);
//			g.fillRect(x2, y, 5, 600);
//			g.fillRect(x3, y, 5, 600);
//			g.fillRect(x4, y, 5, 600);
//			g.fillRect(x5, y, 5, 600);
//			g.fillRect(x6, y, 5, 600);
//			g.fillRect(x7, y, 5, 600);
			
	
			
			
			
		}
	}

	public static void main(String[] args) {
		new Test05_ladder();
	}

}
