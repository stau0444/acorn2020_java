package test.mypac;
//Phone 객체는 자동적으로 Object 타입을 상속 받는다.
public class Phone extends Object{
	//생성자 클래스명과 이름이 같고 리턴타입이 없다.
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	
	//전화 거는 메소드
	public void call() {
		System.out.println("전화걸어");
	}
}
