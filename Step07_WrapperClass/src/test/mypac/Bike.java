package test.mypac;

public class Bike {
	
	public Bike[] makeRide(int length) {
		Bike [] bikes=new Bike[length];
		for(int i=0; i<bikes.length; i++) {
			bikes[i]=new Bike();
		}
		return bikes;
	}
	public void ride() {
		System.out.println("바이크 타고 달려");
	}
}
