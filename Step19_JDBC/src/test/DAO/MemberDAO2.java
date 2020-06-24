package test.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.DTO.MemberDto;
import test.util.DBConnect;

public class MemberDAO2 {
	//필드
	private static MemberDAO2 dao;
	//default 생성자 
	
	private MemberDAO2() {}
	// 객체 리턴 메소드
	public static MemberDAO2 getInstance(){
		if(dao==null) {
			dao=new MemberDAO2();
		}
		return dao;
	}
	public boolean Insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement ps= null;
		int Snum=0;
		try {
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member(num,name,addr)"
					+ " values(member_seq.nextval,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAddr());
			Snum=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(Snum>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean Delete(int num) {
		Connection conn=null;
		PreparedStatement ps=null;
		int Snum=0;
		try {
			conn=new DBConnect().getConn();
			String sql="DELETE FROM member"
					+ " WHERE num=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,num);
			Snum=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(Snum>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean Update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=DBConnect.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
