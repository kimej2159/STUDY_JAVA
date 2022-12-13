package com.hanul.reference;

public class Ex73_string2
{
	public static void main(String[] args)
	{
		String str = "자바 프로그래밍 입문  ";
		int leng = str.length();		//문자열의 길이
		System.out.println(leng);			
			
		// 문자열을 잘라서 일부를 리턴해주는 매소드 : substring()
		String str1 = str.substring(3, 8);			// 3번째 글부터 8번째 글 앞까지
		System.out.println(str1);
		
		int[] arr = {10, 11, 12, 13, 15};		
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String str3 = new String("안녕 "); 
		String str4 = new String(" 안녕");
		
		if(str3.trim().equals(str4.trim()))
		{
			System.out.println("같은 내용");
		}
		else
		{
			System.out.println("다른 내용");
		}
		
		
		//문자열 연결 매소드 : concat()
		String str5 = "  Do it";
		str5 = str5.concat(str);
		
		System.out.println(str5);			// 기본 그대로 출력
		
		System.out.println(str5.trim());	// 빈칸 생략 후 출력
		
		
		//영문자에 대한 대/소문자화 메소드 : toUpperCase()/toLowerCase()
		System.out.println(str5.toUpperCase());		// 대문자 출력
		System.out.println(str5.toLowerCase());		// 소문자 출력
		
		
		// 문자열 변경 매소드 : replace(기존 문자열, 변경할 문자열)
		String str6 = " Hi hanul ";
		str6 = str6.replace("Hi", "Hello");
		System.out.println(str6);
		str6 = str6.replace("H", "A");
		System.out.println(str6);
		
		String str7 = " Hi hanul ";
		str7 = str7.replace("Hi", "Hello").replace("H", "A").substring(0, 10).trim();
		System.out.println(str7);
		
		
		//문자열에서 특정 문자열의 시작위치의 인덱스를 리턴하는 메소드
		// : indexOF(), lastIndexOF()	
		String str8 = "문자열에서 특정 문자나 문자열이 있는 시작위치를 리턴";
		
		//왼쪽부터 시작해서 "문자열" 이라는 문자열의 시작 위치
		System.out.println(str8.indexOf("문자열"));
		
		//오른쪽부터 시작해서 "문자"라는 문자열의 시작 위치
		System.out.println(str8.indexOf("문자", 6));
		
		int idx1 = str8.indexOf("문자");
		System.out.println(idx1);
		idx1 = str8.indexOf("문자", idx1 + 1);
		System.out.println(idx1);
		idx1 = str8.indexOf("문자", idx1 + 1);
		System.out.println(idx1);
		
		
		String str9 = "안녕 나는 홍길동이야";
		String[] arr1 = str9.split(" ");
		
		for(String str10 : arr1)
		{
			System.out.println(str10);
		}
		
		String str10 = "안녕 나는 홍길동이야";
		String[] arr2 = str9.split(",");
		
		for(String str11 : arr1)
		{
			System.out.println(str11);
		}
		
		
		
		
		
		
	}

}
