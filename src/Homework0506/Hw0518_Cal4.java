package Homework0506;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Hw0518_Cal4 extends JFrame {
	public Hw0518_Cal4() {
		super("카페 주문");
		JPanel tfp = new JPanel();
		tfp.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		JLabel jla = new JLabel("원하는 음료를 선택하세요");
		jp.add(jla);
		
		JPanel jr = new JPanel();
		JRadioButton jbtn1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jbtn2 = new JRadioButton("카페모카(4000)");
		JRadioButton jbtn3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jbtn4 = new JRadioButton("과일쥬스(3000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jbtn1);
		bg.add(jbtn2);
		bg.add(jbtn3);
		bg.add(jbtn4);
		
		jr.add(jbtn1);
		jr.add(jbtn2);
		jr.add(jbtn3);
		jr.add(jbtn4);

		JPanel jp2 =new JPanel();
		JTextField jtf1 = new JTextField(8);
		JTextField jtf2 = new JTextField(8);
		
		jp2.add(new JLabel("수량 : "));
		jp2.add(jtf1);
		jp2.add(new JLabel("입금액 : "));
		jp2.add(jtf2);
		
		
		tfp.add(jp,BorderLayout.NORTH);
		tfp.add(jr,BorderLayout.CENTER);
		tfp.add(jp2,BorderLayout.SOUTH);
		
	
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsf = new JScrollPane(jta);
		

		JPanel jp3 =new JPanel();
		JButton jbu1 = new JButton("계산");
		JButton jbu2 = new JButton("종료");
		JButton jbu3 = new JButton("취소");

		jp3.add(jbu1);
		jp3.add(jbu2);
		jp3.add(jbu3);
		

		add(tfp,BorderLayout.NORTH);
		add(jsf,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);


		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 275, ds.height / 2 - 300, 550, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Hw0518_Cal4();

	}

}
