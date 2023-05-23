package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력 (모니터)
		// System.in => 표준 입력장치 (키보드)
		
		// 회사에서 제공하는 클래스를 사용하기 위해서는 import를 해야한다
		// import를 하는 이유 => 패키지가 다르기 때문
		// String이나 print등은 import를 하지 않아도 제약 없이 사용 가능
		// java.lang 패키지 외의 존재하는 클래스는 무조건 import를 해야된다.
		
		// import 방법)	1. 클래스이름 뒤에서 ctrl + space
		//				2. ctrl + shift + o
		
		// 해당 클래스 커서를 뒤에 넣고 shift + f2 => 해당 클래스 API 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		// .next() : 입력한 내용을 String으로 처리하는 메서드
		// **주의 띄어쓰기나 엔터를 사용하면 저장이 끝남
		String name = scan.next();
		System.out.println("받은 내용 : " +name);
		
		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("받은 내용 : "+(age+1));

		System.out.print("나이 : ");
		// .nextInt() : 입력한 내용을 int로 처리하는 메서드 (문자를 입력하면 오류)
		int age2 = scan.nextInt();
		System.out.println("받은 내용 : "+(age2+1));
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double로 처리하는 메서드 (문자를 입력하면 오류)
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : "+ ke);
		
		System.out.println("당신은 남성입니까?(true/false)");
		// .nextBoolean() : 입력한 내용을 boolean으로 처리하는 메서드 (숫자 및 다른 문자 입력하면 오류)
		boolean gender = scan.nextBoolean();
		
		System.out.println("받은 내용 : "+gender);
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}else {
			System.out.println("당신은 여성입니다.");
		}
		
		// nextChar()는 존재하지 않는다. 그러므로 char는 사용 못함
		
		
		
		
		// 숙제
		// next메서드와 nextline의 차이를 알아오기
		
		
		
		
		
		
		
	}
}
