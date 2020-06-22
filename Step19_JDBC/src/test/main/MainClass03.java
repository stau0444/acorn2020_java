package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * member 테이블에 추가할 회원의 정보
		 * 1. 김구라 ,노량진
		 * 회원의 번호는 시퀀스 객체를 이용해서 넣기
		 * 시퀀스명 :member_seq;
		 * 
		 */
		int num=1;
		String name="김구라";
		String addr="노량진";
	
		
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
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 만들기
		//실행할 sql문 준비
		PreparedStatement pstmt=null;
		//결과 받아와서 저장하는 변수
		ResultSet rs=null;
		//sql문 담을 String type 변수준비하고 query 담는다
		//conn.prepraestatement(sql) 쿼리문을 준비해주는 메서드이다
		//pstmt.executeQuery() resultset 타입 변수 rs에 담는다.
		//rs를 참조하여 next getInt getString을 이용하여 DB에 값들을 빼온다                     
		try {
			//실행할 sql 문 
			String sql="insert into member"
					+ " (num,name,addr)"
					+ " VALUES(member_seq.NEXTVAL,?,?)";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체를 이용해서 query 문 수행하고 결과
			//?에 값을 바인딩해서 미완선의 sql 문을 완성 시킨다.
	
			pstmt.setString(1,name);
			pstmt.setString(2,addr);
			//select문일경우에 executQuery 사용
			int result=pstmt.executeUpdate();

		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {}
		}
	}
}
