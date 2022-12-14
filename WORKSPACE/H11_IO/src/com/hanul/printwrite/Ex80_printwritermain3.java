package com.hanul.printwrite;

import java.io.File;
import java.io.PrintWriter;

public class Ex80_printwritermain3 {

	public static void main(String[] args) {
		File dir = new File("src/printwrite");
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		String[][] studentInfo = {
				// studentInfo[0][0] = 이름, [0][1] = 성별
				{"홍길동", "남", "010-1111-7777", "hanul1@naver.com"},
				// studentInfo[1]
				{"심청", "여", "010-1111-5555", "hanul2@naver.com"}
		};
		
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(dir + "/" + "student.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			
			writer.println("<table border='1'>");
			writer.println("<tr>");			
			writer.println("<th>성명</th><td>홍길동</td>");						
			writer.println("</tr>");
			writer.println("<tr><th>성별</th><td>남</td></tr>");			
			writer.println("<tr><th>연락처</th><td>010-1111-2222</td></tr>");			
			writer.println("<tr><th>이메일</th><td>hanul@naver.com</td></tr>");			
			
			writer.println("<table border='1'>");
			writer.println("<tr><th>성명</th><th>성별</th><th>연락처</th><th>이메일</th></tr>");			
			writer.println("<tr><td>홍길동</td><td>남</td><td>010-1111-2222</td><td>hanul1@naver.com</td></tr>");			
			writer.println("<tr><td>심청</td><td>여</td><td>010-1111-3333</td><td>hanul2@naver.com</td></tr>");			
			
			writer.println("</table>");
			writer.println("</body>");
			writer.println("</html>");	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
	}
}
