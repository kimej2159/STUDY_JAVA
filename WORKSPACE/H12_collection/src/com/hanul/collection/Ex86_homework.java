package com.hanul.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.Name;

public class Ex86_homework {

	// Homework1_본인이름 -> 폴더를 zip파일로 만들어 이름을 붙인후 제출
	// [과제]
	// 1. 	BufferedReader 클래스를 사용해 list.txt 파일에서 한 줄씩 읽어온 데이터를 
	//		Student 객체 로 만들어 자료구조 HashMap 에 데이터로 저장한다.
	// 2. 	저장을 모두 끝낸 후 자료구조에 있는 학생목록에서 학생의 정보를 찾아 
	//		다음처럼 출력되게 한다.
	
	// 출력결과) : 자기자신의 정보를 출력해보세요
	// 성명: 김은지
	// 성별: 여
	// 연락처: 010-4176-2159
	// 주  소: kimej2159@naver.com
	
	public static void main(String[] args) {
	
		ArrayList<Ex85_1_Student> studArrarylist = new ArrayList<>();
		
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("list.txt"));
			String data;
			while((data = in.readLine()) != null) { 
				
			String[] studentarr = data.split(",");	
			
			Scanner sc = new Scanner(System.in);
			System.out.print("조회할 사람의 이름을 입력하세요 : ");
			String search = sc.next();
				
			
			if(search == null)
			{
				System.out.println(search + "은 없는 사람입니다.");
			}
			
			else
				
			{
				System.out.println("성명 : " + studentarr[0]);
				System.out.println("성별 : " + studentarr[1]);
				System.out.println("연락처 : " + studentarr[2]);
				System.out.println("이메일 : " + studentarr[3]);
				System.out.println();
			}
			
			
			
			
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

	
	
	}
}
