package network.com.ict.edu7;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChatClient2_card extends JFrame implements Runnable {
	JPanel pg1;
	CardLayout cardLayout;
	Card_One one;
	Card_Two two;
	Card_Three three;

	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	public ChatClient2_card() {
		super("멀티채팅 ver. 2.0");
		cardLayout = new CardLayout();
		pg1 = new JPanel();
		pg1.setBorder(new EmptyBorder(10, 10, 10, 10));
		pg1.setLayout(cardLayout);

		one = new Card_One(this);
		two = new Card_Two(this);
		three = new Card_Three(this);

		pg1.add("one", one);
		pg1.add("two", two);
		pg1.add("three", three);

		cardLayout.show(pg1, "one");

		add(pg1);
		setSize(380, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.18", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {
		}
		return false;
	}

	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 종료
						break esc;

					case 2: // 메세지
						three.jta.append(p.getMsg() + "\n");
						three.jta.setCaretPosition(three.jta.getText().length());
						break;
					}

				}
			} catch (Exception e) {
			}
		}
		closed();
		System.exit(0);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ChatClient2_card();
			}
		});
	}

}
