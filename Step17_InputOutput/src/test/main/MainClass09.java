package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn2020/visual_work/MyFolder/gura.txt");
		try {
			f1.createNewFile();
			
			System.out.println("gura.txt파일을 만들었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
