package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//myObject 클래스에 정의된 3개의 메소드를 호출하는 code를 작성해 보세요.
	   MyObject obj=new MyObject();
	 
	   obj.getNumber();
	   obj.getGreeting();
	   
	   //인트타입 데이터를 담는 변수
	   int c=obj.getNumber();
	   String d=obj.getGreeting();
	   obj.walk(c,d);
	}
}
