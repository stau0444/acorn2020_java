package test.main;

import java.util.Scanner;

public class TextRacing {
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
	
	public static void main(String[] args) {
		String [] Truck = {"volvo"};
		String [] Sports= {"benz","BMW","Audi"};
		System.out.println("시작합니다");
		System.out.println("차종을 고르세요");
		System.out.println("트럭 (t) 스포츠카(s)");
		Scanner scan1=new Scanner(System.in);
		String select=scan1.nextLine();
		if(select.equals("t")) {
			System.out.println("Volvo(v)");
		}else if(select.equals("s")) {
			System.out.println("Benz(b)  Audi(a)  BMW  (w)");
		}
		System.out.println("모델을 골라주세요");
		String selectM=scan1.nextLine();
		
		if(selectM.equals("b")){
			System.out.println("Benz를   고르셨네요!! 벤츠는 Teleport기능이 있습니다");
		}else if(selectM.equals("v")){
			System.out.println("Volvo를   고르셨네요!! 볼보는 Crush기능이 있습니다");
		}else if(selectM.equals("a")){
			System.out.println("Audi를   고르셨네요!! Audi는 Jump기능이 있습니다");
		}else if(selectM.equals("w")){
			System.out.println("BMW를   고르셨네요!! BMW는 Fly기능이 있습니다");
		}

		
		System.out.println("시작합니다");
		
		for(int i=5;i>0; i--) {
			try {
				//실행의 흐름(스레드)을  1초 잡아 놓기  
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//.print() 메소드를 이용해서 개행 기호를 출력하지 않는다. 
			System.out.print(i);
		}
		
			
		System.out.println("시작!");
		for(int j=0; j<20; j++) {
			try {
				//실행의 흐름(스레드)을  1초 잡아 놓기  
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//.print() 메소드를 이용해서 개행 기호를 출력하지 않는다. 
			System.out.println("-");
			System.out.print("-");
			if(j==1) {
				System.out.print(selectM);
			}
			
		}
		
	}
}
