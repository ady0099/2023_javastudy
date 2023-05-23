package Homework;

import java.util.Scanner;

public class Hw0519_Baseball {
	public static void main(String[] args) {
		// 숫자 야구 게임
		// 몇 번 만에 맞췄는지 출력
		// 10회 이상부터 계속할까요? (y/n) 게임 포기
		// 몇 번째에 출력
		// 다음주 금요일(5/19) => 팀

		Hw0512_2 hw = new Hw0512_2();

		System.out.println("게임을 시작합니다.");

		Scanner sc = new Scanner(System.in);

		String input1, input2, input3;
		int bsNum1 = 0, bsNum2 = 0, bsNum3 = 0;
		String bsNum;
		String user="";
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		int cnt = 0;
		int winCnt = 0;
		double perWin = 0.0;
		int baboCnt = 0;
		boolean baboChk1 = false, baboChk2 = false, baboChk3 = false;

		String[] rgy = { "yes", "y", "o", "ㅛㄷㄴ", "ㅛ", "ㅇ", "예", "네", "좋아요", "할래요", "1" };
		String[] rgn = { "no", "n", "x", "ㅜㅐ", "ㅜ", "ㄴ", "아니오", "아뇨", "싫어요", "안할래요", "2" };
		String[] arrNum = new String[3];

		inputName: while (true) {

			System.out.println("이름을 입력해주세요.");
			user = sc.next();

			startGame: while (true) {
				int reCnt = 0;
				// 중복 없는 랜덤 숫자 뽑기
				while (true) {
					bsNum1 = (int) (Math.random() * 10);
					bsNum2 = (int) (Math.random() * 10);
					bsNum3 = (int) (Math.random() * 10);
					if (!(bsNum1 == bsNum2 || bsNum2 == bsNum3 || bsNum3 == bsNum1))
						break;
				}
				bsNum = "" + bsNum1 + bsNum2 + bsNum3;
				System.out.println(bsNum + "<<- 나중에 가릴 숫자입니다");

				System.out.println("숫자가 생성되었습니다.");

				input: while (true) {
					System.out.println("0~9 사이의 중복되지 않는 3개의 숫자를 입력해주세요.");
					strike = 0;
					ball = 0;
					out = 0;

					int intInput1 = 0, intInput2 = 0, intInput3 = 0;
					// 숫자를 잘못입력할 경우 재입력
					input1: while (true) {
						System.out.print("첫 번째 숫자 : ");

						try {
							input1 = sc.next();
							intInput1 = Integer.parseInt(input1.replaceAll("[^0-9]", ""));
							if (intInput1 >= 0 && intInput1 < 10) {
								break input1;
							} else {
								hw.errMsg();
								continue input1;
							}
						} catch (Exception e) {
							hw.errMsg();
							continue input1;
						}
					}
					input2: while (true) {
						System.out.print("두 번째 숫자 : ");
						try {
							input2 = sc.next();
							intInput2 = Integer.parseInt(input2.replaceAll("[^0-9]", ""));
							if (input1.equals(input2)) {
								System.out.println("중복되는 숫자를 입력하셨습니다.");
								continue input2;
							} else if (intInput2 >= 0 && intInput2 < 10) {
								break input2;

							} else {
								hw.errMsg();
								continue input2;
							}
						} catch (Exception e) {
							hw.errMsg();
						}

					}
					input3: while (true) {
						System.out.print("세 번째 숫자 : ");

						try {
							input3 = sc.next();
							intInput3 = Integer.parseInt(input3.replaceAll("[^0-9]", ""));
							if (intInput3 == intInput1 || intInput3 == intInput2) {
								System.out.println("중복되는 숫자를 입력하셨습니다.");
								continue input3;

							} else if (intInput3 >= 0 && intInput3 < 10) {
								break input3;
							}
						} catch (Exception e) {
							hw.errMsg();
						}

					}
					cnt++;
					reCnt++;

					if (intInput1 == bsNum1)
						strike++;
					if (intInput2 == bsNum2)
						strike++;
					if (intInput3 == bsNum3)
						strike++;
					if (intInput1 == bsNum2 || intInput1 == bsNum3)
						ball++;
					if (intInput2 == bsNum1 || intInput2 == bsNum3)
						ball++;
					if (intInput3 == bsNum1 || intInput3 == bsNum2)
						ball++;
					out = 3 - (strike + ball);

					System.out.print(">>>>> ");
					if (strike > 0)
						System.out.print(strike + "스트라이크 ");
					if (ball > 0)
						System.out.print(ball + "볼 ");
					if (out > 0)
						System.out.print(out + "아웃");
					System.out.println();

					if (reCnt > 2) {
						System.out.println(reCnt + "번 틀리셨습니다...");
						perWin = (int) ((winCnt / cnt) * 1000) / 10.0;

						System.out.println("힌트를 확인하시겠습니까? 예(Y), 아니오(N)");
						{
							String hint = sc.next();
							int hInput = 0;

							for (int i = 0; i < rgy.length; i++) {
								if (rgy[i].equalsIgnoreCase(hint)) {
									System.out.println("몇 번째 숫자를 확인하시겠습니까? (1~3)");
									hInput = sc.nextInt();

									if (hInput == 1) {
										System.out.println("첫 번째 숫자는 " + bsNum1 + "입니다.");
										baboChk1 = true;
									} else if (hInput == 2) {
										System.out.println("두 번째 숫자는 " + bsNum2 + "입니다.");
										baboChk2 = true;
									} else if (hInput == 3) {
										System.out.println("첫 번째 숫자는 " + bsNum3 + "입니다.");
										baboChk3 = true;
									}
									baboCnt++;
									continue input;
								}

							}

						}

						break;
					}
					if (baboChk1 && baboChk2 && baboChk3) {
						System.out.println("모든 힌트를 확인하셨습니다.");
					}

					if (strike == 3) {
						System.out.println("정답입니다! " + reCnt + "번만에 맞추셨습니다! ");
						winCnt++;
						perWin = (int) ((winCnt / cnt) * 1000) / 10.0;
						break;
					} else {
						System.out.println("현재 도전 횟수 : " + reCnt);
						if (baboCnt > 0) {
							for (int i = 0; i < baboCnt; i++) {
								System.out.println("당신은 바보입니까?");
							}
						}
						continue input;
					}
				}
				// 게임 재시작 / 종료
				reGame: while (true) {
					System.out.println("승 : " + winCnt + " 승률 : " + perWin);

					while (true) {
						System.out.println("순위를 기록하시겠습니까? 예(Y), 아니오(N)");
						String rk = sc.next();

						for (int i = 0; i < rgy.length; i++) {
							if (rgy[i].equalsIgnoreCase(rk)) {

								continue startGame;
							}
						}
						for (int i = 0; i < rgn.length; i++) {
							if (rgn[i].equalsIgnoreCase(rk)) {
								System.out.println("이용해주셔서 감사합니다.");
								sc.close();
								break startGame;
							}
						}
						break;
					}

					System.out.println("게임을 다시 시작하시겠습니까? 예(Y), 아니오(N)");
					String reGm = sc.next();

					for (int i = 0; i < rgy.length; i++) {
						if (rgy[i].equalsIgnoreCase(reGm)) {

							System.out.println("새 게임을 시작합니다.");
							continue startGame;
						}
					}
					for (int i = 0; i < rgn.length; i++) {
						if (rgn[i].equalsIgnoreCase(reGm)) {
							System.out.println("이용해주셔서 감사합니다.");
							sc.close();
							break startGame;
						}
					}
					System.out.println("잘못 입력하셨습니다.");
					continue reGame;

				} // regame
			} // startgame
		} // inputName
	}// main
}// baseball

class Hw0512_2 {
	public Hw0512_2() {

	}

	public void errMsg() {
		System.out.println("0~9 사이의 숫자를 입력해주세요.");
	}

}
