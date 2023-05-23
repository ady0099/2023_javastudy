package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고 다음 회차를 하기 위해 증감식으로 이동
		// 보통 if문과 함께 사용한다
		// break는 for문과 while 모두 사용, continue는 for문에만 사용 (while문에 사용 가능)
		// while문의 경우 초보자는 무한루프에 쉽게 빠질 수 있으므로 continue 사용에 주의
		
		int i=0;
		
		// 1-10 출력
		for (i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i="+i);

		// 1-10 출력 6일 때 break 사용
		for (i = 1; i < 11; i++) {
			if(i==6) { break; }
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i="+i);
		
		for (i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i==6) { break; }
		}
		System.out.println();
		System.out.println("i="+i);
		
		
		System.out.println("===== ↑break↑ / ↓continue↓ ===== ");
		
		// 1-10 출력
		for (i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i="+i);

		// 1-10 출력 6일 때 continue 사용
		for (i = 1; i < 11; i++) {
			if(i==6) { continue; }
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i="+i);
		
		for (i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i==6) { continue; }
		}
		System.out.println();
		System.out.println("i="+i);
		
		
		System.out.println("======홀수만 출력======");
		// 0-10 홀수만 출력하자 (일반적인)
		for (i = 0; i < 11; i++) {
			if(i%2!=0) { 
				System.out.print(i+" ");
			}
		}
		System.out.println();

		// 0-10 홀수만 출력하자 (continue)
		for (i = 0; i < 11; i++) {
			if(i%2==0) { continue; } 
				System.out.print(i+" ");
			
		}
		
		
	}
}
