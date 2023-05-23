package day13.com.ict.edu;

import java.util.Scanner;

public class testx {
	public static void main(String[] args) {
		// 가위바위보 게임
		// 높음 낮음 맞추는 게임
		// 계속할까요(y/n) 사용
		// 승률 구하기(퍼센트)
		// 다음주 수요일(5/17) => 개인

		// 정말 그만하시겠습니까? 한 번 더 물어보고 시간 확인 기능 추가 할 예정

		Scanner sc = new Scanner(System.in);
		String[] gmList = { "1.가위바위보 게임", "2.up & down mini", "3.가위바위보 하나 빼기", "    .", "    .", "    .", "100.전적 확인",
				"101.게임 종료" };
		String[] rps = { "1.✌가위", "2.✊바위", "3.✋보" };
		String[] rps1 = { "1", "✌", "가위" };
		String[] rps2 = { "2", "✊", "바위" };
		String[] rps3 = { "3", "✋", "보" };
		String[] listRes = { "게임 횟수 : ", "이긴 게임 : ", "현재 승점 : " };
		String[] listRes2 = { "현재 승률 : " };
		String[] rgy = { "yes", "y", "o", "ㅛㄷㄴ", "ㅛ", "ㅇ", "d", "예", "네", "좋아요", "할래요", "1" };
		String[] rgn = { "no", "n", "x", "ㅜㅐ", "ㅜ", "ㄴ", "s", "아니오", "아뇨", "싫어요", "안할래요", "2" };

		int playCnt1 = 0, playCnt2 = 0, playCnt3 = 0;
		int winCnt1 = 0, winCnt2 = 0, winCnt3 = 0; // 게임마다 카운트 필요
		int winPnt1 = 0, winPnt2 = 0, winPnt3 = 0;
		double perWin1 = 0.0, perWin2 = 0.0, perWin3 = 0.0;

		int[][] cnt = new int[gmList.length - 5][3];
		double[][] per = new double[gmList.length - 5][1];

		// 게임 선택
		gmWorld: while (true) {
			System.out.println("게임을 번호로 선택해주세요.");

			for (String g : gmList) {
				System.out.println(g);
			}
			int gameNum = sc.nextInt();
			System.out.println("------------------------------------------------");
			if (gameNum == 100) {
				System.out.println("전적 확인을 선택하셨습니다.");

				for (int i = 0; i < gmList.length - 5; i++) {

					if (cnt[i][0] == 0) {
						System.out.println("------------------------------------------------");
						System.out.println("게임" + (i + 1) + "의 기록이 없습니다.");
						System.out.println();
					} else if (cnt[i][0] > 0) {
						for (int j = 0; j < cnt[i].length; j++) {
							System.out.print(listRes[j] + cnt[i][j] + "\t");
							System.out.println();
						}
						for (int j = 0; j < per[i].length; j++) {
							System.out.print(listRes2[j] + per[i][j] + "%\t");
						}
						System.out.println();
					} else {
						continue gmWorld;
					}
				}
				System.out.println("------------------------------------------------");

				// 가위바위보 게임
			} else if (gameNum == 1) {
				System.out.println("✌ ✊ ✋ 가위바위보 게임에 오신 것을 환영합니다.");

				gm1: while (true) {
					System.out.println();
					System.out.println("인공지능이 생각중입니다...");
					try {
						for (int i = 3; i > 0; i--) {
							Thread.sleep(500);
							System.out.print(i + "...");
						}
					} catch (Exception e) {
						System.out.println("생각이 너무 많아 과부화 : " + e);
					}
					System.out.println();
					int ran = (int) (Math.random() * 3 + 1);
					String nmeChoice = "";

					switch (ran) {
					case 1:
						nmeChoice = "✌가위";
						break;
					case 2:
						nmeChoice = "✊바위";
						break;
					case 3:
						nmeChoice = "✋보";
						break;
					default:
						System.out.println("경고!! 잘못된 접근입니다.");
						continue gm1;
					}
					for (int i = 0; i < rps.length; i++) {
						System.out.print(rps[i] + " ");
					}
					System.out.println("중 하나를 골라주세요.");

					int inputRps = 0;

					// 가위바위보 값을 String으로 받는 while문
					while (true) {
						String strRps = sc.next();

						switch (strRps) {
						case "1":
						case "✌":
						case "가위":
							inputRps = 1;
							break;
						case "2":
						case "✊":
						case "바위":
							inputRps = 2;
							break;
						case "3":
						case "✋":
						case "보":
							inputRps = 3;
							break;
						default:
							System.out.println("1.✌가위 2.✊바위 3.✋보 중 하나를 골라주세요.");
							continue;
						}

						String cho = "";
						switch (inputRps) {
						case 1:
							cho = "✌가위";
							break;
						case 2:
							cho = "✊바위";
							break;
						case 3:
							cho = "✋보";
							break;
						default:
							System.out.println("경고!! : 잘못된 접근입니다.");
							continue gm1;
						}
						System.out.println(">>>>>>>>>>>>>>>>>>>>");
						System.out.println("당신의 선택 : " + cho);
						System.out.println("인공지능의 선택 : " + nmeChoice);

						int res = ran - inputRps;
						if (res == 0) {
							System.out.println("비겼습니다!");
							winPnt1 += 0;
						} else if (res == -1 || res == 2) {
							System.out.println("당신의 승리!");
							winCnt1++;
							winPnt1 += 20;
						} else {
							System.out.println("인공지능의 승리!");
							winPnt1 -= 10;
						}
						playCnt1++;
						perWin1 = (int) (winCnt1 * 1000 / playCnt1) / 10.0;

						cnt[0][0] = playCnt1;
						cnt[0][1] = winCnt1;
						cnt[0][2] = winPnt1;
						per[0][0] = perWin1;

						System.out.println();
						System.out.println("게임 횟수 : " + playCnt1);
						System.out.println("이긴 게임 : " + winCnt1);
						System.out.println("현재 승점 : " + winPnt1);
						System.out.println("현재 승률 : " + perWin1 + "%");
						System.out.println();

						re1: while (true) {
							System.out.println("게임을 다시 시작하시겠습니까?  예(Y), 아니오(N)");
							System.out.println("(전적 초기화 => reset)");
							String reGm = sc.next();

							for (int i = 0; i < rgy.length; i++) {
								if (rgy[i].equalsIgnoreCase(reGm)) {

									System.out.println("새 게임을 시작합니다.");
									continue gm1;
								}
							}
							for (int i = 0; i < rgn.length; i++) {
								if (rgn[i].equalsIgnoreCase(reGm)) {
									System.out.println("게임 선택 화면으로 돌아갑니다.");
									continue gmWorld;
								}
							}
							if (reGm.equalsIgnoreCase("reset")) {
								playCnt1 = 0;
								winCnt1 = 0;
								winPnt1 = 0;
								perWin1 = 0;
								continue gm1;
							}
							System.out.println("잘못 입력하셨습니다.");
							continue re1;
						}

					} // game1 마지막
//					if (playCnt > 3) {
//						break;
//						// 뉴게임 / 게임로비 / 프로그램 종료 추가할것
//					}

				}
				// up & down 게임
			} else if (gameNum == 2) {
				System.out.println("up & down mini 게임을 선택하셨습니다.");
				System.out.println("운도 실력이다! 당신의 운을 시험해보세요!");
				System.out.println("인공지능이 생각하는 수와 제시된 수를 비교하여 인공지능의 수가 더 크다면 up, 작다면 down을 선택해주세요.");
				System.out.println("< ***주의 인공지능의 수를 맞추는 게임이 아닙니다!! >");
				System.out.println(">>>>>>>>>");
				int mag = 9;
				int min = 1;
				gm2: while (true) {

					// 범위값 설정 기능 마지막에 추가할것
//							while(true) {
//								System.out.println("숫자의 범위값을 설정할 수 있습니다.");
//								
//								mag = sc.nextInt();
//								
//								if(mag==9) {
//									
//								}else if(mag==99) {
//									
//								}else if(mag==0) {
//									break;
//								}
//								
//							}
					System.out.println();
					System.out.println("인공지능이 생각중입니다...");
					try {
						for (int i = 5; i > 0; i--) {
							Thread.sleep(500);
							System.out.print(i + "...");
						}
					} catch (Exception e) {
						System.out.println("생각이 너무 많아 과부화 : " + e);
					}
					System.out.println();

					int aiNum = (int) (Math.random() * mag + 1);
					int disNum = 0;

					while (true) {
						disNum = (int) (Math.random() * (mag - 1) + 1);
						if (!(aiNum == disNum))
							break;
					}
					System.out.println("인공지능이 숫자를 결정하였습니다.");
					System.out.print("범위 : " + mag);
					System.out.println("  최소값 : " + min);
					System.out.println("인공지능의 숫자 : " + aiNum);
					System.out.println("제시된 숫자 : " + disNum);

					// 범위값 벗어나지 못하게 정해야함
					System.out.println("인공지능의 수가 더 크다면 1.up, 작다면 2.down을 선택해주세요.");
					int userInput = sc.nextInt();
					Boolean bflag = true;

					// while문 감싸야함

					if (aiNum > disNum) {
						if (userInput == 1) {
							bflag = true;
							System.out.println("정답입니다!");
						} else {
							bflag = false;
							System.out.println("정답이 아닙니다..");
						}
					} else if (aiNum < disNum) {
						if (userInput == 1) {
							bflag = false;
							System.out.println("정답이 아닙니다..");
						} else {
							bflag = true;
							System.out.println("정답입니다!");
						}

					} else {
						System.out.println("아차차 저도 사람인지라 실수를 할 때가 있답니다.");
						continue;
					}

					System.out.println("당신의 선택 : " + userInput);
					System.out.println("인공지능의 숫자 : " + aiNum);

					if (!bflag) {

						System.out.println("승점 1점 획득!");
						winCnt2++;
						continue;
					} else {
						System.out.println("또 졌어요?");
						break;
					}

				}

				// 게임3 가위바위보 하나 빼기 시작
			} else if (gameNum == 3) {
				System.out.println("✌ ✊ ✋ 가위바위보 하나빼기 ✋ ✊ ✌를 선택하셨습니다.");
				gm3: while (true) {
					System.out.println();
					System.out.println("인공지능이 생각중입니다...");
					try {
						for (int i = 5; i > 0; i--) {
							Thread.sleep(500);
							System.out.print(i + "...");
						}
					} catch (Exception e) {
						System.out.println("생각이 너무 많아 과부화 : " + e);
					}
					System.out.println();

					int ran = 0, ran2 = 0;

					// 인공지능이 값이 중복되지 않게 추출
					while (true) {
						ran = (int) (Math.random() * 3 + 1);
						ran2 = (int) (Math.random() * 3 + 1);
						if (!(ran == ran2))
							break;
					}
					String nmeChoice = "";
					String nmeChoice2 = "";

					switch (ran) {
					case 1:
						nmeChoice = "✌가위";
						break;
					case 2:
						nmeChoice = "✊바위";
						break;
					case 3:
						nmeChoice = "✋보";
						break;
					default:
						System.out.println("경고!! : 잘못된 접근입니다.");
						continue gm3;
					}
					switch (ran2) {
					case 1:
						nmeChoice2 = "✌가위";
						break;
					case 2:
						nmeChoice2 = "✊바위";
						break;
					case 3:
						nmeChoice2 = "✋보";
						break;
					default:
						System.out.println("경고!! : 잘못된 접근입니다.");
						continue gm3;
					}

					int inputRps = 0;
					int inputRps2 = 0;
					// 중복된 값을 입력하지 않도록 하는 while문
					babo: while (true) {
						for (int i = 0; i < rps.length; i++) {
							System.out.print(rps[i] + " ");
						}
						System.out.println("중 중복되지 않는 두 개를 골라주세요.");

						babo1: while (true) {
							System.out.print("왼손 : ");
							String strInput = sc.next();

							switch (strInput) {
							case "1":
							case "✌":
							case "가위":
								inputRps = 1;
								break babo1;
							case "2":
							case "✊":
							case "바위":
								inputRps = 2;
								break babo1;
							case "3":
							case "✋":
							case "보":
								inputRps = 3;
								break babo1;
							default:
								System.out.println("1.✌가위 2.✊바위 3.✋보 중 하나를 골라주세요.");
								break babo1;
							}
						}
						System.out.println();
						babo2: while (true) {
							System.out.print("ㅇ : ");
							String strInput2 = sc.next();

							switch (strInput2) {
							case "1":
							case "✌":
							case "가위":
								inputRps2 = 1;
								break;
							case "2":
							case "✊":
							case "바위":
								inputRps2 = 2;
								break;
							case "3":
							case "✋":
							case "보":
								inputRps2 = 3;
								break;
							default:
								System.out.println("1.✌가위 2.✊바위 3.✋보 중 하나를 골라주세요.");
								continue babo2;
							}
						}
					
					
					}

				}
			}

		} // gmWorld
	}
}