package test.mypac;

public class Multiplayer1 implements Remocon,Drill {

	@Override
	public void hole() {
		System.out.println("다뚫어");
		
	}

	@Override
	public void up() {
		System.out.println("오븐을 켜요");
		
	}

	@Override
	public void down() {
		System.out.println("오븐을 꺼요");
		
	}

}
