package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {
	public static void main(String[] args) {
		
		//메소드를 호출할 때 직접 값을 만들어 넣어준다.
		MyObject obj1=new MyObject();
		obj1.setNum(10);
		obj1.setName("황경욱");
		obj1.useCar(new Car());
		//메소드 호출이 어려울떈 대입 연산자를 생각한다
		//메소드 호출시 대입되있는 값을 넣어준다.
	}
}
