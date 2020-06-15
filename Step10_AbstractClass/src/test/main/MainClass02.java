package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//직접 클래서 만들고 객체 생성해서 
		//아래의 useWeapon()메소드 호출
		Gun g1=new Gun();
		useWeapon(g1);     
		g1.attack(); // Weapon의  메소드 자식클래스에서 오버라이드해서 정의되지 않은 메소드를 재정의해서 abstract인 weapon 
		//객체의메소드를 사용함. 
		g1.shot();//gun의 메소드 
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
