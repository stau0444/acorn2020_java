package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> arr= new ArrayList<>();
		arr.add("김구라");
		arr.add("해골");
		arr.add("원숭이");
		arr.add("주뎅이");
		arr.add("덩어리");
		arr.add("정봉이");
		//배열  List 객체에 담긴 문자열을 for문을 이용해서출력
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("확장 for 문");
		for(String msg:arr) {
			System.out.println(msg);
		}
	}
	
}
