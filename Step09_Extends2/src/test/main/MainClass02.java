package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	/*
	 * byte short int long
	 * byte b=10;
	 * int i=b;<-----------------인트가 더 넓은 범위기 떄문에 대입가능(Object로 생각)
	 *
	 *int i2=10;
	 *byte b2=(byte)i2<------------------byte가 더 좁은 범위이기 떄문에 i2를 형변환  해줘야한다.(handPhone으로 생각)
	 *
	 *int->long 문제없음
	 *long->int (int)로 형변환 
	 */
	public static void main(String[] args) {
		//스마트폰 객체 생성 p1변수에 저장
		SmartPhone p1=new SmartPhone();
		HandPhone p2=p1; // 문제없다
		Phone p3= p1;//문제없다
		Object p4=p1;//문제없다.
		/*
		 * 사용 가능한 기능의 범위
		 * SmartPhone>HandPhone>Phone>Object
		 */
		
	}
}
