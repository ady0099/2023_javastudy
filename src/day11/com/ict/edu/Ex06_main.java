package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력하자
		Scanner sc = new Scanner(System.in);
		String[] name;
		int[] kor;
		int[] eng;
		int[] math;
		int[] sum;
		double[] avg;
		String[] hak;
		boolean bflag = true;
		
		Ex06_method score = new Ex06_method();
			
		exit:
		while(true) {
			if(bflag) {
				System.out.println("인원수를 입력해주세요.(최대 5명)");
				int num = sc.nextInt();
				int cnt=-1;
				Ex06_method[] arr = new Ex06_method[num];
				
				name = new String[num];
				kor = new int[num];
				eng = new int[num];
				math = new int[num];
				sum = new int[num];
				avg = new double[num];
				hak = new String[num];
				
				if(num<0 || num>5) {
					score.errMsg();
					continue exit;
				}
				
				for(int i=0; i<num; i++) {
					System.out.print("이름 : ");	
					name[i] = sc.next();

					System.out.print("국어 : ");
					kor[i] = sc.nextInt();
					
					System.out.print("영어 : ");
					eng[i] = sc.nextInt();
				
					System.out.print("수학 : ");
					math[i] = sc.nextInt();
					
					score.setName(name[i]);
					score.sum(kor[i],eng[i],math[i]);
					score.avg(score.getSum());
					score.hak(score.getAvg());
					
					sum = new int[num];
					avg = new double[num];
					hak = new String[num];
	
					sum[i]=score.getSum();
					avg[i] = score.getAvg();
					hak[i] = score.getHak();
					
					System.out.println("이름\t총점\t평균\t학점\t");
					System.out.print(score.getName()+"\t");
					System.out.print(score.getSum()+"\t");
					System.out.print(score.getAvg()+"\t");
					System.out.println(score.getHak()+"\t");	
					
					bflag = false;
					System.out.println("============================");
				}
				score.total();
				for(int i =0; i<num; i++) {

					score.setName(name[i]);
					score.sum(kor[i],eng[i],math[i]);
					score.avg(score.getSum());
					score.hak(score.getAvg());
					
					sum[i] = score.getSum();
					avg[i] = score.getAvg();
					hak[i] = score.getHak();

					System.out.print(name[i]+"\t");
					System.out.print(sum[i]+"\t");
					System.out.print(avg[i]+"\t");
					System.out.println(hak[i]+"\t");
				}
				System.out.println("============================");
			}

			
		
			if(!bflag) {
				System.out.println("계속 하시겠습니까?");
				System.out.println("처음부터 다시 하려면 1, 프로그램을 종료하려면 2를 입력해주세요.");
				
				int clo = sc.nextInt();
				
				if(clo==1) {
					bflag = true;
					continue exit;
					
				}else if(clo==2) {	
					score.endMsg();
					sc.close();
					break exit;
					
				}else {
					score.errMsg();
				}
					
			}
		}
	}
}
