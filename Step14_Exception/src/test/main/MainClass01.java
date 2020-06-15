package test.main;

import java.util.Scanner;

import org.omg.CORBA.ExceptionList;

public class MainClass01 {
	// 예외가 발생했을 때 실행의 흐름을 유지시키기 위해 예외처리를 한다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("숫자입력");
			// 숫자형식의 문자열을 입력 받는다
			String inputNum = scan.nextLine();
			System.out.println(inputNum);
			// 입력한 숫자를 실제 숫자로 바꾼다.
			try {
				double num = Double.parseDouble(inputNum);
				double result = num + 100;
				System.out.println("입력한 숫자 +100:" + result);
			} catch (NumberFormatException nfe) {
				// 여러가지 타입의 예외가 발생할 수 있기떄문에 catch를 여러개 수행이가능하다
				System.out.println("숫자로 입력 해주세요");
				System.out.println("");
				// 오류 정보 출력해주는 베소드
				nfe.printStackTrace();
			} catch (NullPointerException nfe) {
				// 여러가지 타입의 예외가 발생할 수 있기떄문에 catch를 여러개 수행이가능하다
				System.out.println("뭐라도 입력 해주세요");
				System.out.println("");
				// 오류 정보 출력해주는 베소드
				nfe.printStackTrace();
			}
			// 입력한 숫자에 100을 더한다.

		}
	}
}
