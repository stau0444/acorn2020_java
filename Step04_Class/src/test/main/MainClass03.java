package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//변수에 담아 놓지 않았기 때문에 한번 쓰고 버리는 일회용 
		new Car().drive("a");
		//변수에 담아서 다음에도 사용 가능 참조값을 car1이라는 지역변수에 담기
		Car car1=new Car();
		//car1의 참조값을 이용하여 drive()메소드를 호출
		car1.drive("a");
		//Car라는 객채를 만들고 그참조값을 car2라는 지역변수에 담음
		Car car2=new Car();
		//car2를 참조해 drive메소드를 호출
		car2.drive("a");
		// 각각의 Car객체는 같은 모양을 갖고 있으며 서로다른 참조값이 부여된다.
		
		//static 방식 클래스명을 참조하여 send를 호출함
		MyUtil.send();
		
		YourUtil.up();
	}

}
