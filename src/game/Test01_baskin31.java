package game;

import java.util.Scanner;

public class Test01_baskin31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ran = 0;
		int num = 0;

		esc: while (true) {

			System.out.print("숫자를 입력해주세요 ");
			num = sc.nextInt();
			
			for (int i = 0; i < 3; i++) {
				if (ran == 3) {
					break esc;
				}
				ran = (int) (Math.random() * 14 + 1);
				System.out.print(ran + "  ");
				
				
				
			}
			System.out.println();

		}
	}

}
