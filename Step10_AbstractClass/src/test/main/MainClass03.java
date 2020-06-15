package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		//Zoo 객체생성
		Zoo z1= new Zoo();
		//z1의 getMonkey가 리턴한 값인 monkey 객체의 참조값을 Monkey type m1에 담음 
		Monkey m1=z1.getMonkey();
		//Monkey 객체의 메소드인 say를 호출
		m1.say();
		//클래스 안의 클래스를 내부 클래스(inner class)라 한다.
		Tiger t1=z1.getTiger();
		t1.say();
	}
}
