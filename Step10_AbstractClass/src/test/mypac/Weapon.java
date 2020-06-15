package test.mypac;
/*
 * 미완성된 추상 메소드를 멤버로 가지고 있는 클래스는
 * abstract 예약어를 붙여서 정의해야한다.
 */

public abstract class Weapon {
	//무기 작동하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	//공격하는 메소드
	public abstract void attack() ;
	//모양만 만들어지고 수행해야할 것은 없는 클래스
	//클래스 내에 abstract가 하나라도 있으면  클래스에도 abstract를 달아줘야한다.
	//abstract 단독 객체생성은 불가 자식클래스를 통해 객체생성을 해야함.
	//type 역할은 가능함 클래스의 모양은 갖춰져있기 떄문에 
	//자식클래스의 생성자를 호출해서 추상클래스 생성자를 얻어냈다.
	//상속받는 클래스에서 어택을 오버라이딩 해줘야 실행가능
}
