package test.mypac;



public class SmartPhone extends HandPhone{
		public SmartPhone() {
			System.out.println("SmartPhone() 생성자 호출됨");
		}
		public void doInternet() {
			System.out.println("인터넷을 해요");
		}
		//photo는 부모 클래스인  HandPhone의 메소드 
		//@Override 는 부모의 메소드를 재정의한 메소드라고 표시 해주는 어노테이션
		@Override
		public void photo() {
			//super.photo(); 부모 클래스를 가르키느 super 의 photo 메소드 (지워주면 부모 클래스는 같이 나오지 않는다.);
			
			System.out.println("1000만 화소의 사진찍어");
			
//			상속했을 떄 힙영역    
//			
//			SmartPhone p1=new SmartPhone();
//			stack			heap
//			p1				object
//							phone
//							handphone
//							smartphone
//			상속관계 에서는 스마트폰 생성자의 상속관계에 있는 모든 상위 객체들이 한 참조값에 같이 만들어진다
		}
}
