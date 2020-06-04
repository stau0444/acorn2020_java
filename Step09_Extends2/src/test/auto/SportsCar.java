package test.auto;

public class SportsCar extends Car {

	public SportsCar(Engine engine) {
		super(engine);
	}
	public void boost() {
		System.out.println("부스터 온!!!!");
	}

	//메소드
	@Override
	public void drive() {
		/*
		 * 재정의 (오버라이드 ) 한 부모 메소드를 호출해야 할지 말지는 상황에 따라 다르다.
		 * 어떤 경우에는 부모의 메소드를 호출해 주지 않으면 객체가
		 * 제대로 동작하지 않는 경우가 있다
		 * 그런 경우에는 부모의 메소드를 반드시 호출해 주어야 한다.
		 * 호출해야하는지 안해야하는지 외형상 티가안나기 때문에 일단은 호출안해보고 동작이 안되면 호출을 한다.
		 */
		
		System.out.println("빨리 달려요");
	}
}
