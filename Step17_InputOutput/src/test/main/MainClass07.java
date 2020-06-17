package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		File myFile=new File("c:/");
		String[] names=myFile.list();
		//목록 문자열 출력
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
