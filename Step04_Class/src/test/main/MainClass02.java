package test.main;

import test.mypac.MyUtil;

//static이 부여된 메소드와 필드의 사용
public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스의 static 메소드 호출
		//new를 사용하지 않고 클래스명에 .을 찍어 객체 사용가능.
		MyUtil.send();
		//MyUtil 클래스의 static 필드에 값 대입하기
		MyUtil.version="1.0";
		//static은 객체가 하나만 만들어진다.
		//똑같은 모양의 객체가 여러개가 필요하다면 nonstatic이고 new를  사용해여 객체를 만들어 낸다.
		//ex 스타크래프트의 마린의 에너지는 개개인의 값이 달라져야 하기 때문에   nonstatic을 사용하고 
		//가격은 모두가 동일하기 때문에 static 사용
	}
	
}
