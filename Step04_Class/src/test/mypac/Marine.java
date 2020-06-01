package test.mypac;
/*
 * 접근 지정자
 * 
 * 클래스,필드,메소드에 작성한다.
 * 
 * ~필드에 접근 지정자를 걸어 놓는이유
 * 리모컨을 예로들면 리모컨 의 부품들은 케이스로 감싸져 있는데 이는 내부에 
 * 부품들을 건드렸을때 잘못된  작동을할 수 있기 때문에 케이스로 감싸져 있는 것 처럼
 * 프로그램의 신뢰성을 높이기 위해 특정 메소드나 필드에 변경을 가하지 못하게 하기를 원할때
 * 접근 지정자를 사용한다.
 * 반대로 리모콘의 건전지를 가는 부분 같은 경우에는 접근해서 변경을 가능하게 해놓았음으로
 * 접근지정자가 public인 셈이다.
 * 
 * 1.public
 * -어디에서나 자유롭게 접근이 가능하다.
 * ex. marine 클래스의 public을 지우면 다른 패키지에서 접근이 불가하다.
 * 2.default(접근 지정자를 작성하지 않은 경우)
 * -동일한 package 내에서만 접근 가능
 * -package가 다르면 import도 불가능하다.
 * 
 */

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



