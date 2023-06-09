package game;

import java.util.Scanner;

public class Test01_baskin31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ran = 0;
		int atkp = 0;
		int num = 0;
		int cnt = 0;
		int x = 0;
		boolean atk=false;

		esc: while (true) {
			atkp = (int) (Math.random() * 2) + 1;

			switch (atkp) {
			case 1:
				System.out.println("당신이 선공입니다.");
				atk = true;
				break;
			case 2:
				System.out.println("컴퓨터가 선공입니다.");
				atk = false;
				break;
			}
			
			if (cnt >= 31) {
				System.out.println(cnt);
				System.out.println("게임 종료");
				break esc;
			}
			
			urTurn:
			while (true) {
				System.out.print("숫자를 몇 개 부를까요? ");
				
				num = sc.nextInt();
				switch (num) {
				case 1:
					cnt++;
					System.out.println(cnt);
					break;
				case 2:
					cnt += 2;
					System.out.println((cnt - 1) + "\s" + cnt);
					break;
				case 3:
					cnt += 3;
					System.out.println((cnt - 2) + "\s" + (cnt - 1) + "\s" + cnt);
					break;
				default:
					System.out.println("게임 룰을 준수해주세요."); continue urTurn;
				}

				System.out.println("컴퓨터의 숫자");
				
				
				ran = (int) (Math.random() * 3) + 1;
				
				switch (ran) {
				case 1:
					cnt++;
					System.out.println(cnt);
					break;
				case 2:
					cnt += 2;
					System.out.println((cnt - 1) + "\s" + cnt);
					break;
				case 3:
					cnt += 3;
					System.out.println((cnt - 2) + "\s" + (cnt - 1) + "\s" + cnt);
					break;
				default:
					break;
				}


			}
		}
	}

}
