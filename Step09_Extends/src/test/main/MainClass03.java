package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//핸드폰 객체생성
		HandPhone p1= new HandPhone();
//		SmartPhone p2=p1(); p1이 더 큰 범위이기 떄문에 들어가지않으니 형변환 필요.
		SmartPhone p2=(SmartPhone)p1;//강제로 캐스팅
		p2.doInternet();
		
		Phone p3=new HandPhone();
		HandPhone p4=(HandPhone)p3;  //p3는 Phone type이여서 더작은 타입인 HandPhone p4 변수에 담길수 없다
		p4.mobileCall(); //설명서만 바꿔준거기 떄문에 실행 안됨
	}
}
