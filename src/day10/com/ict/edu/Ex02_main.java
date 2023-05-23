package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);

//		System.out.println(Ex02_class.name);
//		System.out.println(Ex02_class.GENDER);
		
		// instance는 객체 생성 후 접근
		// 객체 생성)
		// 클래스 이름 참조변수 = new 생성자([인자]);
		// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
		// ** 기본 생성자란 인자가 없는 생성자, 클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class();
		// 접근법; 참조변수.멤버필드
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);
		System.out.println(test.sum);
		System.out.println("===============");
		// 필요한 것만 static 만들기 -> 다이렉트로 값을 찾는 게 아니어서 느려짐, 마치 배열처럼
		// 배열과의 차이점 : 배열은 index값으로 찾는다는 것
		// instance 그림을 그릴 줄 알아야함
		
		// System.out.println(test);
		// 주소값을 갖고 있음
		
		// 변수와 상수의 차이
		test.name = "일지매";
		// test.GENDER = "여성";
		
		Ex02_class.sum = 1000;
		// Ex02_class.AVG = 12345;
		// 오류메세지 : final을 지워라 => final은 상수라 값 변경이 안됨
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
		
	}
}
