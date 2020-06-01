package test.main;

import test.mypac.Marine;
/*
 * marine 객체를 생성해서 참조값을 m1이라는 지역 변수에 담아 보세요.
 */
public class Mainclass08 {
	public static void main(String[] args) {
		Marine m1=new Marine();
		m1.move();
		m1.attack();
		m1.showEnergy();
		System.out.println("-----m1------");
		
		Marine m2=new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("-----m2-----");
		
		
		//용도에 따라서 모든 객체들이 공유하는 객체도 있다.
		//Marine의 공격력을 올린다
		Marine.attackPower+=2; //attackPower가  static이기 떄문에  공유하는 전체에 영향을줌
		m1.attack();
		m2.attack();
		//m1의 에너지 감소 시키기(m2의 에너지에는 영향을 주지 않는다)
		m1.energy-=10; //energy는 스테틱이 아니기 때문에 energy에 영향을주지않느다.
		m1.showEnergy(); //30 
		m2.showEnergy(); //40
		System.out.println();
	// 클래스명 .필드명.메서드명();
	}


}
