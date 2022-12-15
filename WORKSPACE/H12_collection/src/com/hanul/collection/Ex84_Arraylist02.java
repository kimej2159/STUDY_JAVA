package com.hanul.collection;

import java.util.ArrayList;

public class Ex84_Arraylist02 {

	public static void main(String[] args) {
		// 모든 자료 구조는 래퍼런스타입만 저장할 수있으므로 
		// 프리미티브타입의 데이터를 자료구조에 저장할 때는 wrapper클래스를 사용한다
		
		ArrayList<Integer> list = new ArrayList();
		Integer a = new Integer(10);
		list.add(a);
		list.add(new Integer(20));
		int b = 25;
		list.add(b);
		list.add(30);
		for(int aa : list) {
			System.out.println(aa);
			
		}

	}

}
