package com.hanul.buffer_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex77_BufferedRWMain {

	public static void main(String[] args) {

		String filepath1 ="src/buffer_io";		//scr밑에 buffer_io라는 패키지를 만들어줘!
		
		File dir = new File(filepath1);
		if(!dir.exists() || !dir.isDirectory())		//만약 없으면 만들어줘!
		{
			dir.mkdirs(); 						//mkdir은 하나 만들 때, mkdirs는 여러개 만들 때 사용
		}
		
		

		String filename = filepath1 + "/buffered.txt";
		
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(filename));	
			char data[] = {'안', '녕', '!', '\n', '오', '늘', '도',
					'\n', '즐', '거', '운', '하','루', '\n'};
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
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
			int data;
			while((data = in.read()) !=-1) { 
				System.out.print((char)data);
			}
		}catch ( Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("읽기 끝!");
		
		
	}
	

}
