package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	
	// 생성자에 인자를 받으면 전역변수로 빼라
	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
			ip = s.getInetAddress().getHostAddress();
			
		}catch(Exception e) {
			
		}
	
	}

	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					// 원격에 있는 실제 클라이언트에게 종료 메세지 보냄
					out.println("~~bye");
					break;
				}
				server.sendMsg(ip + ":" + msg);
				
			}catch(Exception e) {
				
			}
			
			
		}// 무한 반복
		try {
			out.close();
			in.close();
			s.close();
			
			// server에 있는 list에 현재 객체 삭제
			server.removeClient(this);
			
			server.sendMsg(ip + "님 퇴장");
		}catch(Exception e) {
			
		}
	}
}
