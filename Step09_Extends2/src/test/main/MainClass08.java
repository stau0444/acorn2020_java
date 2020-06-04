package test.main;

import test.auto.Engine;
import test.auto.SportsCar;
import test.auto.SportsCarAudi;
import test.auto.SportsCarBenz;
import test.auto.SportsCarBmw;
import test.auto.Truck;
import test.auto.TruckVolvo;

public class MainClass08 {
	public static void main(String[] args) {
		Truck t1=new Truck(new Engine());
		t1.drive();
		t1.dump();
		
		SportsCar s1= new SportsCar(new Engine());
		s1.drive();
		s1.boost();
		
		SportsCarBmw bmw=new SportsCarBmw(new Engine());
		bmw.jump();
		bmw.boost();
		
		TruckVolvo volvo =new TruckVolvo(new Engine());
		volvo.crush();
		volvo.drive();
		SportsCarBenz benz=new SportsCarBenz(new Engine());
		benz.teleport();
		benz.drive();
		
		SportsCarAudi audi=new SportsCarAudi(new Engine());
		audi.fly();
	}
}


// 오버라이드,상속 ,부모클래스 생성자에 인자가있을때  정리
/*
 * 오버라이드
 * 부모클래스를 상속 받아서 부모클래스의 메소드를 재정의 
 * @Override를 적고 메소드를 만들어 주면되고 재정의 하려는 메소드명은 부모클래스의 메소드명과 같아야한다.
 * 상속
 * 자식클래스에서 상속을 받으면 부모 클래스의 메소드와 필드를 사용할 수 있다.
 * 상속받는 클래스로 객체 생성하게 되면  heap영역에 상속 최상위에서 아래로의  순서로 객체가 함께 생성된다.
 * 부모클래스의 생성자가 인자 값이 있는 경우 자식 클래스에서 부모클래스로 인자를 전해줘야한다.
 * (부모클래스가 먼저 만들어져야 하기 떄문)
 * 
 * 필드에는 메서드가 사용하는 부품들이 들어 있는 경우가 많다.
 * 필드 메소드 생성자의 공개범위 지정가능
 
 * public 전체공개
 * default 같은 패키지안 에서만 가능
 * private 선언된 그 곳에서만 사용 가능 ex)t1의 truck 에서 this로 car에 접근할 수가 없다.
 * protected  상속관계에서만 접근가능  ex)같은 패키지 안에서 접근이 가능하고
 * t1의 truck 에서 this로 car에 접근할 수 있다.
 * 
 */
