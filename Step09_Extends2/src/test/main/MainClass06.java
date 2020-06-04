package test.main;
import java.io.InputStreamReader;

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
//정수값을 입력받는다.
//받은정수값 변수에 넣고 초 분 시로 변환한다 변환한 것을 변수에 넣고 
//변환한 값을 출력한다.