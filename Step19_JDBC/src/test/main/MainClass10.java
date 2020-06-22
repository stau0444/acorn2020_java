package test.main;

import java.sql.SQLException;

import test.DAO.MemberDAO;
import test.DTO.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//만일 memberDao 객체의 참조값이 필요하다면.
		MemberDAO dao=MemberDAO.getInstatnce();
		//새로운 회원 정보
		//dao에 insert로 db에 추가
		
	
			System.out.println(dao.getData(13).getName());

		
	}
}
