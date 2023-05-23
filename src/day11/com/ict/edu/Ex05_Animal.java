package day11.com.ict.edu;

public class Ex05_Animal {
	// 생존여부를 가리는 속성 live :boolean
	// 나이와 이름 정보를 기억하는 속성 age:int  name:String
	// 이름 정보를 바꾸는 기능 setName()
	// 이름 정보를 반환하는 기능 getName()
	// 생존여부를 반환하는 기능 getLive()
	
	
	private boolean live;
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public boolean getLive() {
		return live;
	}
	
	public String Animals(){
		String liv="";
		if(live) {
			liv="생존";
		}else {
			liv="사망";
		}
		return liv;
}
	
	public String Animals2(String name, int age, boolean live) {
		String liv="";
		if(live) {
			liv="생존";
		}else {
			liv="사망";
		}
		return "종류 : "+name+", 나이 : "+age+"세, 생존여부 : "+liv;
		
				
	}
	
	// 이름 나이, 생존여부 한번에 변경하자
	public void play(String s1, int s2, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	}
	public void play(int s2, String s1, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	}
	public void play(boolean s3, int s2, String s1) {
		name = s1;
		age = s2;
		live = s3;
	}
	
	// 이름 나이, 생존여부 한번에 출력하자
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		if(live) {
			System.out.println("생존여부 : 살았음");
		}else {
			System.out.println("생존여부 : 죽었음");
		}
	}
}


