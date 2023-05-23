// 완성안했음

package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		Scanner sc = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		for(String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		Iterator<String> it = map.keySet().iterator();

		search: while (it.hasNext()) {
			try {
				System.out.println("국가명을 입력하시면 수도를 확인할 수 있습니다.");
				System.out.print("입력 : ");
				String input = sc.next();
				
				String c = (String) it.next();
				System.out.println();
				
				if (input.equalsIgnoreCase(c)) {
					System.out.println(c+"의 수도는 "+map.get(c)+"입니다");
					
				}else{
					System.out.println("데이터에 없는 나라입니다.");
					
				}

			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				sc.next();
				continue search;
			}

			re: while (true) {
				System.out.println("계속할까요?(y/n)");

				try {
					String exit = sc.next();
					if (exit.equalsIgnoreCase("y")) {
						continue search;
					} else if (exit.equalsIgnoreCase("n")) {
						sc.close();
						break search;
					} else {
						System.out.println("제대로 입력해주세요.");
						continue re;
					}
				} catch (Exception e) {
					System.out.println("잘못된 접근입니다.");
					continue re;
				}

			}

		}

	}

}
