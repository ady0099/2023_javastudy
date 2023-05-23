package day06.com.ict.edu2;

import java.util.Scanner;

public class Homework03_oper_day06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 숫자 연산하기 ======");
		//	3.	첫번째 숫자 받기
		//		두번째 숫자 받기
		//	연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		
		System.out.print("첫 번째 숫자를 입력해주세요. : ");
		int num11 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요. : ");
		int num12 = sc.nextInt();
		System.out.println("사용하실 연산자의 번호를 입력해주세요.");
		System.out.println("1.+    2.-    3.*    4./    5.%    6./+%    7.ALL");
		int oper = sc.nextInt();
		String op="";
		int res=0;
		double res2=0;
		double sum1;
		double sum2;
		int res_1=0, res_2=0, res_3=0; 
		sum1=(num11/num12);
		sum2=(num11%num12);
		
		
		if(oper==1) {
			res=num11+num12;
			op="+";
		}else if(oper==2) {
			res=num11-num12;
			op="-";
		}else if(oper==3) {
			res=num11*num12;
			op="*";
		}else if(oper>=4 && oper<=7) {
			if(num12==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc.close();
			}else {
				switch(oper) {
					case 4 : res=(int)(sum1); op="/"; break;
					case 5 : res=(int)(sum2); op="%"; break;
					case 6 : res2=(int)(num11*100/num12)/100.0;
						op="/+%"; break;
					case 7 : 
						res_1 = num11+num12;
						res_2 = num11-num12;
						res_3 = num11*num12;
						res = (int)(sum1);
						res2=(int)(num11*100/num12)/100.0;
							
						op="ALL"; break;
					default: op=""; break;	
				}
			}
		}else {
			op="";
			System.out.println("잘못 선택하셨습니다.");
			sc.close();
		}
		if(op!="") {
			System.out.println("첫 번째 숫자 : "+num11);
			System.out.println("두 번째 숫자 : "+num12);
			System.out.println("선택한 연산자 : "+op);
			
			if(op=="ALL") {
				System.out.println("연산 결과 : ");
				System.out.println("+ : "+res_1);
				System.out.println("- : "+res_2);
				System.out.println("* : "+res_3);
				System.out.println("/ : "+res2); 
			}else if(op!="/+%") {
				System.out.println("연산 결과 : "+res);
			}else{
				System.out.println("연산 결과 : "+res2);
			}
			sc.close();
		}
		System.out.println("==================");

	}

}
