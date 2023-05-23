package day03.com.ict.edu2;

public class Test03 {

	public static void main(String[] args) {
		// 3989초는 몇 시간, 몇 분, 몇 초 인가?
		int hour, min, sec;
		int time = 3989;
		int t = 60;
		
		hour = time/(t*t); 
		min = time%(t*t)/t;
		sec = (time%(t*t))%t;
		
		System.out.println(hour +"시간 "+min+"분 "+sec+"초");

		
		
		System.out.println("===================");
		int hour2, min2, sec2;
	
		hour2 = time/3600;
		time -= hour2*3600;
		
		min2 = time/60;
		time -= min2*60;
		
		sec2 = time;
		
		System.out.print(hour2+"시간 ");
		System.out.print(min2+"분 ");
		System.out.println(sec2+"초");
		
		
		
		
		System.out.println("=======풀이=======");
		int time3 = 3989;
		int h = 0;		// 시
		int m = 0;		// 분
		int s = 0;		// 초
		int res = 0;	// 나머지
		
		h = time3/(60*60);
		res = time3%(60*60);
		
		m = res / 60;	// 분
		s = res % 60;	// 초
		
	}

}
