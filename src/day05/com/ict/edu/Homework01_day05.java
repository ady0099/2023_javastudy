package day05.com.ict.edu;

public class Homework01_day05 {

	public static void main(String[] args) {
		
		int i =0;
		
			//		과제
		
			//	1. if~ else문 
			//	농구공 5개씩 한 박스에 들어간다. 
			//	40개면 8상자,  26개면 6개이다.
			//	int k1 = 127개이다
			//	몇 상자가 필요한가요?
			
			int k1 = 127;
			int box = 5;
			int res = 0;
			
			if(k1%box==0) {
				res = k1/box;
			}else {
				res = (k1/box) +1;
			}
			System.out.println("상자는 "+res+"개가 필요하다.");	
			
			System.out.println("=====for문====="); 
			//	2. for문으로 풀기
			//	0 0 0 0
			//	0 0 0 0
			//	0 0 0 0
			//	0 0 0 0
			
			for(i=0; i<16; i++) {
				System.out.print(" 0 ");
				if(i%4==3) {
					System.out.println();
				}
			}
			
			System.out.println("====이중 for문===="); 
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
			
		
			
			
			//	4. 1+(-2)+3+(-4)+(+5)+...과 같은 식으로 계속 더해나갔을 때, 
			//	몇까지 더해야 총합이 100 이상이 되는지 구하시오
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
			
			System.out.println("==== for문 ===="); 
			//	5. for문
			//	*
			//	**
			//	***
			//	****
			for(i=0; i<4; i++) {
				for(int j=0; j<i+1; j++) {
				System.out.print('*');
				}
				System.out.println();
			}
			
			System.out.println("==== for문 ====");

			//	6. for문
			//	   *
			//	  **	
			//	 ***
			//	****
			for(i=0; i<4; i++) {
				for(int j=4; j>i+1; j--) {
					System.out.print(" ");
				}
				for(int j=0; j<i+1; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		
	}

}
