package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용하실 프로그램 번호를 입력해주세요");
		System.out.println("1번: 근무시간, 2번: 카페메뉴, 3번: 국가수도, 0번: 프로그램 종료");
		
		int slc = sc.nextInt();
		String str="";
		if(slc==1) {
			// (근무시간)이 8시간까지는 시간당 9620이고
			// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
			// 현재 근무한 시간이 10이다
			// 얼마를 받아야 하는가?
			System.out.print("근무시간을 입력해주세요. : ");
			int time=sc.nextInt();
			int pay=0;
			int t=0;
			pay=time*9620;
			
			if(time>8) {
				pay = pay+(int)((time-8)*9620*1.5);
				t = time-8;
			}
			System.out.println("근무 시간 \t: "+time+"시간 \n초과 시간 \t: "+t+"시간 \n수당 \t: "+pay);
			sc.close();
		}else if(slc==2) {
			
	        // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
	        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
	        // 친구와 함께 2잔을 10000 내고 먹었다.
	        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
	        // (친구와 같은 음료을 먹어야 한다.)
			// 메뉴를 번호로 넣을 것(숫자를 받아서 출력)
	        
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.카페모카(3500) \n2.카페라떼(4000) \n3.아메리카노(3000) \n4.과일쥬스(3500)");
			int menu_list=sc.nextInt();
			int money=10000;
			int num=2;
			double vat=0.1;
			int total=0, res=0, menu=0;
			
			
			if(menu_list==1) {
				str="카페모카";
				menu=3500;				
			}else if(menu_list==2) {
				str="카페라떼";
				menu=4000;
			}else if(menu_list==3) {
				str="아메리카노";
				menu=3000;
			}else if(menu_list==4) {
				str="과일쥬스";
				menu=3500;
			}else {
				str="없는 메뉴입니다.";
				menu=0;
			}
			total=(int)(menu*(1+vat))*num;
			res=money-total;
			
			System.out.print(str);
			if(menu!=0) {
				System.out.println(" 메뉴를 "+num+"개 선택하셨습니다.");
				System.out.println("총액은 "+total+"원이며," );
				System.out.println("거스름돈은 "+res+"입니다.");
			}
			sc.close();
		}else if(slc==3) {	
			
			// 나라를 입력하면 수도가 출력되게 하자
			// 한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴, 이외에는 데이터 없음
			// (switch~case)
			
			System.out.println("국가명을 입력해주세요.");
			System.out.println("현재 열람 가능한 국가 목록 : \n\n한국 \n중국 \n일본 \n미국 ");
			String cap=sc.next();
			str = "";
			
			switch (cap) {
				case "한국" : str="서울"; break;	
				case "중국" : str="베이징"; break;
				case "일본" : str="도쿄"; break;
				case "미국" : str="워싱턴 D.C."; break;
				default: str="데이터 없음"; break;
			}
			if(str!="데이터 없음") {
				System.out.print("국가 : "+cap+", 수도 : ");
			}
			System.out.println(str);
			sc.close();
			
		
		}else if(slc==0){
			System.out.println("프로그램을 종료합니다.");
			sc.close();
		}else{
			System.out.println("아직 저장된 프로그램이 없습니다. 다시 선택해주세요.");
		}	
	}
}
