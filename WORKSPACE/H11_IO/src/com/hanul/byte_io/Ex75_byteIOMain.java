package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex75_byteIOMain{
	
	public static void main(String[] args) {
	
		//키보드로 구구단 단 수를 입력받아 입력받은 단의 결과값을 배열변수에 담는다
		// 배열에 담긴 데이터(입력받은 구구단 결과값)를 3단.dat 파일에 쓰기작업을 한 후 
		// 3단.dat 파일의 내용으 읽어 들여 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 원하는 단을 입력하세요 : ");
		int num = sc.nextInt();
//		for(int no1 = 1; no1 <= 9; no1++)
//		{
//			System.out.printf("%d x %d = " + no1*num, num , no1);
//			System.out.println();
//		}
//		
		
		
		FileOutputStream out = null;
		try{
			out = new FileOutputStream("3단.dat");
			byte[] data = { (byte) sc.nextInt()};
			
			for(int i=0; i<10; i++)
			{
				System.out.printf("%d x %d = " + num*i, num , i);
			}
			out.write(data);
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					out.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					}
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("3단.dat");
			int data;
			while((data = in.read()) !=-1)
			{
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
