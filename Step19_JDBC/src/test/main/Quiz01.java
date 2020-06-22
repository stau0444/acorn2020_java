package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Quiz01 {
	public static void main(String[] args) {
		int num=7;
		String name="노홍철";
		String addr="행신동";
	
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB의 정보 @아이피주소 :port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 COnncthin 객체의 참조값 얻어 오기
			conn=DriverManager.getConnection(url,"scott","tiger");
			//예외가 발생하지 않고 여기 까지 실행순서가 내려오면
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstm=null;
		
		try {
			String sql="INSERT INTO member"
					+ "(num,name,addr)"
					+ "VALUES(?,?,?)";
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, num);
			pstm.setString(2, name);
			pstm.setString(3, addr);
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null)pstm.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
