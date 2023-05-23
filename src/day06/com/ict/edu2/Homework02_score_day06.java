package day06.com.ict.edu2;

import java.util.Scanner;

public class Homework02_score_day06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 학점 계산하기 ======");
		//	2.	이름, 국어, 영어, 수학를 입력 받아서 
		//		총점, 평균, 학점을 구하고 
		//		이름, 총점, 평균, 학점을 출력하는 코딩 
		//		(평균은 소숫점 첫째자리까지 구하자)
		
		System.out.print("이름을 입력해주세요 : ");
		String name=sc.next();
		System.out.println("이름 : "+name+"\n");
		
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor=sc.nextInt();
		System.out.println("국어 : "+kor+"\n");
		
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng=sc.nextInt();
		System.out.println("영어 : "+eng+"\n");
		
		System.out.print("수학 점수를 입력해주세요 : ");
		int math=sc.nextInt();
		System.out.println("수학 : "+math+"\n");
		
		System.out.println("==================");
		System.out.println("이름 : "+name);
		int sum=kor+eng+math;
		System.out.println("총점 : "+sum);
		double avg=(int)(sum*10/3)/10.0;
		System.out.println("평균 : "+avg);
		String score = "";
		
		if(avg>=90) {
			score="A학점";
		}else if(avg>=80) {
			score="B학점";
		}else if(avg>=70) {
			score="C학점";
		}else {
			score="F학점";
		}
		System.out.println("학점 : "+score);
		System.out.println();

	}

}
