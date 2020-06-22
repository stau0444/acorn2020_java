package test.main;
/*
 * JDBC 
 * DataBase 에 연결해서 SELect,INSERT,UPDATE,DELETE 작업하기
 * Oracle 연결하기 위해서는 드라이버 클래스가 있는 ojdbc6.jar 파일을 사용할 수있도록 설정해야한다.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass01 {
	 public static void main(String[] args) {
		
		Connection conn=new DBConnect().getConn();
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
			String sql="SELECT num,name,addr FROM member ORDER BY num ASC";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체를 이용해서 query 문 수행하고 결과
			//Resultset 객체로 받아오기
			
			//select문일경우에 executQuery 사용
			rs=pstmt.executeQuery();
			//resultset의 next , getint getString 이용해서 데이터를 빼왔다.
			//resultset 이란 cmd 창의 결과갑이 리절트셋이라 생각해야하고
			//표의 헤드에 커서가 대기하고 있고 커서 아래에 데이터가잇으면 true 반환하고 한칸 내려간다
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
			//
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인메소드가 종료됩니다.");
	}
}
