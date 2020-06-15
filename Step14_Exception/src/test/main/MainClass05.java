package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		MyUtil u1=new MyUtil();
		
		//클래스 생성당시 예외처리를 해놓았기 떄문에 바로 호출이 가능하다.
		u1.draw();
		
		
		//thorw 되었기 떄문에 호출하는 쪽에서 예외처리해줘야한다
		try {
			u1.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
