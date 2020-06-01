package test.mypac;

public class Car {
	//필드생성
	public String name;
	public  String color;
	//생성자
	public Car(String name, String color){
		//매개변수명은 뭐를 입력해야 하는지에 대해서 힌트를 줘야한다. 
		//생성자의 인자로 전달 받은 값을 필드에 저장
		this.name=name;
		this.color=color;
	}
	//메소드
	public void drive() {
		System.out.println(this.color+this.name+"가 (이)달려요");
	}
}
