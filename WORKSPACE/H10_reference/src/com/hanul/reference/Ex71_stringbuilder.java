package com.hanul.reference;

public class Ex71_stringbuilder
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		sb = new StringBuilder("안뇽");
		System.out.println(sb.capacity()+ sb.length());
		
		String str = "여러분" + "안녕" + "~";		// 스트링을 한번에 여러개로 선언하면 메모리가 무거워짐
		
		sb = new StringBuilder();				// 긴 스트링을 한번에 선언할 때 사용
		sb.append("여러분");
		sb.append("안녕");
		sb.append("~~");
		
		System.out.println(sb);
		
		String val = sb.toString();
		System.out.println(val);

	}

}
