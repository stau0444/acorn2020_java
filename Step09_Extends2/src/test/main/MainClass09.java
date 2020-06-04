package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCarBenz;
import test.auto.Truck;

public class MainClass09{
	public static void main(String[] args) {
//		Truck t1=new Truck(new Engine());
//		useCar(t1);
		SportsCarBenz benz=new SportsCarBenz(new Engine());
		useCar(benz);
	}
	public static void useCar(Car car) {
		car.drive();
	}
}
// 차량 종류 보여주기 
// 트럭 스포츠카
//선택 S 누르면 스포츠카 T누르면 트럭
//종류-모델 보여주기 
//s면 벤츠,아우디,비엠더블유 t면 volvo
//(선택한 차량) 을 선택하셨어요!
////컴퓨터는 랜덤으로 차량선택됨  컴퓨터는(랜덤선택차량)를 선택하였습니다
//게임을 시작합니다 (sout)
//user 상태 칸 :3  2  1 start! 1초간격으로 나올 수있게 표시하고 
//사용자는 위에 컴퓨터는 아래 두 줄 표현되게 한다
//user :-------------B
//com  :---------A 
//-줄씩 자동으로 늘어나고 특정버튼 누를 때  기능을 사용 하게한다.
//도착점 정하고  첫번째로 들어가면 승리
//두번째로들어가면 패배
//while문 돌려서 R누르면 다시하기 Q누르면 그만하기