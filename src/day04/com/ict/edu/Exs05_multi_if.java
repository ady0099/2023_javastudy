package day04.com.ict.edu;

public class Exs05_multi_if {

	public static void main(String[] args) {
		// 다중 if문
		// 형식)	if(조건식1){
		//			조건식1이 참일 때 실행할 문장 ; 
		//			조건식1이 참일 때 실행할 문장 ; 
		//		}else if(조건식2){
		//			조건식 1이 거짓이면서 조건식2가 참일 때 실행할 문장 ; 
		//			조건식 1이 거짓이면서 조건식2가 참일 때 실행할 문장 ; 
		//		}else if(조건식3){
		//			조건식 1,2가 거짓이면서 조건식3이 참일 때 실행할 문장 ; 
		//			조건식 1,2가 거짓이면서 조건식3이 참일 때 실행할 문장 ; 
		//		}else{
		//			조건식 1,2,3 모두 거짓인 경우
		//		}
	
		
		
		// int k1의 점수가 90 이상이면 A학점, 80 이상이면 B학점, 70이상이면 C학점, 나머지 F 학점
		int k1 = 100;
		String str = "";
		
		if(k1>=90) {
			str = "A학점";
		}else if(k1>=80) {
			str = "B학점";
		}else if(k1>=70) {
			str = "C학점";
		}else{
			str = "F학점";
		}
		System.out.println("결과 : "+str);
		System.out.println("========================");
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타 문자인지 판별하자
		char k2 = 'a';
		str = "";
		
		if(k2>='A' && k2<='Z') {
			str = "대문자";
		}else if(k2>='a' && k2<='z'){
			str = "소문자";
		}else if(k2>='0' && k2<='9') {
			str = "숫자";
		}else {
			str = "기타 문자";
		}
		System.out.println("결과 : "+str);
		System.out.println("====================");
		
		// char k3이 A, a이면 아프리카, B, b이면 브라질, C,c이면 캐나다 나머지는 한국
		char k3 = 'A';
		str = "";
		
		if(k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		}else if(k3 == 'B' || k3 == 'b') {
			str = "브라질";
		}else if(k3 == 'C' || k3 == 'c') {
			str = "캐나다";
		}else {
			str = "한국";
		}
		System.out.println("결과 : "+str);
		System.out.println("====================");
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		
		int money = 100;
		int num = 2;
		int menu1 = 3500, menu2 = 4000, menu3 = 3000, menu4 = 3500;
		String m_name1 = "카페모카", m_name2 = "카페라떼", m_name3 = "아메리카노", m_name4 = "과일쥬스"; 
		double vat = 0.1;
		int menu;
		
		int sel_menu = 3;
		int total = 0;
		int res = 0;
		str = "";
		
		if(sel_menu==1) {
			menu = menu1;
					
			total = num*menu+(int)(num*menu*vat);
			if(money>=total) {
				res = money - total; 
				str = "메뉴 \t : " + m_name1
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money
						+ "\n거스름돈    : "+ res;  
				System.out.println("결과\n"+"-----------------\n"+str);
			}else {
				res = money - total; 
				str = "메뉴 \t : " + m_name1
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money;
				System.out.println("결과\n"+"-----------------\n"+str+"\n금액이 부족합니다");
			}	
		}else if(sel_menu==2) {
			menu = menu2;
			
			total = num*menu+(int)(num*menu*vat);
			if(money>=total) {
		
				res = money - total; 
				str = "메뉴 \t : " + m_name2
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money
						+ "\n거스름돈    : "+ res;   
				System.out.println("결과\n"+"-----------------\n"+str);
			}else {
				res = money - total; 
				str = "메뉴 \t : " + m_name2
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money;
				System.out.println("결과\n"+"-----------------\n"+str+"\n금액이 부족합니다");
			}
		}else if(sel_menu==3) {
			menu = menu3;
			
			total = num*menu+(int)(num*menu*vat);
			if(money>=total) {
				res = money - total; 
				str = "메뉴 \t : " + m_name3
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money
						+ "\n거스름돈    : "+ res;
				System.out.println("결과\n"+"-----------------\n"+str);
			}else {
				res = money - total; 
				str = "메뉴 \t : " + m_name3
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money;
				System.out.println("결과\n"+"-----------------\n"+str+"\n금액이 부족합니다");
			}
		}else if(sel_menu==4) {
			menu = menu4;
			
			total = num*menu+(int)(num*menu*vat);
			if(money>=total) {
				res = money - total; 
				str = "메뉴 \t : " + m_name4
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money
						+ "\n거스름돈    : "+ res;
				System.out.println("결과\n"+"-----------------\n"+str);
			}else {
				res = money - total; 
				str = "메뉴 \t : " + m_name4
						+ "\n수량 \t : " + num 
						+ "\n공급가금액  : " + num*menu
						+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
						+ "\n-----------------"
						+ "\n합계 \t : " + total 
						+ "\n결제금액\t : " + money;
				System.out.println("결과\n"+"-----------------\n"+str+"\n금액이 부족합니다");
			}
		}else {
			str = "메뉴를 다시 선택해주세요";
		}
		
		
		// 시험 문제 상으로는 주어진 것 외인 else는 굳이 작성할 필요 없다
		

		
		
		

		System.out.println("==============");
		// 풀이
		menu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		String drink = "";

		if(menu == 1) {
			drink = "카페모카";
			dan = 3500;		
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		total = dan * su;
		int vat2 = (int)(total * 0.1);
		int out = in - (total+vat2);		
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : "+out);

		
		System.out.println("=======수정======");
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		
		money = 1000;	//	int
		num = 2;		//	int
		sel_menu = 5;	//	int
		menu = 0; 		//	int
		drink = ""; 	//	String

		
		if(sel_menu == 1) {
			drink = "카페모카";
			menu = 3500;		
		}else if (sel_menu == 2) {
			drink = "카페라떼";
			menu = 4000;
		}else if (sel_menu == 3) {
			drink = "아메리카노";
			menu = 3000;
		}else if (sel_menu == 4) {
			drink = "과일쥬스";
			menu = 3500;
		}

		
		total = menu * num;
		int vat3 = (int)(total * 0.1);
		int totalv = total + vat3;
		res = money - (total+vat3);
		 
		if(money>=total) {
		str = "메뉴 \t : " + drink
				+ "\n수량 \t : " + num 
				+ "\n공급가금액  : " + num*menu
				+ "\n부가세 \t : "	+ vat3 
				+ "\n-----------------"
				+ "\n합계 \t : " + totalv 
				+ "\n결제금액\t : " + money
				+ "\n거스름돈    : "+ res;
		System.out.println("결과\n"+"-----------------\n"+str);
		
		}else{
			str = "메뉴 \t : " + m_name4
					+ "\n수량 \t : " + num 
					+ "\n공급가금액  : " + num*menu
					+ "\n부가세 \t : "	+ (int)(num*menu*vat) 
					+ "\n-----------------"
					+ "\n합계 \t : " + totalv 
					+ "\n결제금액\t : " + money;
			System.out.println("결과\n"+"-----------------\n"+str+"\n금액이 부족합니다");
		}
			
		
		
		
		
		
		
		
	}

}
