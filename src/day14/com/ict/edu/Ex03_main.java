package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 먼저 부모클래스는 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
		// 부모클래스가 먼저 만들어지기때문에 부모클래스가 먼저 나오고, 자식클래스가 나오며
		// 주소값은 같다 // 부모와 자식을 묶고 있는 영역의 주소를 나타냄
		System.out.println("메인에서 생성자호출 : "+sub);
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr);
		
		
		// System.out.println(sub.cat);
		// System.out.println(sub.dog);
		// static (접근제한자가 우선 순위가 높다.)
	
	}
}
