package Homework0506;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw0518_Cal3 extends JFrame {
	public Hw0518_Cal3() {
		super("성적계산");
		
		JPanel tfp = new JPanel();
		tfp.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		JTextField jtf1 = new JTextField(10);
		jp.add(new JLabel("이름 : "));
		jp.add(jtf1);
		
		
		JPanel jp2 = new JPanel();
		
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(10);
		JTextField jtf4 = new JTextField(10);

		jp2.add(new JLabel("국어 : "));
		jp2.add(jtf2);
		jp2.add(new JLabel("영어 : "));
		jp2.add(jtf3);
		jp2.add(new JLabel("수학 : "));
		jp2.add(jtf4);
		

		tfp.add(jp,BorderLayout.NORTH);
		tfp.add(jp2,BorderLayout.SOUTH);

		

		
		JPanel jpta = new JPanel();

		
		JTextArea jta = new JTextArea();
		

		jta.setLineWrap(true); // 자동 줄 바꾸기
		JScrollPane jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jpta.add(jsp);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		jpta.add(jsp);
		add(tfp,BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 260, ds.height / 2 - 300, 520, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Hw0518_Cal3();

	}

}
