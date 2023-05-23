package day07.com.ict.edu2;

import java.util.Scanner;

public class Homework01_Scanner_day07 {

	public static void main(String[] args) {
		// System.out.print("계속할까요?(1.yes, 2.no) >> ");
		// 했을 때
		// 1 이면 반복문 실행 , 2이면 반복문 탈출 ,
		// 이외의 숫자가 나오면 잘못 입력했습니다.
		// 계속할까요?(1.yes, 2.no) >>
		// 가 다시 물어보는 로직 구현 하기

		// 숙제
		// 무한 루프 - 2번일 때에만 멈추고 그외에는 계속 진행됨
		// 다시 입력하세요를 어떻게 추가할 것인가?

		Scanner sc = new Scanner(System.in);

		String str = "";
		String ctrl = "start";
		int cnt = 0;
		int cnt_odd = 0; // 홀수 비율 확인 및 교차 검증을 위한 변수, 실사용은x
		int cnt_even = 0;
		double even = 0;
		int errCnt = 1;

		while (true) {
			// 과부화 방지 프로그램 종료
			if (errCnt >= 11 || errCnt % 11 == 0) {
				System.out.println((errCnt - 1) + "회 입력 실수하셨습니다. 프로그램을 종료합니다.");
				break;
			}

			// 수 입력
			if (ctrl.equals("start")) {
				System.out.print("숫자입력 \t: ");

				// 오입력으로 인한 프로그램 종료를 방지하기 위해 String 타입으로 받음
				String su = sc.next();

				try {
					String intStr = su.replaceAll("[^0-9]", "");
					int number = Integer.parseInt(intStr);

					// 숫자 뒤에 문자가 추가로 들어갔는지 검사하고, 홀짝 판별
					if (su.equals(intStr) && number % 2 == 0) {
						str = "짝수";
						cnt_even++;
					} else if (su.equals(intStr) && number % 2 == 1) {
						str = "홀수";
						cnt_odd++;
					} else {
						System.out.println("숫자만 입력해주세요.");
						errCnt++;
						continue;
					}
					cnt++;
					System.out.println("입력값 \t: " + su + " (" + str + ")");

				} catch (Exception e) {
					System.out.println("숫자를 입력해주세요.");
					errCnt++;
					continue;
				}
				ctrl = "con";

			}
			// 프로그램 계속 실행 및 종료
			// 오입력 종료를 방지하기 위한 String
			if (ctrl.equals("con")) {

				System.out.print("계속할까요? (1.yes, 2.no) \n>> ");

				String s1 = sc.next();

				if (!(s1.equals("1") || s1.equalsIgnoreCase("yes") || s1.equalsIgnoreCase("y") || // 추후 String 값으로 넣은 후 split으로 비교
						s1.equals("2") || s1.equalsIgnoreCase("no") || s1.equalsIgnoreCase("n"))) {
					System.out.println("잘못 입력하셨습니다.");
					errCnt++;
					continue;
				} else if (s1.equals("1") || s1.equalsIgnoreCase("yes") || s1.equalsIgnoreCase("y")) {
					ctrl = "start";
					continue;
				} else if (s1.equals("2") || s1.equalsIgnoreCase("no") || s1.equalsIgnoreCase("n")) {
					System.out.println("시행횟수 : " + cnt + "\t짝수의 개수 : " + cnt_even);

					even = (int) (cnt_even * 1000.0 / cnt) / 10.0;
					System.out.println("짝수의 비율은 " + even + "%입니다.");
					break;
				}
			} else {
				System.out.println("잘못된 접근입니다.");
				break;
			}

		}

	}

}
