package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		Phone p1= new SmartPhone();
		p1.call();
		//힙영역에 객체에는 상속관계의 모든 메소드와 필드가 생성이되지만 p1은 Phone type이기 때문에 (설명서가 Phone) Phone type
		//이상의 기능과 필드만사용이가능하다
		// 가르키는 객체(SmartPhone)에 필드와 메소드가 존재하기떄문에  p1을 형변환 해주게되면 설명서가 HandPhone으로 바뀌고 필드 메소드 사용가능
		HandPhone p2=(HandPhone)p1;
		p2.mobileCall();
		//p1의 원래 형태는 SmartPhone이기 떄문에 형변환을 해주면 SmartPhone의 메소드,필드를 사용할 수 있다.
		SmartPhone p3=(SmartPhone)p1;
		p3.doInternet();
		Phone cel= new SmartPhone();// Phone 데이터타입의 smartPhone 객체 생성 현상태에서는 Phone 상위의 메소드 필드사용가능.
		cel.call();
		HandPhone cel1=(HandPhone)cel;//현재는 HandPhone 상위의  메소드 필드 사용가능.
		cel1.mobileCall();
		SmartPhone cel2=(SmartPhone)cel;// SmartPhone 상위의 메소드 필드 사용가능.
		cel2.doInternet();
		
	}
}
