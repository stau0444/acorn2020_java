package test.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.DTO.MemberDto;
import test.util.DBConnect;

/*
 * DAO(Data Access Object) 의 약자
 * -만드는 방법
 * 1.외부에서 객체 생성하지 못하도록 생성자의 접근 지정자를 private로 지정
 * 2.자신의 참조값을 저장할 수 있는 필드 선언 private로 선언
 * 3.자신의 참조값을 오직 하나만 생성해서 리턴 해주는 static 메소드 만들기
 * 4.나머지 기능(select,insert,update,delete)들은 non static으로 만든다. 
 */
public class MemberDAO {
	// 자신의 참조값을 저장할 private 필드
	private static MemberDAO dao;

	// 외부에서 객체 생성하지 못하도록 한다.
	private MemberDAO() {
	}

	// 참조값을 리턴해주는 메소드
	public static MemberDAO getInstatnce() {
		if (dao == null) {// 최초 호출 되면 null이므로
			dao = new MemberDAO();// 객체를 생성해서 static 필드에 담는다.
		}
		return dao;
	}

	// 회원 한명의 정보를 리턴해주는 메소드
	public MemberDto getData(int num) {

		MemberDto dto = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT num,name,addr" + " FROM member" + " WHERE num=?";
			conn = new DBConnect().getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();

			while (rs.next()) {
				dto = new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					;
				rs.close();
				if (ps != null)
					;
				ps.close();
				if (conn != null)
					;
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return dto;

	}

	// 회원의 목록을 리턴해주는 메소드
	public List<MemberDto> getList() {
		List<MemberDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement ps=null;
		   
		
		
		return null;
	}

	// 회원 정보를 db에 저장하는 메소드
	public void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "insert into member" + 
						 " (num,name,addr)" + " "
						 + "VALUES(member_seq.NEXTVAL,?,?)";
			conn = new DBConnect().getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAddr());
			ps.executeUpdate();
			System.out.println("회원정보 추가됨");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (ps != null)
					ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// 회원정보 삭제 메소드
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "DELETE FROM member WHERE num=?";
			conn = new DBConnect().getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			ps.executeUpdate();
			System.out.println("회원 정보를 삭제 했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
	}

	// 회원 정보를 db에서 수정하는 메소드
	public void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String sql = "update member " + " set name=?,addr=? " + " where num=?";
			conn = new DBConnect().getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAddr());
			ps.setInt(3, dto.getNum());
			ps.executeUpdate();
			System.out.println(dto.getName() + "님의 회원 정보가 수정 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}
