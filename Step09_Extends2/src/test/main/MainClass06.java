package test.main;
/*
 * override (재정의 ,덮어쓰기):상속받는 클래스를 재정의
 */
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.mobileCall();
		p1.doInternet();
		p1.call();
		p1.photo();
	}
}
