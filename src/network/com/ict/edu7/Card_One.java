package network.com.ict.edu7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Card_One extends JPanel {
	ChatClient2_card client2;
	JPanel login_p;
	JLabel img;
	JButton login_bt;

	public Card_One(ChatClient2_card client2) {
		this.client2 = client2;
		setLayout(new BorderLayout());

		login_p = new JPanel(new BorderLayout());

		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/img/chat.PNG")));

		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		JPanel jp1_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp1_1.add(new JLabel("닉네임 : "));
		JTextField nickname_tf = new JTextField(10);
		jp1_1.add(nickname_tf);

		JPanel jp1_2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		login_bt = new JButton(" 입장하기 ");
		jp1_2.add(login_bt);

		jp1.add(jp1_1);
		jp1.add(jp1_2);

		login_p.add(img, BorderLayout.CENTER);
		login_p.add(jp1, BorderLayout.SOUTH);

		add(login_p);

		// 입장하기
		login_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickname_tf.getText().trim();
				if (name.length() > 0) {
					// 서버 접속
					if (client2.connected()) {
						try {
							// 닉네임 보내기
							Protocol p = new Protocol();
							p.setCmd(2);
							p.setMsg(name);
							client2.out.writeObject(p);
							client2.cardLayout.show(client2.pg1, "wait");
						} catch (Exception e2) {
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}
			}
		});

	}
}
