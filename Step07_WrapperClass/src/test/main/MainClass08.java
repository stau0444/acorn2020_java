package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		int[] r2=new int[6];
		Random r1=new Random();
		
		for(int i=0; i<r2.length; i++) {
			r2[i]=r1.nextInt(45)+1;
		}
		for(int i=0; i<6; i++) {
			System.out.println(r2[i]);
		}
	}
}
