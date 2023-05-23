package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method t1 = new Ex03_method();
		
		/*
		t1.getSum();
		t1.getAvg();
		t1.getHak();
		
		System.out.println(t1.getSum());
		System.out.println(t1.getAvg());
		System.out.println(t1.getHak());
		
		값은 나오나.. return으로 받아온 값을 저장해서 쓸 것
		*/
	
		int k1 = t1.getSum();
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1); 
		System.out.println(k2); 
		System.out.println(k3); 
		
		
	}
}
