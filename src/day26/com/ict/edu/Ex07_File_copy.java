package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_copy extends JFrame {
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JButton jb;
	JTextField jtf1, jtf2;
	String in_path, out_path;
	
	public Ex07_File_copy() {
		super("복사하기");

		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jl1 = new JLabel("원본위치 : ");
		jtf1 = new JTextField("경로 선택", 20);
		jl2 = new JLabel("사본위치 : ");
		jtf2 = new JTextField(20);

		jb = new JButton("복사하기");

		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		jp1.add(jl1);
		jp1.add(jtf1);
		jp2.add(jl2);
		jp2.add(jtf2);
		jp2.add(jb);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		setSize(402,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		//setResizable(false);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldPathName = jtf1.getText().trim();
				String newPathName = jtf2.getName().trim();
				
				// 파일은 무조건 바이트스트림으로 처리하자.
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				try {
					fis = new FileInputStream(oldPathName);
					bis = new BufferedInputStream(fis);
					fos = new FileOutputStream(newPathName);
					bos = new BufferedOutputStream(fos);
					
					int b = 0;
					while((b=bis.read()) != -1) {
						bos.write(b);
					}
					bos.flush();
					jtf1.setText("");
					jtf2.setText("");
				}catch(Exception e2){
				}finally {
					try {
						bos.close();
						fos.close();
						bis.close();
						fis.close();
					}catch(Exception e3){
						
					}
					
				}
			}
		});

		
		// 원본파일 : LOAD
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
					System.out.println("원본위치 : "+msg);
					//f_open();
				}else {
					System.out.println("원본위치 선택 취소");
				}
			}
		});
		// 사본파일 : SAVE
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				
				if(! msg.equals("nullnull")) {
					System.out.println("사본위치 : "+msg);
					jtf2.setText(msg);
				}else {
					System.out.println("사본위치 선택 취소");
				}
			}
		});
		
		

	}

	public static void main(String[] args) {
		new Ex07_File_copy();
	}
}
