package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학
		// 이름, 총점, 평균, 학점, 순위
		// 순위 기준으로 오름차순 정렬 출력
		
		Scanner scan = new Scanner(System.in);
		
		// Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// int[] k1 = new int[];
		
		Ex04_get_set[] arr= new Ex04_get_set[5];
		
		// Ex08_method로 만들어진 객체로 저장하는 배열
		for(int i = 0; i<arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set(); 
			// for문 안에 만들어야함
			
			System.out.print("이름 : ");
			person.setName(scan.next());
			
			System.out.print("국어 : ");
			person.setKor(scan.nextInt());
			
			System.out.print("영어 : ");
			person.setEng(scan.nextInt());
			
			System.out.print("수학 : ");
			person.setMath(scan.nextInt());
			
			//person.setSum(person.getKor() + person.getEng() + person.getMath());
			int sum = person.getKor() + person.getEng() + person.getMath();
			person.setSum(sum);
			
			//person.setAvg((int)(person.getSum()/3.0*10)/10.0);
			double avg = (int)(person.getSum()/3.0*10)/10.0;
			person.setAvg(avg);
			
			String hak = person.getHak();
			
			
			if(person.getAvg()>=90) {
				hak="A학점";
			}else if(person.getAvg()>=80) {
				hak="B학점";				
			}else if(person.getAvg()>=70) {
				hak="C학점";
			}else {
				hak="F학점";
			}
			person.setHak(hak);
			
			int rank = person.getRank();
			
			rank = 1;
			person.setRank(rank);
			//person.setRank(1);
			
			arr[i] = person;
			
		}
		
		// 순위
		
		for(int i = 0; i <arr.length; i++) {	
//			int rank = arr[i].getRank();
			
			for (int j = 0; j<arr.length; j++) {
				if(i==j) continue;
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		// 정렬
		
		// 임시저장
		Ex04_get_set tmp = new Ex04_get_set();
		// 오름차순 정렬
		for(int i =0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++ ) {
				if(arr[i].getRank() > arr[j].getRank()) { 
					// 부등호주의!! 1등이 가장 먼저 출력된다 !!
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
			
		}
	}
}
