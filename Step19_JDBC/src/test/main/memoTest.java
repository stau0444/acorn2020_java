package test.main;

import java.util.List;

import test.DAO.MemoDao;
import test.DTO.MemberDto;
import test.DTO.MemoDto;

public class memoTest {
	public static void main(String[] args) {
		MemoDao dao=MemoDao.getInstance();
		List<MemoDto> li=dao.getList();
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i).getNum()+li.get(i).getContents()+li.get(i).getRegdate());
		}
		
	}
}
