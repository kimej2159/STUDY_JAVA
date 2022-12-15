package com.hanul.collection;

import java.util.HashMap;

public class Ex85_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<key, Value> 형태로 저장
		//저장 공간으 Key별로 구분하여 저장하리 때문에 접근 속도가 빠르다 
		
//		HashMap<String , Integer> map = new HashMap<>(30);
		HashMap<String , Integer> map = new HashMap<>();
		//데이터 저장 : put(키, 데이터), 이름, 영어 점수
		map.put("홍길동", 88);
		map.put("심청이", 90);
		map.put("전우치", 85);
		map.put("박문수", 98);
		
		//데이터 조회 : get(키)
		int score = map.get("심청");
		System.out.println(score);
	
		//데이터 삭제 : remove(키값)
		map.remove("전우치");
		score = map.get("전우치");
	//	System.out.println(score);		=> null : error
	
	HashMap<String, Ex85_1_Student> studentlist = new HashMap<>();
	
	}

}
