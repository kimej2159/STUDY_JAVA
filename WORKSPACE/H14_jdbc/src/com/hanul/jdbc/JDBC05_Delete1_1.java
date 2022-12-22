package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC05_Delete1_1 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			// PreparedStatement 를 사용하여 employee_id가 700인 사람을 삭제하시오
			// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 매소드		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터베이스 연결 : Connection 객체필요			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "0000");
			// 3. SQL문 선언
			String sql = "delete from employees where employee_id=? ";			
			// 4. 데이터베이스에 SQL문 실행 
			//    SQL문 실행기능이 있는 Statement 클래스를 사용, executeQuery() 사용
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 700);
			// 5. 만약 받아오는 결과물이 있으면 받음 : ResultSet 타입의 객체에 담는다
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("삭제 성공");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 4. DB 연결 해제
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}			
		

	}

}


