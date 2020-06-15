package test.main;

import java.util.Scanner;
/*
 * RuntimeException을 상속 받은 Exception 종류는
 * try~catch 블럭으로 묶어주지 않아도 문법 오류가 발생하지 않는다.
 * 따라서 필요시 선택적으로 try~catch 블럭을 묶어주면 된다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.print("나눌수 입력:");
			String inputNum1=scan.nextLine();
			System.out.print("나누어 지는 수 입력:");
			String inputNum2=scan.nextLine();
			try {
				int num1=Integer.parseInt(inputNum1);
				int num2=Integer.parseInt(inputNum2);
				int result=num2/num1;
				int result2=num2%num1;
				System.out.println(num2+"를"+num1+"로 나누면 몫은"+result+ " 나머지는"+result2);
			}catch(NumberFormatException nfe) {
				System.out.println("숫자입력해주세요");
				
			}catch(ArithmeticException ae) {
				System.out.println("1이상의 정수를 입력해 주세요");
			}catch(Exception e) {
				System.out.println("예외발생");
			}finally {
				// 실행순서에서 어떤상황이든 반드시 실행해야할 것을 적어놓음
				System.out.println("수정 해주세요");
			}
			System.out.println("메소드 종료");
		}
		}
		
}
//NumberFormatException