package day06.com.ict.edu;

public class Ex04_break_continue2 {
	public static void main(String[] args) {
		for (int i=1; i<4; i++) {
			for (int j=1; j<6; j++) {
				System.out.print("i="+i+", j="+j+"\t");
				
				if(j!=5) { continue; }
				System.out.println();
			}
		}
		System.out.println("========================================================================");

	
	
		for (int i=1; i<4; i++) {
			for (int j=1; j<6; j++) {
				
				if(i==2) { break; }
				System.out.print("i="+i+", j="+j+"\t");
				
				if(j!=5) { continue; }
				System.out.println();
			}
		}
		System.out.println("========================================================================");
		
		
		
		for (int i=1; i<4; i++) {
			for (int j=1; j<6; j++) {
				if(j==2) { 
					System.out.println();
					break; 
				}
				System.out.print("i="+i+", j="+j+"\t");
				
				if(j!=5) { continue; }
				System.out.println();
			}
		}
		System.out.println("============================== continue1 ===============================");
		
		for (int i=1; i<4; i++) {
			for (int j=1; j<6; j++) {
				if(i==2) { continue; }				
				System.out.print("i="+i+", j="+j+"\t");
			}
			System.out.println();
		}
		System.out.println("============================== continue2 ===============================");
	
		for (int i=1; i<4; i++) {
			for (int j=1; j<6; j++) {
				if(j==2) { continue; }				
				System.out.print("i="+i+", j="+j+"\t");
			}
			System.out.println();
		}
		System.out.println("========================================================================");
		
	}
}
