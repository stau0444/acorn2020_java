package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//클래스의 특정타입을 동적으로 만들고
		//Generic 클래스를 다양하게 지정 해서 객체 생성하고 참조값을 담을 수 있다.
		FruitBox<Apple> box1=new FruitBox<Apple>();
		FruitBox<Orange> box2=new FruitBox<Orange>();
		FruitBox<Banana> box3=new FruitBox<Banana>();
		//객체를 생성하거나 사용하는 시점에 타입을 지정해준다.
		
		//Generic 클래스로 지정한 type 객체를 넣어주어야한다
		box1.push(new Apple());
		box2.push(new Orange());
		box3.push(new Banana());
		
		//Generic 클래스로 지정한 type 객체가 리턴된다.
		Apple result1=box1.pull();
		Orange result2=box2.pull();
		Banana result3=box3.pull();
		
		System.out.println();
		
		

	}
}
