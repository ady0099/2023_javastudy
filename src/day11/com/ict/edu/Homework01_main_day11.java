package day11.com.ict.edu;

import java.util.Scanner;

public class Homework01_main_day11 {
	public static void main(String[] args) {
		// 총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고
		// 이름, 국어, 영어, 수학를 받아서
		// 총점, 평균, 학점, 순위를 구하고
		// 순위 기준으로 오름차순으로 정렬하여
		// 출력하는 main 메서드를 가지는 클래스를 만들어라
		// 단, 처리는 2차원배열을 이용해라

		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		Homework01_method_day11 ho = new Homework01_method_day11();
		int num = sc.nextInt();

		String hname = "";
		int hkor = 0;
		int heng = 0;
		int hmath = 0;
		int nameNum = 0;

		String[][] str = new String[num][1];
		double[][] arr = new double[num][8];
		
		for (int i = 0; i < num; i++) {
			double[] s = new double[8];
			
			System.out.print("이름 : ");
			hname = sc.next();
			nameNum++;
			System.out.print("국어 : ");
			hkor = sc.nextInt();
			System.out.print("영어 : ");
			heng = sc.nextInt();
			System.out.print("수학 : ");
			hmath = sc.nextInt();

			ho = new Homework01_method_day11(hname, hkor, heng, hmath);
			ho.setNameNum(nameNum);
			ho.setKor(hkor);
			ho.setEng(heng);
			ho.setMath(hmath);
			ho.setSum(hkor,heng,hmath);
			ho.setAvg(ho.getSum());
			ho.setHak(ho.getAvg());
			
			arr[i] = s;
			
			str[i][0] = ho.getName();
			s[0] = ho.getNameNum();
			s[1] = ho.getKor();
			s[2] = ho.getEng();
			s[3] = ho.getMath();
			s[4] = ho.getSum();
			s[5] = ho.getAvg();
			s[6] = ho.getHak();
			s[7] = ho.getRank();
		}
		System.out.println();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) continue;
				if (arr[i][5] < arr[j][5]) {
					arr[i][7]++;
				}
			}
		}
		// 임시저장
		double[] tmp = new double[8];

		// 오름차순 정렬
		for (int i = 0; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		
		for (int i = 0; i < num; i++) {		
			
			System.out.print(str[i][0] + "\t");
			System.out.print(arr[i][4] + "\t");
			System.out.print(arr[i][5] + "\t");
			System.out.print((char)(arr[i][6]) + "\t");
			System.out.println((int)(arr[i][7]));

		}

	}
}
