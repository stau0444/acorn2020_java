package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass06 {
	public static void main(String[] args) {
		String a=Messenger.getMessage();
		System.out.println(a);
		Messenger.sendMessage("hello");
		Messenger.useCar(new Car());
	}
}
