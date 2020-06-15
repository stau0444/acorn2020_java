package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스로 객체생성할 수 없다 생성자는 존재한다.
		
		Weapon w1=new MyWeapon();
		w1.prepare();
		w1.attack();
		//w1.halo(); // weapon이 상위 클래스이기 때문에 접근불가하다
		MyWeapon w2=(MyWeapon)w1;// 형변환하면 원형태는 myweapon이기 떄문에 myweapon에 접근가능하다
		w2.helo();
	}
}
//기반을 마련해 놓을때 사용 
// 메소드의 인자값 같은 것들도 다 정해져 있다