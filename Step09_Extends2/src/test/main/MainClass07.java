package test.main;

import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		//실행해보면 자식클래스의 생성자를 호출하면 부모 클래스의 생성자가 모두 호출 되는 것을 알 수 있다.
		//실행순서:스마트폰 생성자로 갔다가 extends를보고 부모 클래스로 올라간다.
	}
}
