package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();
		Car a=obj1.getCar();
		Car b=obj1.getCar();
		Car c=obj1.getCar();
		//세가지에 들어 있는 것은 모두 다르다. 각기 다른 참조 값이 부여되기 때문에
		//어떤 메소드는 그안에서   new를 통해 객체를 새로만들어서(new를 해서) 리턴해주기도한다
		

	}
}
