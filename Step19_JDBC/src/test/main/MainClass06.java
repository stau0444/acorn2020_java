package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 3번 회원을 삭제하는 code 를 작성해 보세요
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
		PreparedStatement pstmt=null;
		int num=3;
		try {
			String sql="DELETE FROM MEMBER WHERE NUM=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 3);
			pstmt.executeUpdate();
			System.out.println(num+"번째 회원 정보가 삭제되었습니다.");
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
