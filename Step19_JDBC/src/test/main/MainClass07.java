package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.DTO.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		
		List<MemberDto> li=new ArrayList<>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String sql="select num,name,addr from member";
			conn=new DBConnect().getConn();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				MemberDto m1= new MemberDto();
				m1.setNum(num);
				m1.setName(name);
				m1.setAddr(addr);
				
				li.add(m1);
				
				//리스트에 담김
			

				//
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 생성햇던 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
		
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		printMember(li);
		
	}//main
	
	public static void printMember(List<MemberDto> li) {
		for(MemberDto tmp:li) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}//printMember()
}
