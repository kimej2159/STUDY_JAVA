package com.hanul.collection;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex85_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<key, Value> 형태로 저장
		//저장 공간으 Key별로 구분하여 저장하리 때문에 접근 속도가 빠르다 
		
//		HashMap<String , Integer> map = new HashMap<>(30);
//		HashMap<String , Integer> map = new HashMap<>();
//		데이터 저장 : put(키, 데이터), 이름, 영어 점수
//		map.put("홍길동", 88);
//		map.put("심청이", 90);
//		map.put("전우치", 85);
//		map.put("박문수", 98);
//		
//		//데이터 조회 : get(키)
//		int score = map.get("심청");
//		System.out.println(score);
//	
//		//데이터 삭제 : remove(키값)
//		map.remove("전우치");
//		score = map.get("전우치");
//		System.out.println(score);		=> null : error
//	
//		HashMap<String,Ex85_1_Student> studentlist = new HashMap<>();			// 그 전 내용 : 2022-12-16
		
		
		ArrayList<Ex85_1_Student> studArrarylist = new ArrayList<>();
		
	
		//읽기
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("list.txt"));
			String data;
			while((data = in.readLine()) != null) { 
				System.out.println(data);
				String[] studentarr = data.split(",");			// line으로 한줄씩 받아 읽은 데이터를 ","로 구분하여 하나씩 나눔 
				studArrarylist.add(new Ex85_1_Student			//잘려진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 ArraryList(배열)에 넣는다
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



	
	
	
	}

}
