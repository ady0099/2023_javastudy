package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// Ex04 기반
		// 이름, 국어, 영어, 수학을 받는 생성자로

		Scanner sc = new Scanner(System.in);
		
		String name="";
		int kor=0, eng=0, math=0, sum=0;
		double avg =0.0;
		
		System.out.println("인원수 입력");
		int num = sc.nextInt();
		Ex09_constructor[] arr = new Ex09_constructor[num];
		
		for(int i = 0; i<num; i++) {
		
		System.out.print("이름 : ");
		name=sc.next();
		System.out.print("국어 : ");
		kor=sc.nextInt();
		System.out.print("영어 : ");
		eng=sc.nextInt();
		System.out.print("수학 : ");
		math=sc.nextInt();
		
		Ex09_constructor score = new Ex09_constructor(name,kor,eng,math);
		
		arr[i] = score;
		
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i = 0; i <num; i++) {	
//			int rank = arr[i].getRank();
			
			for (int j = 0; j<num; j++) {
				if(i==j) continue;
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		// 임시저장
		Ex09_constructor tmp = new Ex09_constructor();
		// 인자가 있는 생성자를 사용해도 상관없다.
		// Ex09_constructor tmp = new Ex09_constructor("ppp",40,40,40);
		
		
		// 오름차순 정렬
		for(int i =0; i<num-1; i++) {
			for(int j = i+1; j<num; j++ ) {
				if(arr[i].getRank() > arr[j].getRank()) { 

					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for(int i =0; i<num; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
		
		}
	}
}
