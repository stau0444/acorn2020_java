package test.main;

public class MainClass05 {
	// 필드
	public String myName = "김구라";
	public static String yourName = "원숭이";

	public static void main(String[] args) {
		
		// System.out.println(this.myName);
		// 불가능 this는 참조값을 가르키는건데 static 영역에서는 클래스 자체를 가르키는 것이기 떄문에 말이되지않는다.
		// static 영역에서는 스태틱 영역내에서만 access할 수 있다.
		System.out.println(new MainClass05().myName);
		System.out.println(MainClass05.yourName);
		System.out.println(yourName);
		// System.out.println(this.yourName);
	}
}
