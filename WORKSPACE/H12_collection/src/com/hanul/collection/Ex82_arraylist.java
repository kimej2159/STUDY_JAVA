package com.hanul.collection;

import java.util.ArrayList;

public class Ex82_arraylist {

	public static void main(String[] args) {
		//자료 구조
		//여러 데이터 타입을 모아둔 데이터 그룹으로 데이터의 검색, 추가, 삭제, 변경이
		// 가능하도록 만들어진 논리적 구조
		// 필드의 데이터 타입을 클래스 선언시 결정하지 않고 객체 생성시 결정한다
		// ArrayList<E>, HashMap<K, V>
		// 디폴트로 10개의 저장공간이 생긴다. 더 필요하면 알아서 크기를 키워준다
		// 선언 : new
		ArrayList<String> list = new ArrayList<String>();		//저장공간 10개
		// 저장 : add()
		list.add("배");				// list의 0번째 삽입
		list.add("사과");			// list의 1번째 삽입
		list.add("귤");				// list의 2번째 삽입
		list.add("감");			// list의 3번째 삽입
		list.add("파인애플");			// list의 4번째 삽입
		
		System.out.println(list.size());
		
		//조회 : get(인덱스)
		for(int i=0; i<list.size(); i++)
		{
			String fruit = list.get(i);		
			System.out.println( i +":" + fruit + "\t");
		}
		System.out.println();
		
		//삽입 저장 : add(삽입할 인덱스, 데이터)
		list.add(1, "바나나");
		printlist(list);
		
		//변경 저장 : set(변경할 인덱스, 변경할 데이터)
		list.set(4, "감");
		printlist(list);
		
		//삭제 : remove(삭제할 인덱스), remove(삭제할 값)
		list.remove(2);
		printlist(list);
		list.remove("파인애플");
		printlist(list);
		
		//데이터의 위치 찾기 : indexOf(데이터)
		int idx = list.indexOf("귤");
		System.out.println(idx);
		
		list.add("배");
		idx = list.lastIndexOf("배");
		System.out.println(list);
		
		
	}
	
	
	public static void printlist(ArrayList<String> list) {
//		for(int i=0; i<list.size(); i++)
//		{
//			String fruit = list.get(i);		
//			System.out.print( i +":" + fruit + "\t");
//		}
//		System.out.println();
		
		for(String fruit2 : list) {					// 향상된 포문
			System.out.print(fruit2 + " ");
			
		}
	}
	
}
