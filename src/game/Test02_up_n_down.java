package game;

import java.util.Scanner;

public class Test02_up_n_down {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("UP & DOWN 게임을 시작합니다.");

		esc: while (true) {
			int ran = (int) (Math.random() * 100 + 1);
			System.out.println("1과 100 사이의 숫자를 입력해주세요.");
			int num;
			int cnt = 0;
			
			//try {
			rap: while (true) {
				
					num = sc.nextInt();

					if (num <= 0 || num >= 101) {
						System.out.println("잘못 입력하셨습니다.");
						System.out.println("1과 100 사이의 숫자만 입력해주세요.");

					} else if (num > 0 && num < 101) {
						cnt++;
						if (num == ran) {
							System.out.println("정답입니다.");
							System.out.println(cnt + "회 만에 맞추셨습니다.");
							break;
						} else if (num < ran) {
							System.out.println("UP! 더 큰 수입니다.");
							System.out.println("숫자를 다시 입력해주세요.");
							continue rap;
						} else if (num > ran) {
							System.out.println("DOWN! 작은 수입니다.");
							System.out.println("숫자를 다시 입력해주세요.");
							continue rap;
						}
					}
				//} catch (Exception e) {
				//	System.out.println("숫 자 만 입 력 해 주 세 요 .");
				//	break;
				//}

			}
			rep: while (true) {
				System.out.println("다시 게임하시겠습니까? y or n");
				System.out.print(">>>  ");
				String newGm = sc.next();

				if (newGm.equalsIgnoreCase("y")) {
					System.out.println("게임을 다시 시작합니다.");
					continue esc;
				} else if (newGm.equalsIgnoreCase("n")) {
					System.out.println("게임을 종료합니다.");
					sc.close();
					break esc;
				} else {
					System.err.println("잘못 입력하셨습니다.");
					continue rep;
				}
			}
		}

	}
}
