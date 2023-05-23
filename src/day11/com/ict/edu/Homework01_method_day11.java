package day11.com.ict.edu;

public class Homework01_method_day11 {

	// 단점은 멤버필드에 바로 접근할 수 있다
	// 해결책 : 접근제한자를 private으로 지정(직접 접근을 못한다.)
	// 변경하는 메서드(setter())와 데이터를 return 하는 메서드를 만들어 사용

	private int num = 0;
	private String name = "";
	private int nameNum = 0;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	//private String hak = "";
	private char hak = ' ';
	private int rank = 1;
	
	public Homework01_method_day11() {
	
	}
	public Homework01_method_day11(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 총점, 평균, 학점
	/*
	public void subj(int kor, int eng, int math) {
		for (int i = 0; i < num; i++) {
			sum = kor + eng + math;	
		}
	}
	*/
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNameNum() {
		return nameNum;
	}
	public void setNameNum(int nameNum) {
		this.nameNum = nameNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int sum) {
		avg = (int) (sum * 10 / 3) / 10.0;
	}
	public char getHak() {
		return hak;
	}
	public void setHak(double avg) {		
		if (avg >= 90) {
			hak = 'A';
		} else if (avg >= 80) {
			hak = 'B';
		} else if (avg >= 70) {
			hak = 'C';
		} else {
			hak = 'F';
		}
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
