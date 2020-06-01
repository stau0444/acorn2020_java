package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] args) {
		//computer 객체를 생성하고  c1변수를 담는다
		Computer c1=new Computer(new Cpu());
		//c1을 참조하여 dogame 메소드를 호출한다
		c1.doGame();
		//c1의 cpu를 참조하여 run 메소드를 호출한다.
		c1.cpu.run();
	}
}
