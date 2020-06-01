package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 c1이라는 이름의 변수에 담아
		Car c1=new Car("티코","빨간색 ");
		c1.drive();
		
		Car c2=new Car("소나타","회색 ");
		c2.drive();
		
		Car c3=new Car("벤츠","검정색 ");
		c3.drive();
	
		
	}
}
