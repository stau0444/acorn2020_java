package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("종료(q) 계속 (Ennter):");
			String str=scan.nextLine();
			if(str.equals("11")) {
				//자바에서 문자열은 equals로 비교한다  내용이 같아도 참조 값이 다르기 떄문에 
				break;
			}
			MainClass06.doGame();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	public static void doGame() {
		
		String[] fruit = new String[5];
		fruit[0] = "cherry";
		fruit[1] = "apple";
		fruit[2] = "banana";
		fruit[3] = "melon";
		fruit[4] = "7";
		Random ran = new Random();
		int[] score= {10,20,30,40,1000};
		int[] score1=new int[5];
		for (int i = 0; i < 3; i++) {
			int ranNum = ran.nextInt(5);
			int ranNum2 = ran.nextInt(5);
			int ranNum3 = ran.nextInt(5);
			
			
			if(ranNum==ranNum2&&ranNum2==ranNum3) {
				if(fruit[ranNum]==fruit[0]) {
					System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]+"  "+score[0]+"점");
					score1[0]=score[0];
				}else if(fruit[ranNum]=="apple") {
					System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]+"  "+score[1]+"점");
					score1[1]=score[1];
				}else if(fruit[ranNum]=="banana") {
					System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]+"  "+score[2]+"점");
					score1[2]=score[2];
				}else if(fruit[ranNum]=="melon") {
					System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]+"  "+score[3]+"점");
					score1[3]=score[3];
				}else if(fruit[ranNum]=="7") {
					System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]+"  "+score[4]+"점");
					score1[4]=score[4];
				}
			}else {
				System.out.println(fruit[ranNum] + "|" + fruit[ranNum2] + "|" + fruit[ranNum3]);
			}
		}
		System.out.println("점수합계:"+(score1[0]+score1[1]+score1[2]+score1[3]+score1[4]));
	}

}

