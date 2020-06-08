package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCarBenz;
import test.auto.Truck;

public class MainClass09{
	public static void main(String[] args) {
//		Truck t1=new Truck(new Engine());
//		useCar(t1);
		SportsCarBenz benz=new SportsCarBenz(new Engine());
		useCar(benz);
	}
	public static void useCar(Car car) {
		car.drive();
	}
}
