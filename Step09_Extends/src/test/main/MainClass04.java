package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		SmartPhone p1;// 값을 넣어  넣어 놓지 않으면 변수 조차 만들어지지 않는다.
		SmartPhone p2=null;// SmartPhone type을 담을 수 있는  p2라는 변수를 만들거 값은 비워져있다.
		SmartPhone p3=new SmartPhone();//SmartPhone type을 담을 수 있는  p3라는 변수에  SmartPhone 객체의 참조값을 담는다.
		//p1은 만들어 지지 않아기 떄문에 문법 성립이 되지 않는다.
		//p1.call();
		
		//문법적으로는 성립을 하나 p2에는 아무것도 들어가 있지 않은 상태이기 때문에 실행되지 않는다( NullPointerException )
		//p2.call();
		
		p3.doInternet();
		
	}
}
