package Test_Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Test_DB.VO;
import Test_Server.Protocol;





public class Customer_Main extends JFrame implements Runnable{
	JPanel jp, jp_tf, jp_funtion, jp_title, jp_select;
	DefaultTableModel tableModel;
	JTable table;
	Object ob[][] = new Object[0][4];				
	String[] title = {"회원번호","이름", "주소","전화"};
	JScrollPane sc;
	JButton jb_insert, jb_delete, jb_update, jb_search, jb_eraser, jb_all;
	JTextField jtf_id, jtf_name, jtf_phone, jtf_addr, jtf_birth, jtf_select;
	String[] select = {"회원번호", "전화", "주소"}; 
	JComboBox<String> jcomb;
	
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	
	public Customer_Main() {	
				super("회원관리");

				jp_select = new JPanel();
				tableModel = new DefaultTableModel(ob, title);
				table = new JTable(tableModel);
				sc = new JScrollPane(table);
				table.setEnabled(false);
				jp_select.add(sc);
				
				
				jp_funtion = new JPanel(new GridLayout(2,1));
				jb_insert = new JButton("관리자 권한 추가");
				jb_delete = new JButton("삭 제");
				jb_update = new JButton("수 정");
				jcomb = new JComboBox<>(select);
				jtf_select = new JTextField(10);
				jb_search = new JButton("검 색");
				jb_eraser = new JButton("테이블 초기화");
				jb_all = new JButton("전체보기");
				
				jp_funtion.add(jb_insert);
				jp_funtion.add(jb_delete);
				jp_funtion.add(jb_update);
				jp_funtion.add(jb_all);
				jp_funtion.add(jcomb);
				jp_funtion.add(jtf_select);
				jp_funtion.add(jb_search);
				jp_funtion.add(jb_eraser);
	
				add(jp_select, BorderLayout.CENTER);
				add(jp_funtion, BorderLayout.SOUTH);
				
				pack();
				setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
				
				//서버 접속
				connected();
				
				addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						if (s != null) {
							try {
								Protocol p = new Protocol();
								p.setCmd(0);
								out.writeObject(p);
								out.flush();
							} catch (Exception e2) {
							}
						} else {
							closed();
						}
					}
				});
				jb_all.addActionListener(new ActionListener() {					
					@Override
					public void actionPerformed(ActionEvent e) {
						//전체보기 버튼 : Customer 테이블 전체 출력
						try {
							Protocol p = new Protocol();
							p.setCmd(1);
							out.writeObject(p);
							out.flush();
						} catch (Exception e2) {
	
						}
					}		
				
				});
				
				jb_search.addActionListener(new ActionListener() {				
					@Override
					public void actionPerformed(ActionEvent e) {
						//custid로 검색
						try {							
							Protocol p = new Protocol();
							p.setCmd(2);
							out.writeObject(p);
							out.flush();
						} catch (Exception e2) {
							
						}
					}
				});
				
				
	}		
	//접속
	public void connected() {
		try {
			s = new Socket("192.168.0.18", 7780);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 끝내기
		public void closed() {
			try {
				out.close();
				in.close();
				System.exit(0);
			} catch (Exception e) {
			}
		}



	@Override
	public void run() {
		esc:while(true) {
			try {
				Object obj = in.readObject();
				List<VO> list = null;
				Protocol p = (Protocol)obj;
				
				if(obj != null) {
					p = (Protocol)obj;
					switch (p.getCmd()) {
						case 0 : break esc;
						case 1: //전체보기
							list = p.getList();
							prn(list);
							break;
						case 2: //custid로 검색
							

					}
				}
			} catch (Exception e) {
			}
		}
		 closed();
	}
	public void prn(List<VO> list) {
		for (VO k : list) {
			Object data[] = {k.getCustid(), k.getName(), k.getAddress(),k.getPhone()};
			tableModel.addRow(data);
		}
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Customer_Main();
				
			}
		});
	}
}
