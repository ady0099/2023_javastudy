package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//이번엔 문자 스트링으로 할 것 
public class EchoServer implements Runnable{
	
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;

	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기 중 ...");
			
			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				//에코서버는 받아서 아무짓안하고 다시 내보낸다. 
				
				//BufferedWriter 사용시 System.LineSeparator() 사용 
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
				
			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}

}