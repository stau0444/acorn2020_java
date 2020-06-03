package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		//phone 클래스로 객체 생성해서 참조값을 지역 변수에 담기
		//다형성: 하나의 객체를 여러개 타잎의 변수에 넣는다.
		//폰 객체는 폰타입이기도하면서 오브젝트타입이기도하다
		//폰 객체는 오브젝트 객체의 메소드를 사용할 수 있다.
		Phone p1=new Phone();
		Object p2=new Phone();
		//p1은 call에 접근이가능하지만
		//p2는 불가능하다
		HandPhone p3=new HandPhone();
		//HandPhone은 Phone을 상속받기 떄문에  Phone에 있는 call 메소드를 사용할 수 있다.
		Phone p4=new HandPhone();// 가능 폰 이상에 정의된 기능만 사용가능 .
		Object p5=new HandPhone();//가능 오브젝트에 정의된 기능만 사용가능.
		//왜 이런 타입으로 받는가요
		//어떤 객체를 부모타입으로 받게되면 프로그래밍이 유연해진다.?
		
		//이미 만들어진 객체의 참조값을 다른 type 으로 받아보기 
		Phone p6=p3; //Phone 타입도 되고 객체자체는 모든기능을 갖고 있지만 설명서가 다르다
		Object p7=p3;//Object 타입도 되고  객체자체는 모든기능을 갖고 있지만 설명서가 다르다
//		String str=p3;//에러가 난다 String type은 상속받지 않기 떄문에 부모 타입으로만 받을 수 있다.
		p3.call();
		p3.mobileCall();
		//필드나 지역변수에 데이터 타입을 선언할 떄 데이터타입은 사용설명서과 같다.
	/*	
	 * 	God of java
		class Wonderful{
			//여러가지 기능
		}
		class MyClass extends Wonderful{
			기능을 재정의 : override 할 수 있다.
		}
	 * 
	 */
		

	}
}
