package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학
		// 이름, 총점, 평균, 학점, 순위
		// 순위 기준으로 오름차순 정렬 출력
		
		Scanner scan = new Scanner(System.in);
		
		// Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// int[] k1 = new int[];
		
		Ex08_method[] arr= new Ex08_method[5];
		
		// Ex08_method로 만들어진 객체로 저장하는 배열
		for(int i = 0; i<arr.length; i++) {
			Ex08_method person = new Ex08_method(); 
			// for문 안에 만들어야함
			
			System.out.print("이름 : ");
			person.name = scan.next();
			
			System.out.print("국어 : ");
			person.kor = scan.nextInt();
			
			System.out.print("영어 : ");
			person.eng = scan.nextInt();
			
			System.out.print("수학 : ");
			person.math = scan.nextInt();
			
			person.sum = person.kor+person.eng+person.math;
			person.avg = (int)(person.sum/3.0*10)/10.0;
			
			if(person.avg>=90) {
				person.hak="A학점";
			}else if(person.avg>=80) {
				person.hak="B학점";				
			}else if(person.avg>=70) {
				person.hak="C학점";
			}else {
				person.hak="F학점";
			}
			
			person.rank = 1;
			
			arr[i] = person;
			
		}
		
		// 순위
		for(int i = 0; i <arr.length; i++) {
			for (int j = 0; j<arr.length; j++) {
				if(i==j) continue;
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		// 정렬
		
		// 임시저장
		Ex08_method tmp = new Ex08_method();
		// 오름차순 정렬
		for(int i =0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++ ) {
				if(arr[i].rank > arr[j].rank) { 
					// 부등호주의!! 1등이 가장 먼저 출력된다 !!
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.println(arr[i].rank);
			
		}
		
		
		
		//	총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
		//	이름, 국어, 영어, 수학를 받아서 
		//	총점, 평균, 학점, 순위를 구하고 
		//	순위 기준으로 오름차순으로 정렬하여 
		//	출력하는 main 메서드를 가지는 클래스를 만들어라 
		//	단, 처리는 2차원배열을 이용해라
	}
}
