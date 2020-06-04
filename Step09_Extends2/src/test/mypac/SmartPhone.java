package test.mypac;

public class SmartPhone extends HandPhone{
		public void doInternet() {
			System.out.println("인터넷을 해요");
		}
		//photo는 부모 클래스인  HandPhone의 메소드 
		//@Override 는 부모의 메소드를 재정의한 메소드라고 표시 해주는 어노테이션
		@Override
		public void photo() {
			//super.photo(); 부모 클래스를 가르키느 super 의 photo 메소드 (지워주면 부모 클래스는 같이 나오지 않는다.);
			System.out.println("1000만 화소의 사진찍어");
		}
}
