package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03_update2 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
			conn = DriverManager.getConnection(url, "hr", "0000");
			int salary = 30000;
			String email = "godkking@naver.com";
			
			String sql ="update employees set" 
					+ " salary = ?, email = ?, phone_number = '010-4567-9852'"
					+ " where employee_id =100";
			
		
			ps = conn.prepareStatement(sql);
			ps.setInt(1, salary);
			ps.setString(2, email);
			
			
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("업데이트 성공");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7. DB 연결 해제
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