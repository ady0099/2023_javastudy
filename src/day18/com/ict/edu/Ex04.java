package day18.com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 => toArray();
		// 배열을 컬렉션으로 => Arrays.asList();
		
		String[] str = {"java","Java","JAVA","자바","1","44","22","2","4","3"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
				
		for (String k : str) {
			set1.add(k);
		}
		System.out.println("set1 = " +set1); // 미세한 규칙이 보이는 것 같기도 하지만 기본적으로 자기 마음대로 넣는다
		System.out.println();
		
		// set1의 모든 요소를 set2에 넣어주세요 (addAll());
		set2.addAll(set2);
		System.out.println("set2 = " +set2);
		System.out.println();
		
		// 삭제 : clear(), remove(Object o)
		// 비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));
		System.out.println(set2.remove("jaVA"));
		System.out.println();
		
		// 중복불가
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		System.out.println(set2.add("JAVA")); // 위에서 객체가 이미 만들어졌기때문에 같은 객체가 다시 안만들어짐 false값이 나온다
		System.out.println(set2);
		
	}
}
