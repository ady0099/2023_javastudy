package day12.com.ict.edu;

public class Ex09_constructor {
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	private int rank = 0;
	
	// 임시때문에 기본 생성자가 추가로 있어야함
	// 그냥 더미 값을 넣어도 되긴 함
	public Ex09_constructor() {
		
	}
	public Ex09_constructor(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = 1;
		// cal();
		process();
	}

	// 총점, 평균, 학점을 한번에 처리하는 메서드
	public void process() {
		sum = kor + eng + math;
		avg = (int) (sum / 3 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg > 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}

	}

	public void cal() {
		sum = kor + eng + math;
		avg = (int) (sum / 3 * 10) / 10.0;

		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg > 70) {
			hak = "C";
		} else {
			hak = "F";
		}
	}

	public void prn() {
		System.out.print("이름 : " + name + "\t");
		System.out.print("총점 : " + sum + "\t");
		System.out.print("평균 : " + avg + "\t");
		System.out.println("학점 : " + hak);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
