package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import test.DTO.MemberDto;
import test.util.DBConnect;

public class MainClass08 {
	static List<MemberDto>li;
	public static void main(String[] args) {
		//추가할 회원의 정보

		String name="주뎅이";
		String addr="봉천동";
		
	
		int num=0;
		MemberDto m1=new MemberDto();
		MemberDto m2=new MemberDto();
		li=new ArrayList<MemberDto>();
		ListUp(m1);
		ListUp(m2);
		insert(m1);
		insert(m2);
		System.out.println(li.get(0).getNum()+li.get(0).getAddr()+li.get(0).getName());
		
	}
	public static void insert(MemberDto dto) {
		
		
	}
	public static void ListUp(MemberDto m) {
		li.add(m);
	}
}
