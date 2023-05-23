package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복처리한다
		// 형식) for(초기식; 조건식; 증감식){
		//		 	조건식이 참일 때 실행할 문장;
		//		 	조건식이 참일 때 실행할 문장;		
		//		 	조건식이 참일 때 실행할 문장;
		//		}
		// ** for문을 만나면 무조건 초기식으로 이동
		//		초기식은 조건식으로 이동
		//		조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		//		for문의 끝을 만나면 무조건 증감식으로 간다.
		
		//		{}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용불가)
		
		// 	안녕하세요 를 열 번 출력하기
		for (int i = 1; i < 15; i++) {
			if(i<10) {
				String res= "0"+i;
				System.out.print("안녕하세요("+res+")  ");			
			}else {
				System.out.print("안녕하세요("+(i)+")  ");
			}
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.println();
		//	for (int i = 1; i < 11; i++) {
		//		System.out.println(i+" = 안녕하세요");
		//	}
		
		System.out.println("======================================");
		// 0-10 출력
		System.out.println("0-10 출력 : ");
		for(int i = 0; i<11; i++) {
			System.out.print(i+"\s\s");
		}
		System.out.println("\n");
		
		System.out.println("0-10 짝수 출력 : ");
		// 0-10까지 짝수만 출력
		for(int i=0; i<11; i++){
			if(i%2==0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println("\n======= ↑ if(i%2==0) | ↓ i+=2 =======");
		
		for(int i=0; i<11; i+=2) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("======================================");

		System.out.println("3의 배수를 제외한 100까지의 누적합");
		int sum=0;
		for(int i=0; i<100; i++) {
			if(i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("======================================");
		System.out.println("구구단 7단 출력");
		// 구구단 중 7단 출력	
		for(int i=1; i<10; i++) {
			int mul7 = i*7;
			System.out.print("7x"+i+"="+mul7+"  ");
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.println("======================================");
		// 1-10 누적합 (합계 구하기)
		// 이전 저장변수 = 0
		// 누적합 공식 : sum += i; //  (이전 저장변수 = 이전 저장변수 + 현재값);
		
		// 이전 저장변수 = 1
		// 누적곱 sum *= i 의 경우 *0의 오류를 피하기 위해 초기값을 0으로 주지 않음(보통 1)
		
		sum = 0;
		for (int i=1; i<11; i++){
			sum = sum + i;
		}
		System.out.println("1-10의 누적합 : " + sum);
		
		// 0-10까지 짝수의 누적합
		
		sum=0;
		for (int i=0; i<11; i++) {
			sum=sum+i;
			if(sum%2!=0){
				sum=sum-i;
			}
		}
		System.out.println("0-10의 짝수 누적합 : "+(sum));
		
		
		// 풀이
		int even = 0;
		for (int i = 0; i <11; i++) {
			if(i%2==0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 누적합 : "+even);
		
		// ! 누적곱 연습
		int fac = 1;
		for (int i = 1; i<=7; i++) {
			fac *= i;
		}
		System.out.println("누적곱 결과 : 7! = "+fac);	
		
		// 숙제 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		int mul = 0;
		for (int i = 1; i<=10; i++) {
			if(i%2==1) {
				mul += i;
			}else {
				mul += -i;
			}
		}
		System.out.println(mul);
		
		
	}
}
