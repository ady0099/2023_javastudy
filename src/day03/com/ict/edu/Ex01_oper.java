package day03.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		//	산술연산자 : + - * / %(나머지)
		int su1 = 9;
		int su2 = 4;
		int result = 0;
		
		result = su1 + su2;
		System.out.println("결과 : " + result);
		
		result = su1 - su2;
		System.out.println("결과 : " + result);
		
		result = su1 / su2;
		System.out.println("결과 : " + result);

		double res = su1 / su2;
		System.out.println("결과 : " + res);
		
		res = (double)su1 / su2;
		System.out.println("결과 : " + res);
		
		res = su1 *1.0 / su2 ;   // su1 / (su2 * 0.1) 묶는 방법도 있다/ 과정은 다양함
		System.out.println("결과 : " + res);
		
		result = su1 % su2;
		System.out.println("결과 : " + result);

	}

}
