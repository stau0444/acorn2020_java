package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.Remocon1;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스 type (부모 type)
		Remocon1 r1=new MyRemocon();
		//원래 class type
		MyRemocon r2=new MyRemocon();
		
		useRemocon(r2);
		
	}
	//Remocon 이 데이터 타입역할을 할 수 있는걸 확인할 수 있다.
	public static void useRemocon(MyRemocon mr) {
		mr.up();
		mr.down();
		mr.on();
		mr.off();
		
	}
}
