package test.main;

import test.mypac.Bike;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 1.Bike 객체를 담을 수 ㅣㅅ는 방 3개 짜리 배열 객체를 생성해서 참조값을
		 * bikes 라는 지역 변수에 담아 보세요.
		 */
	
		Bike[] bikes=new Bike().makeRide(20);
		
		for(int i=0; i<bikes.length; i++) {
			bikes[i].ride();
		}
	}
}
