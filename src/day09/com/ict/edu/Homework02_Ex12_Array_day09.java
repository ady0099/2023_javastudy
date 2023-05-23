package day09.com.ict.edu;

import java.util.Scanner;

public class Homework02_Ex12_Array_day09 {

	public static void main(String[] args) {
		// 숙제2: 팀 과제
		// 학생 수 받기
		// 번호, 국영수 점수 받아 총점, 평균, 학점, 순위(초기값 지정)
		// 순위
		// 순위로 오름차순 정렬
		// 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력할 학생 수를 입력해주세요 : ");
		int stuNum = sc.nextInt();

		String[] sbj = { "국어", "영어", "수학" };
		double[][] score = new double[stuNum][8];
		double[] tmp = new double[8];

		for (int i = 0; i < score.length; i++) {

			System.out.print("학번을 입력해주세요 : ");
			score[i][0] = sc.nextInt();

			for (int j = 1; j <= sbj.length; j++) {
				System.out.print(sbj[j - 1] + " 점수를 입력해주세요 : ");
				switch (j) {
				case 1:
					score[i][j] = sc.nextInt();
					break;
				case 2:
					score[i][j] = sc.nextInt();
					break;
				case 3:
					score[i][j] = sc.nextInt();
					break;
				default:
					break;
				}
			}

			score[i][4] = score[i][1] + score[i][2] + score[i][3];
			score[i][5] = (int) (score[i][4] * 10.0 / 3) / 10.0;

			if (score[i][5] >= 90) {
				score[i][6] = 'A';
			} else if (score[i][5] >= 80) {
				score[i][6] = 'B';
			} else if (score[i][5] >= 70) {
				score[i][6] = 'C';
			} else {
				score[i][6] = 'F';
			}

			System.out.println("====================================");
		}

		// 순위 계산
		for (int i = 0; i < score.length; i++) {
			score[i][7] = 1;

			for (int j = 0; j < score.length; j++) {

				if (i == j)
					continue;
				if (score[i][4] < score[j][4]) {
					score[i][7]++;
				}
			}
		}

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i][7] < score[j][7]) {
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("학번\t총점\t평균\t학점\t순위\t");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// 국어, 영어, 수학은 출력에서 제외
				if (j == 1 || j == 2 || j == 3)
					continue;
				if (j == 5) {
					System.out.print(score[i][j] + "\t");
				} else if (j == 6) {
					System.out.print((char) (score[i][j]) + "\t");
				} else {
					System.out.print((int) (score[i][j]) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
