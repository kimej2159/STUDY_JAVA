package com.hanul.reference;

public class Ex74_homework
{
	public static void main(String[] args)
	{
		// 다음의 이메일 주소에 대해서 for문으로 아이디와 이메일 서비스를 분류해서 출력하세요
		//string email[] = { "hong1234@naver.com", "park901031@hanmail.net", "jeon@daum.net" };
		// hong1234@naver.com
//		
//		String email1 ="hong1234@naver.com";
//		String email2 ="park901031@hanmail.net";
//		String email3 ="jeon@daum.net";
//		
//		
//		String str1 = email1.substring(0, 8);			
//		System.out.println(str1);
//		
//		String adress1 = email1.substring(9, 18);			
//		System.out.println(adress1);
//		
		
		
		String email1 ="hong1234@naver.com";
		String[] arr1 = email1.split("@");
		for(String str1 : arr1)
		{
			System.out.println(str1);
		}
			System.out.println();

	
		String email2 ="park901031@hanmail.net";
		String[] arr2 = email2.split("@");
		for(String str2 : arr2)
		{
			System.out.println(str2);
			
		}
			System.out.println();
			
			
		String email3 ="jeon@daum.net";
		String[] arr3 = email3.split("@");
		for(String str3 : arr3)
		{
			System.out.println(str3);		
		}
		System.out.println();
		
		
	}
	
}
