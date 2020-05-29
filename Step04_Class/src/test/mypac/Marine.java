package test.mypac;

public class Marine {
	//공격력을 저장하고 있는 static 필드  static 영역의 클래스와 함께 만들어진다
	public static int attackPower=6;
	//에너지를 저장하고 있는 non static 필드
	public int energy=40;
	//움직이는 메소드
	public void move(){
		System.out.println("마린이 움직여요");
	}
	//공격하는 메소드
	public void attack(){
		
		System.out.println(Marine.attackPower+"의 공격력으로 공격을 해요");
	}
	public void showEnergy(){
		System.out.println("현재 에너지:"+this.energy);
	}
}
//스태틱 필드와 논 스태틱필드를 같이 사용할 수 있다
//사용할때 주의할 것
//



