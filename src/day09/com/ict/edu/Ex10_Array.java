package day09.com.ict.edu;

public class Ex10_Array {
	public static void main(String[] args) {
		// 가변 길이
		int[][] su = new int[3][];
		
		// 오류의 예) 1차원 배열은 길이가 있어야한다
		// int[][] su2 = new int[][];
		// int[][] su3 = new int[][4];
		
		// 오류의 예2) 초기값을 고정길이방식으로 주면 안됨
		// su[0][0] = 10;
		// su[0][1] = 20;

		//	su[1][0] = 100;
		//	su[1][1] = 200;
		//	
		//	su[2][0] = 1000;
		//	su[2][1] = 2000;
		
		// 가변 길이는 무조건 1차원 배열을 만들어서 넣어야 한다.
		int[] k1 = {10,20,30};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000,3000,4000};
		
		// 위에서 만들배열을 다차원배열에 넣어라.
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		
		
		// 출력
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// 선언, 생성, 저장을 한번에
		String[][] str = {{}, {}, {}};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				
			}
		}
		
		
		
	}
}
