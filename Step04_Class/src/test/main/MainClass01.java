package test.main;

import test.mypac.Car;
//non static 메소드와 필드의 사용
public class MainClass01 {
	// run 했을 때 실행 순서가 시작되는 특별한 main() 메소드
	public static void main(String[] args) {
	// Car 클래스를 이용하여 객체 생성하고 참조값을 지역 변수에 담기 
		Car car1=new Car();
		//설계도를 이용해서 객체를 찍어내는 역할 new 클래스명 (); 참조값이 들어간다.
		//Car 클래스로 객체를 만들었기 때문에 car1 의 데이터 타입은 Car가 된다.
		car1.name="티코"; // Car의 name 저장소에 대입.
		car1.drive(car1.name);//Car의 drive 메소드 호출
		//1.Car 클래스를 이용해서 객체를 생성하고 참조값을 car2라는 이름의 지역변수에 담아보시오
		Car car2=new Car();
		//name 이라는 필드에 차 이름을 담아보세요.
		car2.name="소나타";
		//2.메소드 호출
		car2.drive(car2.name);
	//클래스명이 같더라도 패키지가 다르면 다른 클래스다.
	//패키지명이 겹치면 안되기 때문에 일반적으로 com.회사명 .url형식으로 이름을 정한다.   \
	//객체를 생성한 빈상태의 필드에는 null이들어있다.
	//변수는 값을 넣지 않으면 만들어 지지 않지만 필드는 선언만 하더라도 만들어진다.
	}
}
