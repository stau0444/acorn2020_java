package test.main;

/*
 * 프로그래밍 목적: 영화 보는 메소드를 불러오시
 */
import test.human.Blood;
import test.human.Man;
import test.human.Sex;
import test.human.Woman;

public class MainClass11 {
	public static void main(String[] args) {
		//Man 객체 생성
		Man m1=new Man(new Blood("+","B"),new Sex("남자"));
		m1.seeMovie();//man method
		m1.walk();//person method
		m1.respire();//person method
		//Woman 객체 생성
		Woman w1=new Woman(new Blood("+","A"),new Sex("남자"));
		w1.reading();//woman method
		w1.respire();//person method
		w1.walk();//person method
		System.out.println(w1.blood.getRh());
		System.out.println(w1.blood.getType());
	}
}
