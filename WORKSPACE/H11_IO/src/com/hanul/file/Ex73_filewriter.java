package com.hanul.file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex73_filewriter {
	
	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
		writer = new FileWriter("output.txt");
		char[] data = {'자','바',' ','프','로','그','래','밍',' ', '초', '보', '쟁', '이', '뿌', '뿌'};
		for(int idx=0; idx<data.length; idx++)
		{
		//	writer.write(data[idx]);		// 출력 방법 1
		}
		 writer.write(data);				// 출력 방법 2
		
		}catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
					try{
						writer.close();
					} catch (IOException e){
						e.printStackTrace();
					}
			
				}
	

}
}