package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_date {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		// 1. Date 클래스, 2. Calendar클래스, 3. LocalDate 클래스

		// 1. Date 클래스 : 기본생성자로 생성하면 컴퓨터의 시간으로 설정된다.
		// 최초버전부터 등장
		Date date = new Date();
		System.out.println(date);

		/*
		 * year - the year minus 1900. month - the month between 0-11. date - the day of
		 * the month between 1-31. hrs - the hours between 0-23. min - the minutes
		 * between 0-59. 이므로 월 계산할 때에는 +1을 해준다
		 */
		
		// 2. 기본 형태로 변환하기 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(date.getYear() + 1900 + "년");
		System.out.println(date.getMonth() + 1 +  "월");
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getSeconds() + "분");
		
		// 0-6, 0=>일요일, 6=>토요일
		int k = date.getDay();
		switch(k) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		
		}
		
		
		
		
		
		///////
		try {
			for (int i = 1; i < 88; i++) {
				System.out.print(i + "\t");
				Thread.sleep(1000);
				if (i % 5 == 0) {
					System.out.println();
				}
				if(i>19) {
					System.out.print(1+"\t");
					Thread.sleep(1000);
					i=1;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("오류 : " + e);

		}

	}
}
