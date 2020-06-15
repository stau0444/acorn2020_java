package test.main;

import java.util.Random;

import test.mypac.SleepyException;

public class MainClass04 {
	public static void main(String[] args) {
		Random ran =new Random();
		for(int i=0; i<100; i++) {
			//0~9 사이의 랜덤숫자
			int ranNum=ran.nextInt(10);
			if (ranNum==5) {// 우연히 랜덤한 정수가 5면 예외발생
				throw new SleepyException("너무졸려");
			}
			
			System.out.println(i+1+"번째 작업중...");
			System.out.println(ranNum);
		}
		System.out.println("메인메소드 종료");
	}
}
