package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File myFile=new File("c:/");
		File[] f=myFile.listFiles();
		for(File tmp:f) {
			if(tmp.isDirectory()) {
				System.out.println("["+tmp.getName()+"]");
			}else {
				System.out.println(tmp.getName());
			}
		}
	}
}
