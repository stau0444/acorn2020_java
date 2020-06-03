package test.main;

import java.util.Random;
import java.util.Scanner;
/*
 * [컴퓨터와 가위 바위 보 하기]
 * 가위(s) 바위(r) 보(p) : s 입력
 * 
 * :computer :가위, 바위 , 보 ;
 */
public class MainClass07 {
	public static void main(String[] args) {
		int i=5;
		int w=0;
		int l=0;
		int d=0;
		while (true) {
				if(i==0) {
					System.out.println("끝!"+w+"W "+l+"L "+d+"D! ");
					break;
				}
			// 컴퓨터의 가위 바위보를 배열에 담는다
			String[] com = { "가위", "바위", "보" };
			// 랜덤 값으로 배열에서 하나를 가져온다
			Random ran = new Random();
			int comNum = ran.nextInt(3);
			// 나의 가위바위보를 변수에 담는다
			Scanner scan = new Scanner(System.in);
			System.out.println(i+"판 남았어요!");
			String myNum = scan.nextLine();
			// 내가 입력을 한 후 컴퓨터의 것이 나오게 출력한다.
			System.out.println(com[comNum]);
			// 나의 것과 컴퓨터의 것이 같다면 비기는 것
			if (com[comNum].equals(myNum)) {
				System.out.println("비겼어요");
				d++;
				// 이기는 경우의 수
			} else if (myNum.equals("가위") && com[comNum].equals("보") || 
					   myNum.equals("바위") && com[comNum].equals("가위")
					|| myNum.equals("보") && com[comNum].equals("바위")) {
				System.out.println("이겼어요");
				w++;
				// 나머지는 지는 것
			} else {
				System.out.println("졌어요");
				l++;
			}
			i--;
		}
	}
}
