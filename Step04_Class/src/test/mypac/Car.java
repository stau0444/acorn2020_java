package test.mypac;
/*
 * [클래스의 용도]
 * 1.객체의 설계도 역할을 한다
 * 2.데이터type의 역할을 한다
 * 3.static 필드나 static 메소드를 가지고 있는 역할을 한다.
 */
//class 라는 예약어와 함께 클래스명을 적고 중괄호로 클래스를 만들고 클래스는 첫글자를 대문자로만든다.
//객체는 기능과 저장소로 이루어져 있다.
//클래스로 객체를 생성할 수 있고 클래스에 뭐를 명시해 놓느냐에 따라서 객체의 어떤기능과 어떤저장소를 갖을지 정할수있다.
//클래스는 객채를 찍어내기 위한 
//클랙스로 객체를 생성하면 클래스타입이된다.
//밑에 있는 것은 Car type이 된다. 저장소를 다른 말로 field 기능은method라 한다.
//static field,static method가 있고 non static field,non static method가 있다.
//클래스의 생성 **
public class Car { 
	//자동차의 이름을 저장할 필드(저장소)
	public String name;
	//달리는 메소드 (기능)  //자바스크립트의 function drive(){} 같은 느낌.
	public void drive(String a) {
		System.out.println(a+"가 달려요~");
	}
}
// Car라는 객체의 설계도
// 객체지향언어 객체를 사용하여 데이터를 처리함