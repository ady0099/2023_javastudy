package day16.com.ict.edu;

// import com.ict.edu.Ex05_MemberInnerClass.Inner01;

public class Ex05_Main {
	public static void main(String[] args) {
		// 내부클래스를 별도로 객체 생성할 수 없다. (static은 제외)
		// Inner01 test = new Inner01();
		
		// 외부 클래스를 통해서 내부클래스 객체를 생성한다.(Member내부 클래스)
		// -> import가 필요없어졌다
		Ex05_MemberInnerClass test = new Ex05_MemberInnerClass();
		
		Ex05_MemberInnerClass.Inner01 exam= test.new Inner01();
		// this 주소에 $가 있으면 내부클래스가 있다는 것을 의미한다.
		
		exam.prn();
		System.out.println();
		test.play();
	}
}
