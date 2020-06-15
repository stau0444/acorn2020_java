package test.mypac;

public class Multiplayer implements Remocon,Drill{
//오버라이드한 메소드는 정의하는 그 클래스에서만 유효한다
	@Override
	public void hole() {
		System.out.println("책상에 구멍을 뚫어요");
		
	}

	@Override
	public void up() {
		System.out.println("온도를 올려요");
		
	}

	@Override
	public void down() {
		System.out.println("온도를 내려요");
		
	}
	
}
