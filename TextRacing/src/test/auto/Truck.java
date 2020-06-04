package test.auto;

public class Truck extends Car{
	
	//Engine 객체를 생성자의 인자로 전달 받는 메소드
	public Truck(Engine engine) {
		//부모 생성자 자식객체에서 받은 인자를 부모생성자의 인자로 전달해준다.
		super(engine);//부모생성자 문법
	}
	//메소드
	public void dump() {
		System.out.println("무언가를 부어버려");
		this.drive();// this는 t1의 참조값을 가르킨다. 
//		this.engine protected일때 상속관계에서는 볼수가 있다. 외부(MainClass 같은)에서는안된다
	}
}

//부모 클래스의 생성자가 디폴트가 