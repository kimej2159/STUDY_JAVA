package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc04_Insert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			//2. 데이터 베이스 연결 :Connection 객체 필요
			//	 DriverManager.getConnection
			//	 (연결하는 데이터 베이스 url, DB의 사용자이름, 패스워드) 메소드 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//	String url = "jdbc:oracle:thin:@192.168.0.50:1521:xe"; //cmd에서 ip4 주소를 직접 가져옴
			conn = DriverManager.getConnection(url, "hr", "0000");
			
			//3. SQL문 선언 : 홍길동 삽입
			
			int emp_id =700, salary = 5000;
			String last_name = "홍", first_name = "길동", email = "hong@naver.com", job_id = "IT_PROG";
			
			String sql ="insert into employees "
					+ "(employee_id , last_name, first_name, email, job_id, salary, hire_date) "
					+ "values(?, ?, ?, ?, ?, ?, sysdate)";
			
			//3-1. Statement 객체 생성
			ps = conn.prepareStatement(sql);
			ps.setInt(1, emp_id);
			ps.setString(2, last_name);
			ps.setString(3, first_name);
			ps.setString(4, email);
			ps.setString(5, job_id);
			ps.setInt(6, salary);
			
			//3-2. 쿼리문 실행
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("삽입 성공");
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
