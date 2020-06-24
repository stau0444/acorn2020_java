package test.main;

import test.DAO.MemberDAO2;
import test.DTO.MemberDto;

public class testClass01 {
	public static void main(String[] args) {
		MemberDto dto=new MemberDto();
		dto.setName("황경욱");
		dto.setAddr("양주시");
		MemberDAO2 dao=MemberDAO2.getInstance();
		dao.Delete(1);
	}
}
