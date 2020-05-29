package test.main;

import test.mypac.Box;
import test.mypac.Car;
import test.mypac.Member;
import test.mypac.Rect;


public class MainClass07 {
	public static void main(String[] args) {
		Member a=Box.mem; //null
		Rect b= Box.rect;//null
		Car c=Box.car;//참조값이 들어있다.
		c.drive(null);//메소드 호출이 가능하다.
		Box.car.drive(null);
		//박스클래스의 car라는 스태틱 필드를 참조하여 drive라는 메서드를 사용
		System.out.println(a);
		//시스템 클래스에서 out이라는 스태틱 필드를 참조하여 println이라는 메서드사용
		System.out.println(b);
		//b.getArea(); b가 null 이므로 NullpoinertExeption 발생
		//a.call() a가 null 이므로 NullpoinertExeption 발생
	}
}
