package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintSream 객체를 부모 type OutputStream 으로 받아보기
		OutputStream os=ps;
		try {
			os.write(97);//출력하기
			os.flush();//출력된 내용 방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
