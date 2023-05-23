package day06.com.ict.edu2;

import java.util.Scanner;

public class Homework01_even_day06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 홀짝 판별하기 3======");
		//	1.	원하는 회수를 입력 받고 
		//		숫자를 입력 받아서 
		//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		String str2 = "";
		
		System.out.println("원하시는 반복 횟수를 입력해주세요.");
		int num=sc.nextInt();

		for(int i=0; i<num; i++) {
			
			System.out.println("홀짝을 확인하실 숫자를 입력해주세요.");
			int su2=sc.nextInt();
			
			for(int j=0; j<2; j++) {
				if(su2%2==0) {
					str2 = "짝수";
				}else {
					str2 = "홀수";
				}
			}
			System.out.println("입력받은 숫자 : "+su2);
			System.out.println(str2+"입니다");
			System.out.println();
		}
	}

}
