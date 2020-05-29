package test.main;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		Member freinds=new Member();
		freinds.number=2;
		freinds.name="김구라";
		freinds.addr="노량진";
		freinds.call();
		
		Member freinds2=new Member();
		freinds2.number=1;
		freinds2.name="황경욱";
		freinds2.addr="의정부";
		freinds2.call();
	}

}
