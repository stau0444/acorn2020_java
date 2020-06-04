package test.mypac;
//HandPhone 클래스는 Phone클래스를 상속받는다.
public class HandPhone extends Phone {
	public HandPhone (){
		System.out.println("HandPhone() 생성자 호출됨");
	}
	//메소드
	public void mobileCall() {
		System.out.println("이동 중에 전화 걸어"); //override
	}
	//사진찍는 메소드
	public void photo() {
		System.out.println("30만 화소 사진 찍어");
	}

}
