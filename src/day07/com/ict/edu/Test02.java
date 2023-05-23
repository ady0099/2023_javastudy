package day07.com.ict.edu;

public class Test02 {

	public static void main(String[] args) {
		// day05-day06 homework 풀이2
		
	/*
		 * 
		 * *
		 * * *
		 * * * *
	*/
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}		
		System.out.println("=================");
		for (int i = 0; i<4; i++) {
			for(int j =0; j<4; j++) {
				System.out.print("* ");
				if(i == j) break;
			}
			System.out.println();
		}
		
	/*
		       * 
		     * *
		   * * *
		 * * * *
	*/
		for(int i =1; i<5; i++) {
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		String str="";
		for(int i =1; i<5; i++) {
			for(int j=4;j>0;j--) {
				if(i<j) {
					str=" ";
					System.out.print(str);
				}else {
					str="* ";
					System.out.print(str);
				}
			}
			System.out.println();
		}
		
		
		

		
		
		
		
	}

}
