package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass04 {
	public static void main(String[] args) {
//		Car c1=new Car();
//		String name1="ugo";
		
		//MyObject 객체 생성
		MyObject obj1=new MyObject();
		//useSome() 메소드 호출
		obj1.useSome("ugo", new Car());
		//doSome() 메소드 호출
		obj1.doSome(new Radio(),new Speaker());
	}
}
