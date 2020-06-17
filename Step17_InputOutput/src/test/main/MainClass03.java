package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
 public static void main(String[] args) {
	InputStream is= System.in;
	InputStreamReader isr=new InputStreamReader(is);
	//한번에 여러글자를 읽어들여서 String type으로 리턴 해주는 기능을 가지고 있는 객체
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("입력");
		String line=br.readLine();
		System.out.println("line:"+line);
	} catch (IOException e) {
		e.printStackTrace(); 
	}
	
}
}
