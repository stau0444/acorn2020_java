package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적: 무작위 정수를 얻어내고 싶다
		 * 얻어내서 콘솔창에 출력하고 싶다.
		 * 
		 */
		//Random 객체 생성 참조값 r1 대입
		Random r1=new Random();
		//정수범위 안에서 랜덤한 숫자 하나를 불러온다.
		//int r2=r1.nextInt();
		//0~99까지의 랜덤한 정수를 리턴해준다
		int r2=r1.nextInt(100);
		//랜덤한 불리언 값을 불러옴
		Boolean r3=r1.nextBoolean();
		//콘솔창 출력
//		System.out.println(r2);
//		System.out.println(r3);
		/*
		 * 해결할 문제 2: 원하는 범위 내에서 정수값을 얻어내고 싶다.
		 * 범위는 1~45
		 * 얻어내서  콘솔창에 출력한다
		 */
		int[] lottoNumA;
		int lottoNum=r1.nextInt(45)+1;
		System.out.println(lottoNum);
	}
}
