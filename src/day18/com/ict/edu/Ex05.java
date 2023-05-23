package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		// 로또 : 1~45, 랜덤, 중복안됨, 6자리
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i =0; i<6; i++) {
			int su = (int)(Math.random()*45)+1;
			// 안들어가지면
			if(! (lotto.add(su))) 
				i--; 			// 중복이면 set의 값을 못 입력하고 i값이 증가하므로 i에 1을 빼서 같은 자리를 다시 노린다 

			System.out.print((i+1)+"=>"+su+"\t");
			if(i==5) {
				System.out.println();
			}
			
		}

		System.out.println(lotto);
		
	}
}
