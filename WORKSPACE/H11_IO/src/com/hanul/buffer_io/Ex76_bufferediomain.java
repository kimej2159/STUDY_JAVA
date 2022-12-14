package com.hanul.buffer_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex76_bufferediomain{
	
	public static void main(String[] args) {
	
		String filepath1 ="src/buffer_io";		//scr밑에 buffer_io라는 패키지를 만들어줘!
		
		File dir = new File(filepath1);
		if(!dir.exists() || !dir.isDirectory())		//만약 없으면 만들어줘!
		{
			dir.mkdirs(); 						//mkdir은 하나 만들 때, mkdirs는 여러개 만들 때 사용
		}
		
		
		
		String filepath2 ="D:\\STUDY_JAVA\\WORKSPACE\\H11_IO\\src\\buffer_io2";		//scr밑에 buffer_io2라는 패키지를 만들어줘!
		
		File dir2 = new File(filepath2);
		if(!dir2.exists() || !dir2.isDirectory())		//만약 없으면 만들어줘!
		{
			dir2.mkdirs(); 						//mkdir은 하나 만들 때, mkdirs는 여러개 만들 때 사용
		}
		
		
		
		//날짜형태로 하위 디렉토리를 만들어야 하는 경우
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(new Date());		 
		File filepath3 = new File("D:\\STUDY_JAVA\\WORKSPACE\\H11_IO\\src\\" + today);

		if(!filepath3.exists() || !filepath3.isDirectory())		
		{
			filepath3.mkdirs(); 						
		}
		
		

		String filename = filepath1 + "/buffered.dat";
		
		BufferedOutputStream out = null;
		try {
			out = new BufferedOutputStream(new FileOutputStream(filename));	
			byte data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
			out.write(data);
			out.flush(); 			// 버퍼가 다 채워지지 않더라도 스트림을 내보내라
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("쓰기 끝!!!");
		
		
		
		//읽기
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(filename));
			byte data;
			while((data = (byte)in.read()) !=-1) { 
				System.out.println(data + " ");
			}
		}catch ( Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
