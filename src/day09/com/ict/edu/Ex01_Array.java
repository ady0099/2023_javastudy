package day09.com.ict.edu;

public class Ex01_Array {

	public static void main(String[] args) {
		// 배열 : 같은 자료형의데이터들을 한 곳에 모아둔 묶음
		// 	     반드시 같은 자료형이어야 한다. (단, 프로모션, 디모션 가능)
		// 		 생성할 때 반드시 크기를 지정해야 한다.
		//		 한번 지정된 크기는 변경되지 않는다.
		//		 배열 데이터를 추출할 떄에는 일반적으로 for문을 사용한다.
		// 배열의 종류 : - 1차원 배열과 다차원 배열
		//			  - 기본자료형배열과 참조자료형 배열(객체배열)
		
		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터 저장)
		// 1. 선언 : 자료형[] 이름; 또는 자료형 이름[];
		int[] su;
		
		// 2. 생성 : 이름 = new 자료형[배열의 크기 = 방의 수];
		//			new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라
		//					=> 인스턴스, 객체 생성
		su = new int[4];
		
		// 3. 데이터 저장 : 이름[index= 방 번호 = 위치 = 0부터]
		//			 	같은 자료형이어야만 저장 가능 (프로모션, 디모션 가능)
		su[0] = 100;
		su[1] = 'a'; //프로모션
		su[2] = (int) 2.4;	// 디모션 => 형변환하면 가능
		su[3] = 124;
		// su[4] = 14; // << 런타임 오류, 컴파일 오류(빨간줄)가 나오지는 않으나, 
		// 배열크기보다 크기 때문에 실행시 오류 발생 : ArrayIndexOutOfBoundsException **중요: 앞으로 자주 볼 것 
		su[0] = 12; 	// 현재 데이터를 삭제하고 12가 저장된다. (변수와 같음)
		
		
		// 배열을 호출하면 주소(생성ID)가 출력
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		
		// 배열의 출력은 일반적으로 for문 사용
		for (int i = 0; i<su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("==============");
		
		// 개선된 for문 : 배열이나 컬렉션에 주로 사용
		//				배열 전체에 대해서 정보출력 및 가공 기능
		// 				그러나 특정 몇 개나 특정 하나를 별도로 출력하거나 가공할 수 없다(단점)

		// : => 오른쪽 배열을 하나씩 순서대로 왼쪽에 넘긴다
		int i= -1;
		for (int k : su) {
			i++;
			if(k>90)
				System.out.println("su["+i+"]="+k*10);
			else
				System.out.println("su["+i+"]="+k);
		}
		// i값을 불러오지 못하기 때문에 이 경우에는 굳이 개선된 for문을 쓸 이유가 없다
		
	}

}
