package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 짝수가 나온 확률을 구하라
		// 백분률로 구해볼 것
		
		int count = 0;
		int even = 0;
		
		while(true) {
			count++;
			System.out.print("숫자입력 : ");
			int su = sc.nextInt();
			String str="";
			if(su%2 ==0) {
				str="짝수";
				even++;
			}else {
				str="홀수";
			}
			System.out.println(su+"는 "+str+" 입니다.");
				
			System.out.println("계속할까요? (1.yes, 2.no) >> ");
			int s1 = sc.nextInt();
			if(s1 ==2) break;
		}
		double per = (even / (count*1.0)) * 100;
		System.out.println("전체 개수 : " +count);
		System.out.println("짝수 개수 : "+even);
		System.out.println("퍼센트 : "+(int)(per*10)/10.0+"%");
				

		
		
		// 숙제 
		// 무한 루프 - 2번일 때에만 멈추고 그외에는 계속 진행됨
		// 다시 입력하세요를 어떻게 추가할 것인가?
		 

		
		//	System.out.print("계속할까요?(1.yes,  2.no) >> "); 
		//	했을 떄 
		//	1 이면  반복문 실행 ,   2이면  반복문 탈출 ,
		//	이외의 숫자가 나오면  잘못 입력했습니다.
		//	계속할까요?(1.yes,  2.no) >>
		//	가 다시 물어보는 로직 구현 하기
		
		
	}

}
