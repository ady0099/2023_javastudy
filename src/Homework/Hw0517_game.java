package Homework;

import java.util.Scanner;

public class Hw0517_game {
	public static void main(String[] args) {
		
	
		// 가위바위보 게임
		// 높음 낮음 맞추는 게임
		// 계속할까요(y/n) 사용
		// 승률 구하기(퍼센트)
		// 다음주 수요일(5/17) => 개인

		// 정말 그만하시겠습니까? 한 번 더 물어보고 시간 확인 기능 추가 할 예정

		Scanner sc = new Scanner(System.in);

		String[] gmList = { "1.가위바위보 게임", "2.UP & DOWN PLUS+", "3.가위바위보 하나 빼기" };
		String[] etcList = { "    .", "    .", "    .", "100.전적 확인", "101.게임 종료" };
		String[] rps = { "1.✌가위", "2.✊바위", "3.✋보" };
		int[] rpsNum = { 1, 2, 3 };
		String[] rps1 = { "1", "✌", "가위" };
		String[] rps2 = { "2", "✊", "바위" };
		String[] rps3 = { "3", "✋", "보" };
		String[] listRes = { "게임 횟수 : ", "이긴 게임 : ", "현재 승점 : " };
		String[] listRes2 = { "현재 승률 : " };
		String[] rgy = { "yes", "y", "o", "ㅛㄷㄴ", "ㅛ", "ㅇ", "d", "예", "네", "좋아요", "할래요", "1" };
		String[] rgn = { "no", "n", "x", "ㅜㅐ", "ㅜ", "ㄴ", "s", "아니오", "아뇨", "싫어요", "안할래요", "2" };
		String[] hands = new String[2];
		String[] nmeChoice = new String[2];
		String load = "\t N O W   L O A D I N G . . . ";

		int playCnt1 = 0, playCnt2 = 0, playCnt3 = 0;
		int winCnt1 = 0, winCnt2 = 0, winCnt3 = 0; // 게임마다 카운트 필요
		int winPnt1 = 0, winPnt2 = 0, winPnt3 = 0;
		double perWin1 = 0.0, perWin2 = 0.0, perWin3 = 0.0;
		String reg = "^[0-9]+$";

		int[][] cnt = new int[gmList.length][3];
		double[][] per = new double[gmList.length][1];

		// 게임 선택
		gmWorld: while (true) {
			System.out.println("------------------------------------------------");
			try {
				for (int i = 0; i < load.length(); i++) {
					char c = load.charAt(i);

					System.out.print(c);
					Thread.sleep(20);
				}
			} catch (Exception e) {
				System.out.println("로드 실패 : ");
				break gmWorld;
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("게임을 번호로 선택해주세요.");
			System.out.println();

			// 입력된 게임 목록
			for (String g : gmList) {
				System.out.println(g);
			}
			for (String e : etcList) {
				System.out.println(e);
			}

			// 오입력으로 인한 프로그램 에러 방지
			int gameNum = 0;
			while (true) {
				String gameSelect = sc.next();
				switch (gameSelect) {
				case "1":
					gameNum = 1;
					break;
				case "2":
					gameNum = 2;
					break;
				case "3":
					gameNum = 3;
					break;
				case "100":
					gameNum = 100;
					break;
				case "101":
					gameNum = 101;
					break;
				default:
					gameNum = 777;
					break;
				}
				break;
			}
			System.out.println("------------------------------------------------");

			if (gameNum == 100) {
				try {
					for (int i = 0; i < load.length(); i++) {
						char c = load.charAt(i);

						System.out.print(c);
						Thread.sleep(35);
					}
				} catch (Exception e) {
					System.out.println("로드 실패 : ");
					continue gmWorld;
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("전적 확인을 선택하셨습니다.");

				// 전적 다시보기
				rep: while (true) {
					for (int i = 0; i < gmList.length; i++) {

						if (cnt[i][0] == 0) {
							System.out.println("------------------------------------------------");
							System.out.println("게임" + gmList[i] + "의 기록이 없습니다.");
							System.out.println();
						} else if (cnt[i][0] > 0) {
							System.out.println("------------------------------------------------");
							System.out.println("게임" + gmList[i] + "의 기록");
							System.out.println();
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
					System.out.println("게임 선택 화면으로 돌아가려면 아무 키나 입력해주세요. (전적 다시 보기 : R, 전적 초기화 : RESET)");

					// 전적 다시보기 & 초기화
					String r = sc.next();
					if (r.equalsIgnoreCase("r") || r.equals("ㄱ")) {
						continue rep;
					} else if ((r.equalsIgnoreCase("reset")) || r.equals("ㄱㄷㄴㄷㅅ")) {

						int delNum = 0;
						rst: while (true) {
							System.out.println("몇 번 게임의 전적을 초기화하시겠습니까? (취소 : 1002, 전부 초기화 : 1051)");
							for (int i = 0; i < gmList.length; i++) {
								System.out.print(gmList[i] + "\t\t");
								if (!(i == 0) && i % 2 == 0) {
									System.out.println();
								}
							}

							String resetNum = sc.next();
							switch (resetNum) {
							case "1":
								delNum = 0;
								break;
							case "2":
								delNum = 1;
								break;
							case "3":
								delNum = 2;
								break;
							case "1002":
								delNum = 1002;
								break;
							case "1051":
								delNum = 9478254;
								break;
							default:
								System.out.println("잘못 입력하셨습니다.");
								continue rst;
							}
							break;
						}

						if (delNum == 1002) {
							System.out.println("게임 선택화면으로 돌아갑니다.");
							continue gmWorld;

							// 모든 전적 삭제
						} else if (delNum == 9478254) {
							resetAll: while (true) {
								System.out.println("정말로 모든 데이터를 삭제하시겠습니까? 삭제한 데이터는 복구할 수 없습니다. 예(Y), 아니오(N)");
								String resetNum2 = sc.next();

								for (int i = 0; i < rgy.length; i++) {
									if (rgy[i].equalsIgnoreCase(resetNum2)) {
										for (int j = 0; j < gmList.length; j++) {
											for (int k = 0; k < cnt.length; k++) {
												cnt[j][k] = 0;
											}

										}
										for (int j = 0; j < gmList.length; j++) {
											per[j][0] = 0;
										}
										System.out.println("전적 확인 화면으로 돌아갑니다."); 
										continue rep;
									}
								}
								for (int i = 0; i < rgn.length; i++) {
									if (rgn[i].equalsIgnoreCase(resetNum2)) {
										System.out.println("전적 확인 화면으로 돌아갑니다.");
										continue rep;
									}
								}
							}
							// 번호 선택 후 전적 개별 초기화
						} else if (delNum < gmList.length) {
							resetOne: while (true) {
								switch (delNum) {
								case 0 : cnt[delNum][0] = 0; cnt[delNum][1] = 0; cnt[delNum][2] = 0; per[delNum][0]=0;  break;
								case 1 : cnt[delNum][0] = 0; cnt[delNum][1] = 0; cnt[delNum][2] = 0; per[delNum][0]=0; break;
								case 2 : cnt[delNum][0] = 0; cnt[delNum][1] = 0; cnt[delNum][2] = 0; per[delNum][0]=0; break;
								default:
									System.out.println("입력값 오류");
									continue rep;
								}
								System.out.println(gmList[delNum]+ "의 전적이 초기화 되었습니다.");
								System.out.println("전적 확인 화면으로 돌아갑니다.");
								continue rep;
							}
						} else {
							continue gmWorld;
						}
					} else {
						System.out.println("전적이 초기화 되었습니다.");
						System.out.println("전적 확인 화면으로 돌아갑니다.");
						break rep;
					}

				}
				// 게임1 가위바위보
			} else if (gameNum == 1) {
				try {
					for (int i = 0; i < load.length(); i++) {
						char c = load.charAt(i);

						System.out.print(c);
						Thread.sleep(35);
					}
				} catch (Exception e) {
					System.out.println("로드 실패 : ");
					continue gmWorld;
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("✌ ✊ ✋ 가위바위보 게임에 오신 것을 환영합니다.");
				System.out.print("게임을 시작하시려면 아무 키나 입력해주세요.");
				sc.next();

				gm1: while (true) {
					System.out.println();
					System.out.println("인공지능이 생각중입니다...");
					try {
						for (int i = 3; i > 0; i--) {
							Thread.sleep(300);
							System.out.print(i + "...");
						}
					} catch (Exception e) {
						System.out.println("생각이 너무 많아 과부화 : " + e);
					}
					System.out.println();
					int ran = (int) (Math.random() * 3 + 1);
					String aiChoice = "";

					switch (ran) {
					case 1:
						aiChoice = "✌가위";
						break;
					case 2:
						aiChoice = "✊바위";
						break;
					case 3:
						aiChoice = "✋보";
						break;
					default:
						System.out.println("경고!! 잘못된 접근입니다.");
						continue gm1;
					}
					for (int i = 0; i < rps.length; i++) {
						System.out.print(rps[i] + " ");
					}
					System.out.println("중 하나를 선택해주세요.");

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
							System.out.println("1.✌가위 2.✊바위 3.✋보 중 하나를 선택해주세요.");
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
						System.out.println("인공지능의 선택 : " + aiChoice);

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

						// 게임에서 나가더라도 전적을 확인할 수 있도록 배열에 카운트값 저장
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
							// 전적 초기화
							if (reGm.equalsIgnoreCase("reset") || reGm.equals("ㄱㄷㄴㄷㅅ")) {
								playCnt1 = 0;
								winCnt1 = 0;
								winPnt1 = 0;
								perWin1 = 0;
								System.out.println("전적을 초기화합니다.");
								continue gm1;
							}
							System.out.println("잘못 입력하셨습니다.");
							continue re1;
						}
					}
				}
				// 게임2 UP & DOWN PLUS+ 게임
			} else if (gameNum == 2) {
				System.out.println("운도 실력이다! 당신의 운을 시험해보세요!");
				System.out.println("👍 & 👎 PLUS+ 게임에 오신것을 환영합니다.");

				int max = 9;
				int min = 1;

				gm2: while (true) {
					System.out.println("설정된 값으로 게임을 시작하시려면 아무 키나 입력해주세요. (설정 변경 : CCC)");

					// 범위값 변경하기
					// min 1 이상, max 999 이하
					// up down을 하려면 두 수의 차이는 2 이상이어하므로 인공지능의 범위는 제시숫자의 범위보다 앞뒤로 최소 1씩은 커야한다.

					String s = sc.next();
					ccc: while (true) {
						if (s.equalsIgnoreCase("CCC") || s.equals("ㅊㅊㅊ")) {
							System.out.println(gmList[1] + " 사용자 지정 화면입니다.");
							System.out.println("숫자의 범위를 지정할 수 있습니다.");
							System.out.println("------------------------------------------------");

							int iMin = 0, iMax = 0;
							// String 오입력 방지 while문
							min: while (true) {
								System.out.print("최소(1~995) : ");
								String sMin = sc.next();

								if (sMin.matches(reg)) {
									iMin = Integer.parseInt(sMin);
								} else {
									continue min;
								}

								if (iMin > 0 && iMin < 996) {
									min = iMin;
								} else {
									System.out.println("지정 가능한 범위는 1~995입니다.");
									continue min;
								}
								break;
							}
							max: while (true) {
								System.out.print("최대(5~999) : ");
								String sMax = sc.next();
								System.out.println("------------------------------------------------");

								if (sMax.matches(reg)) {
									iMax = Integer.parseInt(sMax);
								} else {
									continue max;
								}

								if (iMax < (min + 3)) {
									System.out.println("최소와 최대의 차이는 4 이상이어야 합니다.");
									continue max;
								} else if (iMax > (min + 4) && iMax < 1000) {
									max = iMax;
								} else {
									continue max;
								}
								break;
							}
							break ccc;
						}
						break;
					}
					System.out.println("현재 숫자의 범위는 " + min + " ~ " + max + "입니다.");
					System.out.println("인공지능의 숫자는 제시될 숫자보다 높거나 낮으며, 같은 수는 나오지 않습니다.");

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

					// 인공지능의 숫자, 비교할 숫자를 다른 값으로 추출
					int aiNum = 0;
					int disNum = 0;
					while (true) {
						aiNum = (int) (Math.random() * max + min);
						disNum = (int) ((Math.random() * (max - 1)) + (min + 1));
						if (!(aiNum == disNum) && (disNum < max))
							break;

					}
					System.out.println("------------------------------------------------");
					System.out.println("제시된 숫자 : " + disNum);
					System.out.println("인공지능이 숫자 카드 한 장을 뽑았습니다. ✡");
					System.out.println("\t\t✡ = ??");
					System.out.println("------------------------------------------------");
					System.out.print("인공지능이 뽑은 숫자가 ");

					if (max == (disNum + 1)) {
						System.out.print(max);
					} else {
						System.out.print((disNum + 1) + " ~ " + max);
					}
					System.out.println("(이)라고 생각하시면 👍(UP)을, ");

					if (min == (disNum - 1)) {
						System.out.print(min);
					} else {
						System.out.print(min + " ~ " + (disNum - 1));
					}
					System.out.println("(이)라고 생각하시면 👎(DOWN)을 선택해주세요.");

					Boolean bflag = true;
					String chkInput = "";

					// 정답 체크
					chkInput: while (true) {
						String userInput = sc.next();

						switch (userInput.toUpperCase()) {
						case "1":
						case "UP":
						case "ㅕㅔ":
						case "👍":
							chkInput = "1";
							break chkInput;
						case "2":
						case "DOWN":
						case "애주":
						case "👎":
							chkInput = "2";
							break chkInput;
						default:
							System.out.println("제대로 입력해주세요.");
							continue chkInput;
						}
					}
					// 승점을 뻥튀기 시켜주는 추가 배율도 같이 계산
					double mag;

					if (aiNum > disNum) {
						if (chkInput.equals("1")) {
							bflag = true;
							mag = (double) ((disNum - min)) / (max - min - 1);
							System.out.println("정답입니다!");
							winCnt2++;
						} else {
							bflag = false;
							mag = (double) ((max - disNum)) / (max - min - 1);
							System.out.println("정답이 아닙니다..");
						}
					} else if (aiNum < disNum) {
						if (chkInput.equals("2")) {
							bflag = true;
							mag = (double) ((max - disNum)) / (max - min - 1);
							System.out.println("정답입니다!");
							winCnt2++;
						} else {
							bflag = false;
							mag = (double) ((disNum - min)) / (max - min - 1);
							System.out.println("정답이 아닙니다..");
						}
					} else {
						System.out.println("아차차 저도 사람인지라 실수를 할 때가 있답니다.");
						continue;
					}

					// 결과 표시를 위해 재변환
					String resInput = "";
					switch (chkInput) {
					case "1":
						resInput = "👍(UP)";
						break;
					case "2":
						resInput = "👎(DOWN)";
						break;
					default:
						break;
					}

					System.out.println(">>>>>>>>>>>>>>>>>>>>");

					System.out.println("제시된 숫자 : " + disNum);
					System.out.println("인공지능의 숫자 : " + aiNum);
					System.out.println("당신의 선택 : " + resInput);

					int pnt = 20;
					System.out.println("기본 승점 : " + pnt);
					System.out.println("추가 배율 : " + (int) (mag * 1000) / 10.0 + "%");

					// 잭팟
					int op = 0;
					double magAdd = 1.0;
					if (bflag) {
						int ranX = (int) (Math.random() * 100 + 1);
						int ranY = (int) (Math.random() * 100 + 1);

						if (ranX == ranY) {
							if (ranX == 1 || ranX == 100) {
								System.out.println("잭팟! 0.02%의 행운!");
								System.out.println("추가 배율 5배 지급!!");
								magAdd *= 6;
							} else if (ranX == 75 || ranX == 50 || ranX == 75) {
								System.out.println("잭팟! 0.03%의 행운!");
								System.out.println("추가 배율 3.3배 지급!!");
								magAdd *= 4.3;
							} else if (ranX == 77) {
								System.out.println("잭팟! 0.01%의 행운!");
								System.out.println("추가 배율 10배 지급!!");
								magAdd *= 11;
							} else {
								magAdd *= 1;
							}
						}
						op = ((int) (pnt * (1 + mag * magAdd) * 100)) / 100;
						winPnt2 += op;
						System.out.println("승리!");

					} else {
						System.out.println("다음 번에는 잘할 수 있을 거에요.");
						op = (int) ((pnt / 2) * (1 + mag));
						winPnt2 -= op;
					}

					playCnt2++;
					perWin2 = (int) (winCnt2 * 1000 / playCnt2) / 10.0;

					// 게임에서 나가더라도 전적을 확인할 수 있도록 배열에 카운트값 저장
					cnt[1][0] = playCnt2;
					cnt[1][1] = winCnt2;
					cnt[1][2] = winPnt2;
					per[1][0] = perWin2;

					System.out.println();
					System.out.println("게임 횟수 : " + playCnt2);
					System.out.println("이긴 게임 : " + winCnt2);
					if (bflag) {
						System.out.println("얻은 승점 : " + op);
					} else {
						System.out.println("잃은 승점 : " + op);
					}
					System.out.println("현재 승점 : " + winPnt2);
					System.out.println("현재 승률 : " + perWin2 + "%");
					System.out.println();

					re2: while (true) {
						System.out.println("게임을 다시 시작하시겠습니까?  예(Y), 아니오(N)");
						System.out.println("(전적 초기화 => reset)");
						String reGm = sc.next();

						for (int i = 0; i < rgy.length; i++) {
							if (rgy[i].equalsIgnoreCase(reGm)) {
								System.out.println("새 게임을 시작합니다.");
								continue gm2;
							}
						}
						for (int i = 0; i < rgn.length; i++) {
							if (rgn[i].equalsIgnoreCase(reGm)) {
								System.out.println("게임 선택 화면으로 돌아갑니다.");
								continue gmWorld;
							}
						}
						if (reGm.equalsIgnoreCase("reset") || reGm.equals("ㄱㄷㄴㄷㅅ")) {
							playCnt2 = 0;
							winCnt2 = 0;
							winPnt2 = 0;
							perWin2 = 0;
							System.out.println("전적을 초기화합니다.");
							continue gm2;
						}
						System.out.println("잘못 입력하셨습니다.");
						continue re2;
					}

				}
				// 게임3 가위바위보 하나 빼기 시작
			} else if (gameNum == 3) {
				try {
					for (int i = 0; i < load.length(); i++) {
						char c = load.charAt(i);

						System.out.print(c);
						Thread.sleep(50);
					}
				} catch (Exception e) {
					System.out.println("로드 실패 : ");
					continue gmWorld;
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("✌ ✊ ✋ 가위바위보 하나빼기 ✋ ✊ ✌를 선택하셨습니다.");
				System.out.print("게임을 시작하시려면 아무키나 입력해주세요.");
				sc.next();

				gm3: while (true) {
					System.out.println();
					System.out.println("인공지능이 생각중입니다...");
					try {
						for (int i = 5; i > 0; i--) {
							Thread.sleep(300);
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

					switch (ran) {
					case 1:
						nmeChoice[0] = "✌가위";
						break;
					case 2:
						nmeChoice[0] = "✊바위";
						break;
					case 3:
						nmeChoice[0] = "✋보";
						break;
					default:
						System.out.println("경고!! : 잘못된 접근입니다.");
						continue gm3;
					}
					switch (ran2) {
					case 1:
						nmeChoice[1] = "✌가위";
						break;
					case 2:
						nmeChoice[1] = "✊바위";
						break;
					case 3:
						nmeChoice[1] = "✋보";
						break;
					default:
						System.out.println("경고!! : 잘못된 접근입니다.");
						continue gm3;
					}

					int inputRps = 0;
					int inputRps2 = 0;
					// 중복된 값을 입력하지 않도록 하는 while문
					while (true) {
						for (int i = 0; i < rps.length; i++) {
							System.out.print(rps[i] + " ");
						}
						System.out.println("중에서 선택해주세요.");

						while (true) {
							System.out.print("왼손 : ");
							String strInput = sc.next();

							switch (strInput) {
							case "1":
							case "✌":
							case "가위":
								inputRps = 1;
								hands[0] = "✌가위";
								break;
							case "2":
							case "✊":
							case "바위":
								inputRps = 2;
								hands[0] = "✊바위";
								break;
							case "3":
							case "✋":
							case "보":
								inputRps = 3;
								hands[0] = "✋보";
								break;
							default:
								System.out.println("1.✌가위 2.✊바위 3.✋보 중 하나를 선택해주세요.");
								continue;
							}
							break;
						}

						while (true) {
							if (inputRps == 1) {
								System.out.print(rps[1] + " " + rps[2]);
							} else if (inputRps == 2) {
								System.out.print(rps[0] + " " + rps[2]);
							} else if (inputRps == 3) {
								System.out.print(rps[0] + " " + rps[1]);
							}
							System.out.println(" 중 하나를 선택해주세요.");

							System.out.print("오른손 : ");
							String strInput2 = sc.next();

							switch (strInput2) {
							case "1":
							case "✌":
							case "가위":
								inputRps2 = 1;
								hands[1] = "✌가위";
								if (!(inputRps == inputRps2))
									break;
								else
									continue;
							case "2":
							case "✊":
							case "바위":
								inputRps2 = 2;
								hands[1] = "✊바위";
								if (!(inputRps == inputRps2))
									break;
								else
									continue;

							case "3":
							case "✋":
							case "보":
								inputRps2 = 3;
								hands[1] = "✋보";
								if (!(inputRps == inputRps2))
									break;
								else
									continue;
							default:
								continue;
							}
							break;
						}
						System.out.println();
						System.out.println("당신의 선택\t:   [" + hands[0] + "]와 [" + hands[1] + "]");
						System.out.println("인공지능의 선택\t:   [" + nmeChoice[0] + "]와 [" + nmeChoice[1] + "]");
						System.out.println();

						int nmeRan = 0;
						String finChoice = "";
						int finNum = 0;

						// 인공지능의 최종 선택
						nmeRan = (int) (Math.random() * 2 + 1);
						if (nmeRan == 1) {
							finChoice = nmeChoice[0];
						} else {
							finChoice = nmeChoice[1];
						}

						switch (finChoice) {
						case "✌가위":
							finNum = 1;
							break;
						case "✊바위":
							finNum = 2;
							break;
						case "✋보":
							finNum = 3;
							break;
						default:
							break;
						}

						int inputFinal = 0;
						finInput: while (true) {
							System.out.print("무엇을 낼까요? ");
							System.out.println(hands[0] + "? " + hands[1] + "? ");

							// 선택한 2개 중에서 결정
							inputFinal = sc.nextInt();
							if (inputFinal == inputRps || inputFinal == inputRps2) {
								break;
							} else {
								System.out.println("손은 두 개밖에 없어요.");
								continue finInput;
							}
						}
						try {
							for (int i = 3; i > 0; i--) {
								Thread.sleep(500);
								System.out.print(i + "...");
							}
						} catch (Exception e) {
							System.out.println("하나 빼기는 너무 어려워");
						}
						System.out.println();

						String cho = "";
						switch (inputFinal) {
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
							continue gm3;
						}

						System.out.println(">>>>>>>>>>>>>>>>>>>>");
						System.out.println("당신의 최종 선택 : " + cho);
						System.out.println("인공지능의 최종 선택 : " + finChoice);

						int res = finNum - inputFinal;
						if (res == 0) {
							System.out.println("비겼습니다!");
							winPnt3 += 0;
						} else if (res == -1 || res == 2) {
							System.out.println("당신의 승리!");
							winCnt3++;
							winPnt3 += 20;
						} else {
							System.out.println("인공지능의 승리!");
							winPnt3 -= 10;
						}
						playCnt3++;
						perWin3 = (int) (winCnt3 * 1000 / playCnt3) / 10.0;
						// 게임에서 나가더라도 전적을 확인할 수 있도록 배열에 카운트값 저장
						cnt[2][0] = playCnt3;
						cnt[2][1] = winCnt3;
						cnt[2][2] = winPnt3;
						per[2][0] = perWin3;

						System.out.println();
						System.out.println("게임 횟수 : " + playCnt3);
						System.out.println("이긴 게임 : " + winCnt3);
						System.out.println("현재 승점 : " + winPnt3);
						System.out.println("현재 승률 : " + perWin3 + "%");
						System.out.println();

						re3: while (true) {
							System.out.println("게임을 다시 시작하시겠습니까?  예(Y), 아니오(N)");
							System.out.println("(전적 초기화 => reset)");
							String reGm = sc.next();

							for (int i = 0; i < rgy.length; i++) {
								if (rgy[i].equalsIgnoreCase(reGm)) {
									System.out.println("새 게임을 시작합니다.");
									continue gm3;
								}
							}
							for (int i = 0; i < rgn.length; i++) {
								if (rgn[i].equalsIgnoreCase(reGm)) {
									System.out.println("게임 선택 화면으로 돌아갑니다.");
									continue gmWorld;
								}
							}
							if (reGm.equalsIgnoreCase("reset")|| reGm.equals("ㄱㄷㄴㄷㅅ")) {
								playCnt3 = 0;
								winCnt3 = 0;
								winPnt3 = 0;
								perWin3 = 0;
								System.out.println("전적을 초기화합니다.");
								continue gm3;							
							}
							System.out.println("잘못 입력하셨습니다.");
							continue re3;
						}
					}
				}
				// 프로그램 종료
			} else if (gameNum == 101) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break gmWorld;

				// 이외 버튼 입력시
			} else {
				System.out.println("준비중입니다.");
				System.out.println("게임 선택화면으로 돌아갑니다.");
				System.out.println("------------------------------------------------");
				continue gmWorld;
			}

		} // gmWorld
	}
}