package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력할 학생 수를 입력해주세요.(최대 5명)");
		int stuNum = sc.nextInt();
		
		
		if(stuNum<=5) {
			String[] student = new String[stuNum];

			String[] name = new String[stuNum];
			int[] kor = new int[stuNum];
			int[] eng = new int[stuNum];
			int[] math = new int[stuNum];
			int[] sum = new int[stuNum];
			double[] avg = new double[stuNum];
			String[] hak = new String[stuNum];
			int[] rank = new int[stuNum];
			
			int[][] score = new int[stuNum][5];
			

			for(int i=0; i<stuNum; i++) {
				System.out.println((i+1)+"번 학생 이름을 입력해주세요.");
				name[i] = sc.next();
				
				System.out.println("국어 점수를 입력해주세요.");
				kor[i] = sc.nextInt();
				System.out.println("국어 : "+kor[i]+"점");
				
				System.out.println("영어 점수를 입력해주세요.");
				eng[i] = sc.nextInt();
				System.out.println("국어 : "+kor[i]+"점, 영어 : "+eng[i]+"점");
				
				System.out.println("수학 점수를 입력해주세요.");
				math[i] = sc.nextInt();
				System.out.println("국어 : "+kor[i]+"점, 영어 : "+eng[i]+"점, 수학 : "+math[i]+"점\t");
				
				sum[i] = kor[i]+eng[i]+math[i];
				avg[i] = (int)(sum[i]/3.0*10)/10.0;
				
				
				
				if(avg[i]>=90) {
					hak[i]="A학점";
				}else if(avg[i]>=80) {
					hak[i]="B학점";
				}else if(avg[i]>=70) {
					hak[i]="C학점";
				}else {
					hak[i]="F학점";
				}
				
				
			}
			for(int i=0; i<sum.length; i++) {
			rank[i]=1;
				for(int j=0; j<sum.length; j++) {
					if(i == j) continue;
					if(sum[i] < sum[j]) {
						rank[i]++;
					}
				}
				System.out.print("이름: "+name[i]+", 총점: "+sum[i]+"점, 평균: "+avg[i]+"점, 학점: "+hak[i]+", "+rank[i]+"위");
				System.out.println();
				//sc.close();
			}	
			
			
		//	System.out.println(name+" "+kor+"점 "+eng+"점 "+math+"점");
			
				
		}else {
			System.out.println("=");
		}

	

		
		
		
		// 풀이
		
		System.out.println("학생 수: ");
		int su = sc.nextInt();
		
		// 미리 배열을 만든다.
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		for(int i=0; i<su; i++) {
			System.out.println("이름 : ");
			name[i] = sc.next();
			
			System.out.println("국어 : " );
			kor[i] = sc.nextInt();
			
			System.out.println("영어 : " );
			eng[i] = sc.nextInt();
			
			System.out.println("수학 : " );
			math[i] = sc.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			
			if(avg[i]>=90) {
				hak[i]="A학점";
			}else if(avg[i]>=80) {
				hak[i]="B학점";
			}else if(avg[i]>=70) {
				hak[i]="C학점";
			}else {
				hak[i]="F학점";
			}
			rank[i] = 1;
		}
		// 순위
		for (int i=0; i< sum.length; i++) {
			for(int j=0; j<sum.length; j++) {
				if(i==j)continue;
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for(int i =0; i<su; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"\t");
			System.out.println();
		}
	}
}
