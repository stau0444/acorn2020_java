package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.Remocon1;

public class MainClass02 {
		static Remocon1 r3=new Remocon1() {
			@Override
			public void on() {
				System.out.println("불을 켜요");
			}
			@Override
			public void off() {
				System.out.println("불을 꺼요");
				
			}
		};
	public static void main(String[] args) {
		// Remocon 인터페이스를 구현한 익명의 local inner 클래스의 생성자를 호출해서
		//참조값을 얻어내고 Remocon type 의 지역변수 r1에 대입하기
		r3.on();
		r3.off();
		Remocon1 r1=new Remocon1() {

			@Override
			public void on() {
				System.out.println("켜져라");
			}

			@Override
			public void off() {
				System.out.println("꺼져라");
			}
			
		};
		useRemocon(r1);
		useRemocon(r3);
		useRemocon(new Remocon1() {
			
			@Override
			public void on() {
				System.out.println("티비 켜져라");
				
			}
			
			@Override
			public void off() {
				System.out.println("티비 꺼져라");
				
			}
		});
		
	}
	//Remocon 이 데이터 타입역할을 할 수 있는걸 확인할 수 있다.
	public static void useRemocon(Remocon1 mr) {
	
		mr.on();
		mr.off();
		
	}
}
