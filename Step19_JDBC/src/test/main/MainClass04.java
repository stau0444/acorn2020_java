package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 2번회원의 이름을 원숭이로 수정해라
		 */
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
		int num=2;
		String name="원숭이";
		PreparedStatement pstmt=null;
		
		try {
			String sql="UPDATE member"
					+ " SET name=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정 했습니다");
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
