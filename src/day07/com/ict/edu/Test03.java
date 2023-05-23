package day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// day05-day06 homework 풀이3
		
		Scanner sc = new Scanner(System.in);
		
		// 원하는 횟수를 입력 받고
		// 숫자를 입력받아서 입력받은 숫자가 홀수인지, 짝수인지 판별하자
		
		System.out.print("원하는 횟수 : ");
		int su = sc.nextInt();
		String res = "";
		
		for (int i=0; i<su; i++) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(num%2==0) {
				res="짝수";
			}else {
				res="홀수";
			}
			System.out.println("당신이 입력한 "+num+"은 "+res+"입니다.");
		}
	}
}
