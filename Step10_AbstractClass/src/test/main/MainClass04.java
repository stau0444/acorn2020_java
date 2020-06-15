package test.main;
//메서드안에서 클래스 정의와 생성
/*
 * 클래스 안에 만든 클래스 : inner class
 * 메소드 안에 만든 클래스: local inner class
 */
public class MainClass04 {
	public static void main(String[] args) {
		class Gura{
			public void say() {
				System.out.println("안녕나는구라야");
			}
		}
		//메소드 안에 정의한 클래스를 이용해서 객체 생성하고 참조값을 지역 변수에 담기  
		Gura g1=new Gura();
		g1.say();
	}
}
