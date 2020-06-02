package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass07 {
	public static void main(String[] args) {
		//매개변수로 아무것도 받지않은 생성자
		Computer c1= new Computer();
		System.out.println(c1);//
		//매개변수로 Cpu cpu를 받는 생성자
		Computer c2= new Computer(new Cpu());
		c2.doGame();
		c2.cpu.run();
		
		c1.doGame();//생성자에 cpu 객체를 생성하지 않았다.
	}
}
