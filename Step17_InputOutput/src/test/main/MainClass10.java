package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			File f1 = new File("c:/acorn2020/visual_work/MyFolder/folder" + i);
			f1.mkdir();
		}
	}
}
