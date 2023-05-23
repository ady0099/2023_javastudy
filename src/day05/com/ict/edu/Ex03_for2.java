package day05.com.ict.edu;

public class Ex03_for2 {

	public static void main(String[] args) {
		// 중첩 for 문 : for문 안에 또 다른 for문이 존재하는
		
		for(int i=0; i<3; i++) {
			System.out.print("애국가 ");
			for(int j=0; j<4; j++) {
				if(j!=3) {
					System.out.print((j+1)+"절, ");
				}else {
					System.out.print((j+1)+"절을 ");
				}	
			}
			System.out.print((i+1)+"번 부르세요 \n\n");
		}
		
		for(int i=1; i<4; i++) {
			System.out.println("실행문 - 1");
			for (int j = 1; j<6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			} // 안쪽 for문 끝
			System.out.println("실행문 - 2");
		} // 바깥 for문 끝
		System.out.println("");
		System.out.println("=====구구단=====");
		
		for(int i=1; i<9; i++) {
			for(int j=1; j<10; j++) {
				System.out.print((i+1)+"x"+(j)+"="+(i+1)*j+"   ");
				if((i+1)*j<10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=====세로=====");
		for(int i=1; i<10; i++) {
			for(int j=1; j<9; j++) {
				System.out.print((j+1)+"x"+(i)+"="+(i)*(j+1)+"   ");
				if(i*(j+1)<10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/* 
		 System.out.println("====구구단 풀이====");
		// 풀이
		for (int i = 2; i< 10; i++) {
			System.out.println(i + "단");
		
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		*/
		

		
	}

}
