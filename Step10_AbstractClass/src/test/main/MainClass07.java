package test.main;

import test.mypac.Weapon;


public class MainClass07 {
	

	public static void main(String[] args) {
		//weapon 타입의 참조값을 얻어내는데 클래스를 따로만들지도 않았고 이너클래스를 만들지도않았다
		
		//익명클래스
		//anonymous local innerclass;
		//Weapon 추상 클래스를 상속받은 익명의 local inner class
		//의 생성자를 호출해서 Weapon type의 참조값 얻어내서 지역변수 w1에 담기
		
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("아무나 공격");
			}	
		};
		
		useWeapon(w1);
		//abstract class인 Weapon의 참조값을 얻어내기위한 지역 익명 클래스 
		Weapon w2=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("다죽여");
				
			}
		};
		useWeapon(w2);
		//객체를 일회용으로 사용 인자값으로 객체를 직접 생성하여 넣을 수도있다.
		//가장 간단한 방법
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
