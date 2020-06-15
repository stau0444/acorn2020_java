package test.main;

import test.mypac.Weapon;

//스태틱 영역에서는 스태틱 자원만 사용이가능하다.
public class MainClass08 {
	
	//클래스의 필드에 Weapon type의 참조값 넣어두기 
	//클래스 안에 정의되 있기 떄문에 annonymous inner class 
	//메소드 안에 정의되 있으면 annonymous local inner class
	static Weapon w1=new Weapon() { 
		@Override
		public void attack() {
			System.out.println("다떄려");	
		}
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		//필드에 있는 참조값을 이용해서 abstract클래스인 weapon 참조값 얻어냄
	
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
