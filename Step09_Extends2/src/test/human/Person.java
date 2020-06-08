package test.human;

public class Person {
	//필드 객체 Blood
	public Blood blood;
	public Sex sex;
	//생성자
	public Person(Blood blood,Sex sex) {
		this.blood=blood;
		this.sex=sex;
	}
	public void walk() {
		System.out.println(this.sex.getSex()+"가 걸어요");
	}
	public void respire() {
		System.out.println(this.sex.getSex()+"가 숨쉬어요");
	}

}
