package day06.com.ict.edu;

public class Ex02_do_while {

	public static void main(String[] args) {
		/*
		 do ~ while문 : while문과 같은 반복문
		  				단, 먼저 실행 후 조건식이 붙는다.
		 형식)
		  		초기식;
		  		do{
		  			실행문;
		 			증감식;
		 		}while(조건식); 		
		 */
		
		// 0~10 출력
		int i=0;
		do {
			System.out.print(i+"\s");
			i++;
		} while (i<11);
		System.out.println();
		
		System.out.println("=====홀수=====");
		// 0~10 홀수 출력
		i=0;
		do {
			if(i%2!=0) {
				System.out.print(i+"\s");	
			}
			i++;
		}while(i<11);
		
		System.out.println("\n======7단=======");
		// 7단 출력
		i=7;
		int j=1;
		do {
			System.out.print(i+"*"+j+"="+(i*j)+"  ");
			j++;
		} while (j>0 && j<10);
		
		System.out.println("\n=====홀수의 누적합=====");
		// 0~10 홀수의 누적합
		i=0;
		int sum=0;
		do {
			if(i%2!=0) {
				sum += i;
			}
			i++;
		}while(i<11);
		System.out.println(sum);
	
		
	}

}
