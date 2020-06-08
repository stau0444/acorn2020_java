package test.main;

import test.human.Blood;
import test.human.Man;
import test.human.Person;
import test.human.Sex;
import test.human.Woman;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1이라는 지역변수에 담아보세요

		System.out.println();
		Person p1= new Person(new Blood("+","B"),new Sex("man"));
		System.out.println("당신의 혈액형은 "+p1.blood.getRh()+p1.blood.getType()+p1.sex.getSex()+" 입니다");

	}
}
