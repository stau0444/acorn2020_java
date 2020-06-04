package test.auto;

public class Car {
	//필드
	protected Engine engine;
	//생성자
	public Car(Engine engine) {
		//필드에 저장
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(engine==null) {
			System.out.println("엔진이 없어서 달릴수 없어요");
			return; // 메소드 끝내기
		}
		System.out.println("달려");
	}
}
