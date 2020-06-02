package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적: 키보드로 부터 문자열을 입력 받고 싶다.
		 * 입력 받아서 할 것 : 콘솔창에 출력
		 */
		//system.out 콘솔과 연결된 객체
		//system.in 키보드 입력과 연결된 객체		
		Scanner s1=new Scanner(System.in);
		//키보드로 입력 받기 위해서는 콘솔창을 열리게 해야한다.
		System.out.println("문자열을 입력하세요:");
		//Scanner 객체의 메소드를 이용해서 문자열(String) 입력 받기
		String s2=s1.nextLine();
		//
		//s2의 길이 충력
		System.out.println(s2.length());
		
		System.out.println("메인 메소드가 종료 됩니다.");
		//정리 스캐너란 객체를 생성하고 인자로 Sysrem.in 객체를넣어주면
		//prompt 창 처럼 입력창이 콘솔에 나오고 입력한 문자열을 반환한 후에 다음 명령을 수행한다.
	}
}
