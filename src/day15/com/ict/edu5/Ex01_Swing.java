package day15.com.ict.edu5;

import javax.swing.JFrame;

// module-info.java를 삭제하니 JFrame의 오류가 사라졌다?!
public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창");
		
		//JFrame jframe = new JFrame();
		//jframe.setTitle("Swing으로 만든 창");
		
		// 창 크기
		jframe.setSize(600,600);
		// 창 위치
		jframe.setLocation(0,0);
		
		// 표시여부(기본 : false)
		jframe.setVisible(true);
		
		
	}
}
