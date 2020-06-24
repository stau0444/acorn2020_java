package test.main;

import java.util.List;

import test.DAO.MemberDAO;
import test.DTO.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		MemberDAO dao=MemberDAO.getInstatnce();
		List<MemberDto> list=dao.getList();
	
		for(int i=0; i<list.size(); i++) {
			int num=list.get(i).getNum();
			String name=list.get(i).getName();
			String addr=list.get(i).getAddr();
			System.out.println(	num+"|"+name+"|"+addr);
		}
		//확장 for문 이용
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}
}
