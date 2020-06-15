package test.main;

import test.mypac.Weapon;

//추상클래스의 참조값을 얻어내는데에는 자식 클래스를 만들고 자식클래스에서 오버라이딩 해줘야한다.
//abstract 클래스의 객체를 생성하는데에만 이용 당하기 떄문에
//inner 클래스를 사용하여 만든다.
public class MainClass06 {
	public static class Sword extends Weapon {
		
		@Override
		public void attack() {
			System.out.println("쓱싹(이너클래스활용)");

		}
		//메소드를 추가한다면 
		public void fly() {
			System.out.println("날아다녀요");
		}

	}

	public static void main(String[] args) {
		/*
		 * useWeapon() 메소드를 호출하는게 목적이다. 호출하려고 보니 Weapon 추상 클래스 type 객체의 참조값이 필요하다 따라서
		 * Weapon 추상클래스를 상속받은 클래스를 파일로 만들어야한다. 근데 불금이라 만사가 귀찬타 클래스 따로 만들기가 귀찬타
		 */
		class Hand extends Weapon {

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("주먹으로 갈겨(로칼이너클래스적용)");
			}
			
		}
		Sword w1 = new Sword();
		//자식 클래스에 추가된 메소드가 있다면 타입을  자식클래스타입으로 받아서 추가된 메소드가 사용이가능하다.
		useWeapon(w1);
		Weapon w2=new Hand();
		useWeapon(w2);
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
