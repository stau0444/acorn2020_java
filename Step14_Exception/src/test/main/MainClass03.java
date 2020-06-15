package test.main;

import java.io.File;
import java.io.IOException;

/*
 * RuntimeException 을 상속 받지않은 Exception은 
 * 반드시 try~catch 블럭으로 묶어서 예외 처리 해야한다.
 */

public class MainClass03 {
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		File f1=new File("c:/acorn2020/myFolder/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인메소드가 종료됩니다.");
	}
}
