package day11.com.ict.edu;

import java.util.Scanner;

public class Ex05_AnimalTest {
	// main메서드
	// 나이가 3살, 이름이 큰뿔소, 생존 출력
	// 큰뿔소를 펭귄으로 변경 후 생존 여부 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Ex05_Animal ani = new Ex05_Animal();
		
		ani.setName("큰뿔소");
		ani.setAge(3);
		ani.setLive(true);
		
		String liv = ani.Animals();
		String name = ani.getName();
		int age = ani.getAge();
		
		
		System.out.print("동물 : "+name);
		System.out.print(", 나이 : "+age);
		System.out.print(", 생존여부 : "+liv);
		
		System.out.println();
		System.out.println("=================================");
		
		ani.setName("펭귄");
		ani.setAge(3);;
		ani.setLive(false);
		
		String liv2 = ani.Animals();
		String name2 = ani.getName();
		int age2 = ani.getAge();
		
		System.out.print("동물 : "+name2);
		System.out.print(", 나이 : "+age2);
		System.out.print(", 생존여부 : "+liv2);
		System.out.println();
		
		System.out.println("=================================");
		
		ani.play(false, 14, "엄지척");
		ani.play("까치", 14, true);
		ani.prn();
		
		System.out.println("=================================");
		
		
		
		System.out.println("이름을 입력해주세요. ");
		String sc_name = sc.next();
		
		System.out.println("나이를 입력해주세요. ");
		int sc_age = sc.nextInt();
		
		System.out.println("생존 여부를 숫자로 입력해주세요. 1.생존 2.사망 ");
		int sc_live_int = sc.nextInt();
		boolean sc_live=true;
		
		if(sc_live_int==1) {
			sc_live=true;
		}else if(sc_live_int==2){
			sc_live=false;
		}else {
			
		}
		
		System.out.println("결과를 확인하려면 아무키나 눌러주세요. ");
		sc.next();
		
		String str = ani.Animals2(sc_name, sc_age, sc_live);
		System.out.println(str);
		
		
//		String s = ani.Animals2("코끼리", 4, true);
//		System.out.println(s);
//		
//		String s2 = ani.Animals2("장수거북이", 89, false);
//		System.out.println(s2);
//		
//		s = ani.Animals2("목 짧은 기린", 15, true);
//		System.out.println(s);
//		
//		s = ani.Animals2(name2, age2, true);
//		System.out.println(s);
		
		
	}
}
