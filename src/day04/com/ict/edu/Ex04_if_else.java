package day04.com.ict.edu;

import java.math.RoundingMode;
import java.util.Random;

public class Ex04_if_else {

	public static void main(String[] args) {
		// if ~ else 문
		
		// int k1이 60 이상이면 합격 아니면 불합격		
		int k1 = 89; 
		String str ="";
		if(k1>=60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);
		
		// int k2가 홀수인지, 짝수인지 판별하자
		//int k2 = 0;
		int k2 = (int)(Math.random()*100)+1;
		str = "";
		if(k2%2==0) {
			str = "짝수";
		}else{
			str = "홀수";
		}
		System.out.println("결과 : "+ k2 +" => " + str);
		
		// char k3가 대문자인지, 대문자가 아닌지 판별하자
		char k3 = 'A';
		str = "";
		
		if(k3>='A' && k3<='Z') {
			str = "대문자";
		} else if(k3>='a' && k3<='z') {
			str = "소문자";
		} else {
			str = "알파뱃 아님";
		}
		System.out.println("결과 : "+str);
		
		
		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야하는가?
		
		int wage = 9620;
		double mul = 1.5;
		int realtime = 10;
		int time = 8;
		int overtime = realtime-time;
		int st_wage =0;  
		int over_wage = (int)(wage * overtime * mul);
		int total_wage = 0;
		int total=0;
		
		if(overtime>0) {
			st_wage=wage*time;
			total_wage = st_wage + over_wage;
			total = total_wage;
		}else{
			over_wage=0;
			st_wage=wage*realtime;
			total = st_wage;
		}
		System.out.println("결과 : "+total);
		
		
		
		
		
		
		
		
		
	}

}
