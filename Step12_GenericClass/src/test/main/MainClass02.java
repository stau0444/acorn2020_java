package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.Box;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {
	//객체를 생성할 때 Generic 클래스는 생략이 가능하다
	//Generic 클래스가 있다라고만 해놓고
	//참조값을 담을 때 변수 타입으로 제네릭을 적어준다.
	FruitBox<Apple>box1=new FruitBox<>();
	FruitBox<Orange>box2=new FruitBox<>();
	FruitBox<Banana>box3=new FruitBox<>();
	public static void main(String[] args) {
		Box<String> b1=new Box<>();
		b1.push("드라이버");
		System.out.println(b1.pull());
		List<String> names=new ArrayList<String>();
		names.add("김구라");
		names.add(1, "유재석");//add(int,String) 지정한 인덱스에  스트링을 넣어준다
		names.clear();//배열을 비운다.
		int namesSize=names.size();
		System.out.println(namesSize);
	
		
	}
	

}
































































      