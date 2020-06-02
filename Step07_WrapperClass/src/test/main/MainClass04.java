package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//String type을 담을 수이 ㅆ는 방 3개 짜리 빈 배열객체를 만들어서 참조값을 지역변수 
		//names에 담기
		String [] names=new String[3];
		//각각의 방에 순서대로 String type 담기
		names[0]="김구라";
		names[1]="황경욱";
		names[2]="원숭이";
		
		String[] names1= {null,null,null};
		names1[0]="김구라";
		names1[1]="황경욱";
		names1[2]="원숭이";
		
	}
}
