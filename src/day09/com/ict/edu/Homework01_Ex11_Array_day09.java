package day09.com.ict.edu;

public class Homework01_Ex11_Array_day09 {

	public static void main(String[] args) {
		// 숙제
		// double[][] arr = new double[5][5];
		double[][] stu = new double[5][5];
		double[] tmp;
		
			//	 번호, 총점, 평균, 학점, 순위
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 285, 95, 'A', 1};
		
		// 순위를 구하자
		
		// 순위 오름차순 정렬
		
		// 출력 
		//	4, 300, 100, 'A', 1
		//	5, 285, 95, 'A', 2
		//	1, 270, 90, 'A', 3
		//	2, 210, 70, 'C', 4
		//	3, 180, 60, 'F', 5
		
		// +++++ 숙제2 => 값 받는 기능 추가

		
		int i=0;
		stu[0][i]=p1[i];
		stu[1][i]=p2[i];
		stu[2][i]=p3[i];
		stu[3][i]=p4[i];
		stu[4][i]=p5[i];

		
		for(i=0; i<stu.length; i++) {	
			
			for(int j=0; j<stu[i].length; j++) {
				if(i==0) {
					stu[i][j]=p1[j];			
				}else if(i==1) {
					stu[i][j]=p2[j];
				}else if(i==2) {
					stu[i][j]=p3[j];
				}else if(i==3) {
					stu[i][j]=p4[j];
				}else if(i==4) {
					stu[i][j]=p5[j];
				}
				
				//System.out.print(stu[i][j]+" ");				
			}
		}
		for(i=0; i<stu.length; i++) { 
			for (int j=0; j < stu[i].length; j++) {
				// 자기 자신 제외
				if(i==j) continue;
				// 총점을 비교하여 순위++
				if(stu[i][1] < stu[j][1]) {
					stu[i][4]++;
				}
			}	
		}

		// 순위 계산
		for(i =0; i<stu.length; i++) {
			for(int j=0; j<stu[i].length; j++) {
			}
			//System.out.print((i+1)+"번 학생 "+stu[i][4]+" / ");
		}
		
		// 오름차순
		for(i =0; i<stu.length-1; i++) {
			for(int j=i+1; j<stu.length; j++) {
				if(stu[i][4] > stu[j][4]) {
					tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}
		
		System.out.println("학번\t"+"총점\t"+"평균\t"+"학점\t"+"순위");
		for(i=0; i<stu.length; i++) {
			for(int j=0; j<stu[i].length; j++) {
				
				if(j==0 || j==4) {
					System.out.print(" "+(int)(stu[i][j])+"\t");
				}else if(j==2) {
					System.out.print(stu[i][j]+"\t");
				}else if(j==3){
					System.out.print(" "+(char)(stu[i][j])+"\t");
				}else{	
					System.out.print((int)(stu[i][j])+"\t");
				}
			}
			System.out.println();
		}
		
	
	}

}
