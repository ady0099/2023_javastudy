package day05.com.ict.edu;

public class Ex04_while {

	public static void main(String[] args) {
		// for문과 같은
		
		// 형식1)
		//		초기식;
		//		while(조건식){
		//			조건식이 참이면 실행할 문장;
		//			증감식;
		//		}
		// 		while 문의 끝을 만나면 조건식으로 간다.
		
		
		// 형식2)
		//		초기식;
		//		while(true){
		//			if(빠져나갈 조건) {
		//				break;
		//			}
		//			조건식이 참이면 실행할 문장;
		//			조건식이 참이면 실행할 문장;
		//			증감식;
		//		}
		//		while문의 끝을 만나면 조건식으로 간다.
		
		System.out.println("============ while문 i값 ============");
		// 1-10까지 출력하자
		int i = 1;
		while (i < 10) {
			System.out.print("i = " + i + ", ");
			i++;
			if(i==6) {
				System.out.println();
			}
			if(i==10) {
				System.out.print("i = " + i);
			}
		}
		System.out.println();
		
		System.out.println("============ while(true)문 i값 ============");
		i = 1;
		while(true) {
			if(i >= 10) break;
			System.out.print("i = " + i + ", ");
			i++;
			if(i==6) {
				System.out.println();
			}
			if(i==10) {
				System.out.print("i = " + i);
			}
			
		}
		System.out.println();
		// 부등호 방향에 주의
		
		System.out.println("============ 0~10 짝수 출력 ============");
		// 0~10까지 짝수 출력
		i = 0;
		System.out.print("짝수 : ");
		while(i <= 10) {
			if(i%2==0) {
				System.out.print(i+"  ");
			}
			i++;
		}
		System.out.println();
		
		System.out.println("============== 7단 출력 ==============");
		// 구구단 중 7단 출력
		i = 1;
		int n = 7;
		while(i<10) {
			String mul7 = n + "x"+i+"="+n*i;
			System.out.print(mul7+"  ");
			i++;
		}
		System.out.println();
		
		System.out.println("============ 1~10 누적합 ============");
		// 1-10 누적합 ( 합계 구하기 )
		i = 1;
		int sum = 0;
		while(true) {
			if(i>10) {
				break;
			}
			sum += i;
			i++;
			
		}
		System.out.println("결과 : " + sum);
		
		System.out.println("============ 4x4 점찍기 ============");
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 0;
		while(i<4) {
			i++;
			int j=0;
			while(true) {
				j++;
				if(j>4) {
					break;
				}
				System.out.print(" "+0+" ");				
			}
			System.out.println();
		}
		System.out.println();
		
		// 풀이
		i = 1;
		while(i<17) {
			System.out.print(" 0 ");
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
		
		// 1 6 9 16
		
		System.out.println("============ 4x4 심화 점찍기 ============");
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		i = 1;
		while(i<17) {
			if(i%5==1) {
				System.out.print(" 1 ");		
			}else {
				System.out.print(" 0 ");
			}
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("====================");
		
		
		
		//	과제
		
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
