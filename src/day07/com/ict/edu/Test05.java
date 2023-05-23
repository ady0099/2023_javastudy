package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int s1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int s2 = sc.nextInt();
		
		System.out.print("연산자 : \n1 => + \n2 => - \n3 => * \n4 => /\n>>>>>    ");
		int op = sc.nextInt();
		
		double res = 0.0;
		String oper ="";
		if(op==1) {
			res = s1 + s2;
			oper = "+";
		}else if(op==2) {
			res = s1 - s2;
			oper = "-";
		}else if(op==3) {
			res = s1*s2;
			oper = "*";
		}else if(op==4) {
			res = (int)(s1*10/ s2)/10.0;
			oper="/";
		}
		System.out.println(s1 + oper + s2 + "=" + res);
		
		
		
		
	}

}
