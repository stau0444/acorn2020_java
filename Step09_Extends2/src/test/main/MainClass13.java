package test.main;

import test.human.Blood;
import test.human.Man;
import test.human.Sex;
import test.human.Woman;

public class MainClass13 {
	public static void main(String[] args) {
		Man m1=new Man(new Blood("+","A"),new Sex("남자"));
		useMan(m1);
		Woman w1=new Woman(new Blood("+","B"),new Sex("여자"));
		w1.respire();
	
	}
	public static void useMan(Man m) {
		m.walk();
		m.respire();
		m.seeMovie();
		
		
	}
	
}
