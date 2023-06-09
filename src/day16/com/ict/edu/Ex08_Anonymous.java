package day16.com.ict.edu;

// 추상 클래스 : 추상메서드를 하나 이상 가지고 있는클래스

abstract class Abc {
	int data = 1000;

	public abstract void printData();
}

class AbcTest extends Abc {
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}

class AbcTest2 {
	// 상속받지 않고 바로 객체 생성
	Abc abc = new Abc() {
		@Override
		public void printData() {
			System.out.println("data2 : "+data);
		}
	};
}

class AbcTest3{
	// 메서드나 메서드 인자에 사용된다.
	public void prn() {
		new Abc() {
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("data3 : "+data);
			}
		}.printData();
	}
}

public class Ex08_Anonymous {
	public static void main(String[] args) {		
		AbcTest t1 = new AbcTest();
		t1.printData();
		// 가장 일반적인 방법 : 상속
		
		AbcTest2 t2 = new AbcTest2();
		System.out.println(t2.abc);
		// 주소값이 나오는데 "$". 즉, 이너 클래스가 보인다.
		t2.abc.printData();
		
		AbcTest3 t3 = new AbcTest3();
		// t3.prn().printData();
		// 이름이 없어서 호출을 못한다 어떻게 실행시킬 것인가??
		// } ; 사이에 .을 붙여 호출 가능
		t3.prn();
	}
}
