package com.hanul.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex72_filereader {

	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			reader = new FileReader("reader.txt");
			while(true) {				
				try {
//						int data;
//						while((data=reader.read()) != -1 )		//파일을 -1이 될때까지 계속 실행하라
//					{
//						char ch = (char) reader.read();			// 이런 식으로 실행하면 너무 빨라져서 제대로 실행이 안된다
//						System.out.println(ch);
//					}
					int data = reader.read();
					if(data == -1) {
						break;
					}
					char ch = (char) reader.read();
					System.out.println(ch);
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				reader.close();				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		try {
			reader = new FileReader("reader.txt");
			char[] data = new char[100];
			try {
				int no = reader.read(data);
				System.out.println(no);
				for(int idx=0; idx<no; idx++) {
					System.out.println(data[idx]);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

