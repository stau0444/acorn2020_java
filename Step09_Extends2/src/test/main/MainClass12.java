package test.main;

import test.human.Blood;
import test.human.Sex;
import test.human.Woman;

public class MainClass12 {
	public static void main(String[] args) {
		Woman w2=new Woman(new Blood("+","a"),new Sex("woman"));
		w2.reading();
	}
	
	
}
