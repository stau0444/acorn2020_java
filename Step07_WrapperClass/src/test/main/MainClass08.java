package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {

		int[] r2 = new int[6];
		Random r1 = new Random();
		for (int i = 0; i < r2.length; i++) {
			int r3 = r1.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (r3 == r2[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < r2.length; i++) {
			System.out.println(r2[i]);
		}
	}

	public boolean check(int[] arr, int num) {
		boolean isTrue=false;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == num) {
				isTrue=true;
			}
		}
		return isTrue;
	}
}
