package network.com.ict.edu7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Card_Three extends JPanel {
	ChatClient2_card client2;
	JPanel chat_p;
	JList join_list;
	JTextArea jta;
	JTextField msg_tf;
	JButton out_bt, send_bt;

	public Card_Three(ChatClient2_card client2) {
		this.client2 = client2;
		setLayout(new BorderLayout());

		chat_p = new JPanel();
		chat_p.setLayout(new BorderLayout());

		JPanel ch_east = new JPanel();
		ch_east.setLayout(new BorderLayout());
		ch_east.setPreferredSize(new Dimension(90, 300));
		ch_east.add(new JLabel(" [참여자] "), BorderLayout.NORTH);

		join_list = new JList();
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setViewportView(join_list);
		ch_east.add(jsp3, BorderLayout.CENTER);

		out_bt = new JButton("방 나가기");
		ch_east.add(out_bt, BorderLayout.SOUTH);

		JPanel ch_center = new JPanel();
		ch_center.setLayout(new BorderLayout());

		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		JScrollPane jsp4 = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		ch_center.add(jsp4, BorderLayout.CENTER);

		JPanel center_south = new JPanel();
		center_south.setLayout(new BorderLayout());

		msg_tf = new JTextField();
		send_bt = new JButton("보내기");

		center_south.add(msg_tf, BorderLayout.CENTER);
		center_south.add(send_bt, BorderLayout.EAST);

		ch_center.add(center_south, BorderLayout.SOUTH);

		chat_p.add(ch_east, BorderLayout.EAST);
		chat_p.add(ch_center, BorderLayout.CENTER);

		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		msg_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

		// 방 나가기
		out_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jta.setText("");
					Protocol p = new Protocol();
					p.setCmd(5);
					client2.out.writeObject(p);
					client2.out.flush();
					client2.cardLayout.show(client2.pg1, "wait");
				} catch (Exception e2) {
				}

			}
		});

	}
	private void sendMessage() {
		try {
			String msg = msg_tf.getText().trim();
			if (msg.length() > 0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				client2.out.writeObject(p);
				client2.out.flush();
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {
		}
	}
}
