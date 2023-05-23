package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if문 무시
		// 형식) if(조건식){ 
		// 			조건식이 참일 때 실행할 문장 ;
		// 			조건식이 참일 때 실행할 문장 ;
		//		}
		//		단, 실행 문장이 한 줄이면 {}을 생략할 수 있다.
		
		//	형식) if(조건식)	조건식이 참일 때 실행할 문장 ;
		// 	형식) if(조건식)
		//			조건식이 참일 때 실행할 문장
		
		// int k1이 60 이상이면 합격
		int k1 = 45;
		String res = "초기값";
		
		if (k1 >= 60) {
			res = "합격";
		}
		if(k1 < 60) 
			res="불합격";
		
		System.out.println("결과 : "+res);
		
		
		// int k2가 홀수인지 짝수인지 판별하자
		int k2 = 43;
		
		res = "짝수";
		if (k2%2!=0) {
			res = "홀수";
		}
		System.out.println("결과 : "+res);
		
		// char k3가 대문자인지 아닌지 판별하자
		char k3 = '3';
		
		res = "대문자 아님";
		if(k3>='A' && k3<='Z') {
			res = "대문자";
		}
		System.out.println("결과 : "+res);
			
		
		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야하는가?
		
		int wage = 9620;
		double mul = 1.5;
		int realtime = 1;
		int time = 8;
		int overtime = realtime-time;
		int st_wage =0;  
		int over_wage = (int)(wage * overtime * mul);
		int total_wage = 0;
		int total=0;
		
				
		if(overtime > 0) {
			st_wage = wage * time;
			total_wage = st_wage + over_wage;
			total = total_wage;
		}else {
			over_wage=0;
			st_wage = wage * realtime;
			total = st_wage;
		}
		System.out.println("결과 : "+total);
		
		
		// 풀이
		time = 10;
		int limt = 8;
		int dan = 9620;
		int pay = time * dan;
		if(time > limt) {
			pay = (limt*dan) +(int)((time-limt)*dan*1.5);
		}
		System.out.println("결과 : " +pay);
		
	}
}
