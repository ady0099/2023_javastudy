package day13.com.ict.edu;

public class Ex01_Constructor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		  지역 변수와 전역변수 이름이 같을 때 전역 변수 앞에 this

	private String name = "홍길동";
	private int age = 34;
	
	public Ex01_Constructor() {
		// 생성자가 다른 생성자 호출(반드시  첫번째 줄에서)
		this("임꺽정");
		System.out.println("기본 생성자 : " +this);
		//prn();
		//this.prn();
	}
	public Ex01_Constructor(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void prn() {
		
	}
	
}

