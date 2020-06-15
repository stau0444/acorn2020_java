package test.mypac;
/*
 *  인터페이스는 implements 해야한다 단독으로 객체생성이 안되기 떄문에  클래스에서 implements해서 
 *  인터페이스의 abstract 메소드를 오버라이딩 해줘야한다.
 * 구현 클래스에서는 인터페이스에 정의 된 추상 메소드를 반드시 오버라이드 해야한다.
 * 상속받은 것은 아니지만 부모타입의 역할을 한다.
 */
public class MyRemocon implements Remocon,Remocon1{

	@Override
	public void up() {
		System.out.println("채널이 올라갑니다.");
		
	}

	@Override
	public void down() {
		System.out.println("채널이 내려갑니다.");
		
	}

	@Override
	public void on() {
		System.out.println("전원이 켜져요");
		
	}

	@Override
	public void off() {
		System.out.println("전원이 꺼져요");
		
	}

}
