package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요(1.yes, 2.no)일 때 Ex01_Scanner2는 숫자로 받았는데
		// 문자가 들어오면 오류 발생된다.
		// 그래서 문자로 받아서 처리하자

		Scanner sc = new Scanner(System.in);

		// 짝수가 나온 확률을 구하라
		// 백분률로 구해볼 것

		int count = 0;
		int even = 0;

		esc: while (true) {
			count++;
			System.out.print("숫자입력 : ");
			int su = sc.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				even++;
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + " 입니다.");

			while (true) {
				System.out.println("계속할까요?(Y(y)/N(n)) >> ");
				String s1 = sc.next();
				// equalsIgnoreCase -> 대소문자 구분함
				if (s1.equalsIgnoreCase("y")) {
					continue esc;
				} else if (s1.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요.");
					continue;
				}
			}

		}
		double per = (even / (count * 1.0)) * 100;
		System.out.println("전체 개수 : " + count);
		System.out.println("짝수 개수 : " + even);
		System.out.println("퍼센트 : " + (int) (per * 10) / 10.0 + "%");

	}
}
