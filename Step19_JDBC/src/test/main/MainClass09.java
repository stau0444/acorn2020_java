package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.DTO.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		int num=2;
		String name="이정호";
		String addr="독산동";
		MemberDto m1=new MemberDto(num,name,addr);
		update(m1);
	}
	public static void update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement ps= null;
		try {
			String sql="update member "
					+ " set name=?,addr=? "
					+ " where num=?";
			conn=new DBConnect().getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAddr());
			ps.setInt(3, dto.getNum());
			ps.executeUpdate();
			System.out.println(dto.getName()+"님의 회원 정보가 수정 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		
		}
	}
}
