package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.hanul.email.Student;

public class emailSendermain2 {

	public static void main(String[] args) {
		
		
		ArrayList<Student> studArrarylist = new ArrayList<>();
		
		
		//읽기
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("list.txt"));
			String data;
			while((data = in.readLine()) != null) { 
				System.out.println(data);
				String[] studentarr = data.split(",");			// line으로 한줄씩 받아 읽은 데이터를 ","로 구분하여 하나씩 나눔 
				studArrarylist.add(new Student			//잘려진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 ArraryList(배열)에 넣는다
							(studentarr[0],studentarr[1], studentarr[2], studentarr[3]));	
			
			}
			System.out.println("listSize : " + studArrarylist.size());			//10개가 다 잘 넣어 졌는지 확인 차
			System.out.println(studArrarylist.get(0).getName());
		}catch ( Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("읽기 끝!!!");
		
		//이메일 전송 클래스
		emailSender2 sender = new emailSender2("emailsender12@naver.com" , "kej20181664", "관리자");
		
		sender.sendSimple(studArrarylist);
	}
}
