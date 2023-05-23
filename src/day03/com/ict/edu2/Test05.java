package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781;
		
		// 결과
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		int num1, num2, num3, num4;
		
		num1 = su/1000;
		su = su - num1*1000;
		
		num2 = su/100;
		su = su - num2*100;
		
		num3 = su/10;
		su = su - num3*10;
		
		num4 = su;
		
		System.out.println("천의 자리 : " + num1 + "\n백의 자리 : " + num2 + "\n십의 자리 : " + num3 + "\n일의 자리 : " + num4);
		
		System.out.println("===============for문 써보기===============");
		su = 3781;	
		int num;
		
		for(int i=0; i<4; i++) {
			num= su/(int)(Math.pow(10, -i)*1000);
			su =su%(int)(Math.pow(10, -i)*1000);
			//su= su - num*(int)(Math.pow(10, -i)*1000); 
			
			String str;
			
			if(i==0) {
				str = "천";
				System.out.println(str+"의 자리 : " + num);
				
			}
			else if(i==1) {
				str = "백";
				System.out.println(str+"의 자리 : " + num);
				
			}
			else if(i==2) {
				str = "십";
				System.out.println(str+"의 자리 : " + num);
				
			}
			else{
				str = "일";
				System.out.println(str+"의 자리 : " + num);
				
			}
		
			
		}
		System.out.println("===============풀이===============");
		su = 7368;
		
		int c = 0;
		int b = 0;
		int s = 0;
		int i = 0;
		int res = 0;
		
		c = su / 1000;			// 3
		res = su % 1000;		// 781
		
		b = res / 100;			// 7
		res = res % 100;		// 81
		
		s = res / 10;			// 8
		i = res % 10;			// 1
		
		// 결과
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		System.out.println("천의 자리 : " + c);
		System.out.println("백의 자리 : " + b);
		System.out.println("십의 자리 : " + s);
		System.out.println("일의 자리 : " + i);
		
		
	}
	
}
