package test.mypac;

public class Member {
	//필드 선언
	public int number;
	public String name;
	public String addr;
	
	//메서드에서 필드에 있는 것들을 참조
	//메서드 선언
	public void call() {
		// 객체 자신의 참조값을 활용할때 this를 사용
		// 혼돈의 소지가 없다면 this 생략 가능
		System.out.println(this.number+this.name+this.addr);
	}
}
