package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		//키보드와 연결된 InputStream type 의 참조값을 kbd 라는 지역변수에 담기
		//InputStream 객체는 1byte 단위 처리 스트링이다
		//영문자 대소문자,숫자,특수문자만 처리할 수있다.
		//한글 처리 불가
		InputStream kdb=System.in;
		System.out.println();
		try {
			int code=kdb.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
