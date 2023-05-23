package day12.com.ict.edu;

import java.util.Scanner;

public class Hw0511_main {
	public static void main(String[] args) {
		// 자판기 코드에서 입금액과 판매액 중에 입금액이 작으면
		// 무조건 계산하지 않고 입금액 출력
		// 잔돈이 판매액보다 크면 다시 구매할 수 있는 선택 화면
		// 메뉴에 반환메뉴를 추가해서 입금 후 사지 않아도 될 수 있도록 한다

		Hw0511_con coffee = new Hw0511_con("커피음료", 1000);
		Hw0511_con ion = new Hw0511_con("이온음료", 1500);
		Hw0511_con cola = new Hw0511_con("탄산음료", 1200);
		Hw0511_con juice = new Hw0511_con("과일음료", 1800);

		Hw0511_con[] arr = { coffee, ion, cola, juice };
		String[] han = new String[arr.length+2];
		// String[] han = { "커피", "이온", "콜라", "과일", "금액", "반환" };
		// String[] arr2 = { "금액", "반환" };
		
		Boolean flag = true;
		String drink2 = "";
		
		Hw0511_con hw = new Hw0511_con();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요.   >>>\t");
		
		int input = sc.nextInt();

		// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
		// 0이하의 수 입력 불가, 100의 배수가 아니면 입력 불가
		esc: while (true) {
			if (input < 100 || input % 100 != 0) {
				hw.inputErrMsg();

				int s = sc.nextInt();
				
				if (s < 100 || s % 100 != 0) {
					continue esc;
				}
			}
			if (input < 1000) {
				System.out.println("현재 금액 : " + input);
				System.out.println("메뉴를 선택하시려면 금액을 추가해주세요.(1000 이상)");
				System.out.println("금액을 반환하시려면 0을 입력해주세요.");

				int s = sc.nextInt();

				if (s == 0) {
					System.out.println("금액을 반환합니다.");
					System.out.println("금액 반환 : " + input);
					break esc;
				} else if (s < 100 || s % 100 != 0) {
					hw.inputErrMsg();
					System.out.println();
					continue esc;
				} else {
					input += s;
					continue esc;
				}
			} else {
				System.out.println("===============================================");
				// 자판기 메뉴 출력
				for(int i =0; i<han.length; i++) {
					if(i==han.length-2) {
						han[i]="금액";
					}else if(i==han.length-1) {
						han[i]="반환";
					}else {
						han[i]=arr[i].getName().replace("음료", "");
					}
					System.out.print(han[i]+"\t");
				}
				System.out.println();
				
				// System.out.println("커 피\t이 온\t탄 산\t과 일\t금 액\t반 환");
				// 메뉴 가격 확인이 쉽도록 전부 표기
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i].getPrice() + "\t");
					if(i==3) {	
						System.out.print(input);
						System.out.println();
					}
				}
			}
			if(flag) {
			// 입력금액과 각 음료수의 가격을 비교
			// 금액이 부족하면 음료 하단에 x로 표시
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= input) {
						System.out.print(" O\t");
						// System.out.println(arr[i].name+"\t");
					} else {
						System.out.print(" X\t");
					}
				}
				System.out.println();
				System.out.println("메뉴를 선택하세요.   >>>");
				System.out.println("===============================================");
				System.out.println("금액을 추가하시려면 추가를, 반환하시려면 반환을 입력해주세요.");
				String drink = sc.next();
				System.out.println("===============================================");
				
				int t = input;
				
				switch (drink) {
					case "커피":
						t -= arr[0].getPrice();
						drink2 = "커피음료";
						break;
					case "이온":
						t -= arr[1].getPrice();
						drink2 = "이온음료";
						break;
					case "탄산":
						t -= arr[2].getPrice();
						drink2 = "탄산음료";
						break;
					case "과일":
						t -= arr[3].getPrice();
						drink2 = "과일음료";
						break;
					case "반환":
						flag = false;
						break;
					case "추가":
						System.out.print("추가하실 금액을 입력해주세요.\t");
						int s = sc.nextInt();
						if(s < 100 || s % 100 != 0) {
							input += 0;
							hw.inputErrMsg();
						}else {
							input += s;
						}
						continue esc;
					default:
						System.out.println("잘못 선택하셨습니다.");
						continue;
				}
				if (!flag) {
					System.out.println("금액 반환 : " + input);
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break esc;
				} else {
					if(input>=1000) {
						input = t;
						System.out.println(drink2 + "을(를) 선택하셨습니다.");
					}else{
						System.out.println("잔액이 부족합니다.");
						System.out.println("금액 반환 : " + input);
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						break esc;
					}
				}
			}else {
				break;
			}
		}
	}

}
