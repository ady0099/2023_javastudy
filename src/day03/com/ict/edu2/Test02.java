package day03.com.ict.edu2;

public class Test02 {

	public static void main(String[] args) {
		// 2 시간 40분 30초는 몇 초 일까요?
		int result = 0;
		int hour = 2;
		int min = 40;
		int sec = 30;
		int t = 60;
		
		result = hour*t*t + min*t + sec;
		System.out.println(hour+"시간 "+min+"분 "+sec+"초를 초로 변환하면 "+result + "초입니다.");
		
		
		System.out.println("=======풀이=======");
		int h = 2 * 60 * 60; // 시간 => 초
		int m = 40 * 60;
		int s = 30;
		System.out.println("2시간 40분 30초는 ~ ");
		
	}

}
