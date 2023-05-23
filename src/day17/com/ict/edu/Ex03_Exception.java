package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//주의사항 : Exception을 사용할 경우 반드시 가상 아래 catch문에 사용
//형식 : try{
//			예외 발생 가능한 문장들;
//			예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//		}catch(발생한 예외 객체 e){
//			예외 발생 시 처리하는 문장;
//		}finally{
//			반드시 실행할 문장;
//		}

public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int su1 = 50;
			System.out.println("정수 입력 : ");
			int su2 = sc.nextInt();
			System.out.println("정답 : " + (su1 / su2));

		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
			return;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		} finally {
			System.out.println("반드시 수행되는 문장");
			sc.close();
		}
		System.out.println("수고하셨습니다.");

	}
}