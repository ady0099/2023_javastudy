package day04.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		//	삼항 연산자 : 조건식 => 조건이 참일 때와  거짓일 때를 구분해서 실행한다.
		//	형식) 자료형 변수 이름 = (조건식) ? 조건식이 참일 때 실행할 문장 : 조건식이 거짓일 때 실행할 문장 ;
		//	**주의사항) 변수, 참일 때 실행 결과, 거짓일 때 실행 결과 모두 같은 자료형이어야 한다 
		//	조건식에는 boolean(true, false), 비교연산자, 논리연산자, 
		
		String str = (false) ? "강아지" : "고양이";
		// true이므로 고양이는 실행되지 않는 문장이지만(dead code), 형식상 false 문장도 완성되어 있어야한다.
		
		System.out.println("결과 : "+str);
		
		//int avg = 80;
		double avg = 85.3;
		str = (avg >= 60) ? "합격" : "불합격";
		System.out.println("결과 : "+str);
		
		// char c2='Z'; // 65~90
		// System.out.println((int)(c2));
		char c1 = 'g';
		str = (c1 >= 'a' && c1<= 'z') ? "소문자" : "소문자 아님";
		// 'a'로 바로 비교하면 되는데 굳이 c1 >= 97로 계산하는 번거로운 방식을 사용
		
		System.out.println("결과 : "+str);
		
		//응용
		System.out.println("================================");
		char ch1 = '-';
		str = (ch1 >= 'a' && ch1 <= 'z') ? "소문자" : (ch1 >='A' && ch1<='Z') ? "대문자" : "기타";
		System.out.println("결과 : "+str);
		
		// 1 또는 3이면 남자, 아니면 여자
		int gender = 1;
		str = (gender==1 || gender ==3)? "남자" : "여자";
		System.out.println("결과 : "+str);

		// 홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender % 2 ==1) ? "남자" : "여자";
		System.out.println("결과 : " +str);
		
		//응용
		System.out.println("==============주민 응용================");
		gender = 4;
		str = (gender%2==1) ? (((gender==1 || gender==3 || gender==9) ? "내국인 " : "외국인 ") + "남성") 
				: ((gender==2 || gender==4 || gender==0) ? "내국인 " : "외국인 ") + "여성";
		System.out.println("결과 : "+str);		
		
		
		
		System.out.println("================================");
		// 3의 배수인지 아닌지 알아보자
		int su1 = 157;
		String res = (su1%3==0) ? "3의 배수" : (su1%3==1) ? "3의 배수+1" : "3의 배수+2";
		System.out.println("결과 : "+res);
		
		System.out.println("================================");
		
		
		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야하는가/
		
		int wage = 9620;
		double mul = 1.5;
		int realtime = 10;
		int time = 8;
		int overtime = realtime-time;
		int st_wage = wage * time; 
		int over_wage = (int)(wage * overtime * mul);
		int total_wage = st_wage + over_wage;
		
		
		String total = (overtime > 0) ? "초과근무는 "+ overtime +"시간이며, "
				+ "총 임금은 "+(total_wage)+"입니다."
				: "초과근무는 없으며 총 임금은"+(st_wage)+"입니다.";
		System.out.println(total);
		// 여기서 실수한 것 : overtime>0일 때는 time만큼의 시간만 1배수 임금으로 계산인데 realtime으로 계산해서 2시간분의 임금이 추가로 계산됨
		// if문으로 분할해서 st_wage를 계산해야하나, if문 사용 문제가 아니므로 wage * time으로 간단히 계산하고 다음 문제로 넘어감
		
	
		//2
		int shf = 10;
        int mo = 9620;
        int mo2 = 14430;
        int money;

        money = (shf <= 8 ) ? (mo * shf) : (mo * 8) + (mo2 * (shf - 8));
        System.out.println(money);

        
        //3
        time = 10;
        //int money;
        money = (time > 8) ? (int)((time - 8)* 1.5 * 9620) + 8 * 9620 : time* 9620;
        System.out.println("결과: " + money);
        
        
        //풀이
        time = 10;
        int dan = 9620;
        
        int pay = (time > 8) ? (8 * dan) + (int)((time-8)*dan*1.5) : time * dan;
        System.out.println("결과 : " + pay);		
		
        
        System.out.println("===============숫자 비교 문제=================");
        // 큰 숫자뽑기
        int num1 = 47;
        int num2 = 32;
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("큰값 : " + result);
        
        result = (num1 - num2 > 0) ? num1 : num2;
        System.out.println("큰값 : " + result);
        
        Math.max(num1, num2);
        System.out.println("큰값 : " + Math.max(num1, num2));
        
        int res2 = Math.max(num1, num2);
        System.out.println("큰값 : " + res2);
        // 단점 숫자 둘 밖에 못받음
        
        // 팀 숙제 Math 메소드 10개 조사
        
        
        //절댓값
        int res3 = 38;
        int res4 = (res3>0) ? res3 : res3*(-1) ;
        System.out.println("결과 : " + res4);
        
        int res5 = Math.abs(res3);		
        System.out.println("결과 : " + res5);		
        		
        
        
        
        		
        		
        		
        
        
        
	}
}
