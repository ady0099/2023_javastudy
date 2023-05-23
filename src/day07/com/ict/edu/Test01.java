package day07.com.ict.edu;

public class Test01 {

	public static void main(String[] args) {
		// day05-day06 homework 풀이
		
		// 1 + (-2) + 3 + (-4) + ... + (-10) FOR문을 이용한 누적합

		int sum = 0;
		for (int i =1; i<11; i++) {
			if(i%2==0) {
				sum = sum+(i*-1);
			}else {
				sum = sum+i;
			}
		}
		System.out.println("결과 : "+sum);
		
		// 다르게 생각해보면 홀수일 때의 합은 1, 2, 3이니..
		// (i+1)/2 인가? 
		// 짝수일 때의 합은 -(i/2)
		
		// 확인해보자
		
		int i = 0;
		sum = 0;
		for (i =1; i<11; i++) {
			if(i%2==0) {
				sum = -(i/2);
				System.out.println(i+"\t=>\t"+sum);
			}else {
				sum = (i+1)/2;
				System.out.println(i+"\t=>\t"+sum);
			}
		}
		System.out.println("결과 : "+sum);
		
		
		System.out.println("===============");
		//	1. if~ else문 
		//	농구공 5개씩 한 박스에 들어간다. 
		//	40개면 8상자,  26개면 6개이다.
		//	int k1 = 127개이다
		//	몇 상자가 필요한가요?
		
		int k1 = 127;
		int res = k1 / 5;

		if(k1%5!=0) {
			res = res+1;
		}
		System.out.println("결과 : "+res);
	
	
		//	2. for문으로 풀기
		//	0 0 0 0
		//	0 0 0 0
		//	0 0 0 0
		//	0 0 0 0
		
		//	0 0 0 0를 하나로 보는 경우
		for (i = 0; i<4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("=======");
		
		//	0을 하나로 보는 경우 (0이 16개)
		for(i=1; i<17; i++) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
		}
		
		//	3. 이중 for문으로 풀기
		//	1 0 0 0
		//	0 1 0 0
		//	0 0 1 0
		//	0 0 0 1
		
		for(i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i==j) {
					System.out.print(" 1 ");
				}else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
		//	똑같이 풀었네
		
		
		//	4. 1+(-2)+3+(-4)+(+5)+...과 같은 식으로 계속 더해나갔을 때, 
		//	몇까지 더해야 총합이 100 이상이 되는지 구하시오
			
		// 	제대로 잘 풀었으니 내 풀이로 때우자
		
		int sun=0;
		i=0;
		
		while(true) {
			i++;
			if(sun>=100) { break; }
			if(i%2==1) {
				sun += i;	
			}else {
				sun += -i;
			}
		}
		System.out.println("결과 : " + (i-1) + "까지 더하면 총합이 100이 됨");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
