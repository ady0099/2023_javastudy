package day11.com.ict.edu;

public class Ex06_method {
	
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSum() {
		return sum;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
	
	public void setHak(String hak) {
		this.hak=hak;
	}
	public String getHak() {
		return hak;
	}
	public void setRank(int rank) {
		this.rank=rank;
	}
	public int getRank() {
		return rank;
	}
	
	// 총점을 구하는 메서드
	public void sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	// 평균을 구하는 메서드
	public void avg(int sum){
		avg = (int)(sum*10/3)/10.0; 
	}
	// 학점을 구하는 메서드
	public void hak(double avg) {
		if(avg >=90) {
			hak="A학점";
		}else if(avg>=80) {
			hak="B학점";
		}else if(avg>=70) {
			hak="C학점";
		}else {
			hak="F학점";
		}
	}
	/*
	public void rank(int rank) {
		rank++;
	}
	public void total(String name, int sum, double avg, String hak, int rank) {
		
	}
	*/
	public void errMsg(){
		System.out.println("잘못 입력하셨습니다.");
	}
	public void endMsg() {
		System.out.println("프로그램을 종료합니다.");
	}
	public void total() {
		System.out.println("\n>>>>>>>>>> 최종 결과 >>>>>>>>>>");
		System.out.println("이름\t총점\t평균\t학점\t");
	}
	/*
	public void print() {
		
	}
	*/
}
