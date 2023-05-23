package day12.com.ict.edu;

public class Hw0511_con {
	private String name = "물";
	private int price = 500;
	
	public Hw0511_con() {
		
	}
	
	public Hw0511_con(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void inputErrMsg(){
		System.out.println("금액을 확인해주세요.");
		System.out.println("최소 투입단위는 100입니다.");
	}
	public void rtnMsg() {
		//
	}
	public void endMsg() {
		//
	}
	
}
