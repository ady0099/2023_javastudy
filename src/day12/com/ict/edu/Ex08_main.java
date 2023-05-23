package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_constructor coffee = new Ex08_constructor("커피음료",1000);
		Ex08_constructor ion = new Ex08_constructor("이온음료",1500);
		Ex08_constructor cola = new Ex08_constructor("탄산음료",1200);
		Ex08_constructor juice = new Ex08_constructor("과일음료",1800);
		

		Ex08_constructor[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요 >>> ");
		int input = scan.nextInt();

		// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)

		if (input < 1000) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈 : " + input);
		} else {
			System.out.println("커피\t이온\t탄산\t과일\t반환");

			// 입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("O\t");
					// System.out.println(arr[i].name+"\t");
				} else {
					System.out.print("X\t");
				}
			}

		}
		System.out.println();
		System.out.println("선택하세요 >> ");
		String drink = scan.next();
		int output = 0;

		// 자판기 코드에서 입금액과 판매액 중에 입금액이 작으면
		// 무조건 계산하지 않고 입금액 출력
		// 잔돈이 판매액보다 크면 다시 구매할 수 있는 선택 화면
		// 메뉴에 반환메뉴를 추가해서 입금 후 사지 않아도 될 수 있도록 한다

		switch (drink) {
		case "커피":
			output = input - arr[0].getPrice();
			break;
		case "이온":
			output = input - arr[1].getPrice();
			break;
		case "탄산":
			output = input - arr[2].getPrice();
			break;
		case "과일":
			output = input - arr[3].getPrice();
			break;
		case "반환":
			break;
		default:
			System.out.println("잘못 선택하셨네요");
			output = input;

		}
		System.out.println("잔돈 : " + output);

		
	}
}
