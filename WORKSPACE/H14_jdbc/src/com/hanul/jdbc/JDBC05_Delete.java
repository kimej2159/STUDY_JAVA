package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC05_Delete {

	public static void main(String[] args) {
		// preparedStatement를 사용하여 employee_id가 700인 사람을 찾아라
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<Employees> empArr = new ArrayList<>();
		
		try {
			// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 매소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결 : Connection 객체필요
			// DriverManager.getConnection
			// (연결하는 데이터베이스 url, DB의 사용자이름, 패스워드) 매소드
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "0000");
			
			String sql = "select * from employees where employee_id= ? ";	
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 700);
			
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				int emp_id = rs.getInt("EMPLOYEE_ID");
				String firstname = rs.getString("first_name");
				String lastname = rs.getString("last_name");
				String email = rs.getString("email");
				String phone_number = rs.getString("phone_number");
				Date hire_date = rs.getDate("hire_date");
				String job_id = rs.getString("job_id");				
				int salray = rs.getInt("salary");
				int commission_pct = rs.getInt("commission_pct");
				int manager_id = rs.getInt("manager_id");
				int department_id = rs.getInt("department_id");
				
				empArr.add(new Employees(emp_id, salray, commission_pct, 
						manager_id, department_id, firstname, lastname, 
						email, phone_number, job_id, hire_date));
			}
			System.out.println(empArr.size());
			
			for(int i=0; i<empArr.size(); i++) {
				// 
				if(empArr.get(i).getEmployee_id() == 700) {
					System.out.println(empArr.get(i).getDepartment_id() 
							+ ", " + empArr.get(i).getEmployee_id()
							+ ", " + empArr.get(i).getEmail()
							+ ", " + empArr.get(i).getLast_name()
							+ empArr.get(i).getFirst_name()
							+ ", " + empArr.get(i).getHire_date());
				}				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. DB 연결 해제
			try {
				if(rs != null) {
					rs.close();
				}
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


