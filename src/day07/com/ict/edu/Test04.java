package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// day05-day06 homework 풀이4
		
		//	2.	이름, 국어, 영어, 수학를 입력 받아서 
		//		총점, 평균, 학점을 구하고 
		//		이름, 총점, 평균, 학점을 출력하는 코딩 
		//		(평균은 소숫점 첫째자리까지 구하자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		// 총점, 평균, 학점을 구하기
		int sum = kor+eng+math;
		double avg = (int)(sum/3.0 *10)/10.0;
		
		String hak ="";
		if(avg >=90) {
			hak = "A 학점";
		}else if(avg >=80) {
			hak = "B 학점";
		}else if(avg >=70) {
			hak = "C 학점";
		}else {
			hak = "F 학점";
		}
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+hak);
	}

}
