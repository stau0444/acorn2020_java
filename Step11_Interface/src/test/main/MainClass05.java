package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1=new Joinner() {
			
			@Override
			public String join(String first, String second) {
				return first+second;
			}
		};
		
		//람다식 함수 예제
		String result=j1.join("안녕", "하세요");
		System.out.println(result);
		Joinner j2=(first,second)->{
			return first+second;
		};
		String result2=j2.join("안녕히", "가세요");
		System.out.println(result2);
		Joinner j3=(first,second)->first+second;
		String result3=j3.join("황", "경욱");
		System.out.println(result3);
	}
}
