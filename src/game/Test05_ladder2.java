package game;

import java.util.Scanner;

public class Test05_ladder2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=0;
		
		
		int[][] ladder = new int[x][y];
		
		System.out.println("인원수를 입력해주세용용용");
		
		for(int i=0; i<9; i++) {
			if(ladder[y][x]==0) {
				y++;
			}
		}

	}
}

