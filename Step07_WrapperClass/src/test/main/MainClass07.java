package test.main;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 1.Scanner 객체를 이용해서 문자열을 5번 입력 받고
		 * 2.입력 받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 * 3.모두다 입력 받은 후 for문을 이용해서 배열에 저장된 모든
		 * 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해 보세요
		 * 
		 * 1.Ramdom 객체를 이용해서 로또 번호 6개 랜덤하게 얻어내서 배열에 저장한다
		 * 모두다 저장이 되면 for 문으로 배열 저장된 모든 번호를 콘솔창에 순서대로 출력 하
		 */
		String [] a=new String[5];
		Scanner s1=new Scanner(System.in);
		System.out.println("입력");
		for(int i=0; i<a.length; i++) {
			a[i]=s1.nextLine();
		}
		for(int i=0; i<5; i++ ) {
			System.out.println(a[i]);
		}
		
	}
	
}
