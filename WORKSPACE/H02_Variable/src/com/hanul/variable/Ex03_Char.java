package com.hanul.variable;

public class Ex03_Char 
{
	public static void main(String[] args) 
	{
		char ch1 = 'A';			//char는 초기화가 영문, 한글, 숫자 한 글자만 가능하다
		char ch2 = '가';			//'' 사용, 빈칸으로 초기화 불가능
		String str = "가나다";		//"" 사용, 빈칸으로 초기화 가능
		
		System.out.println("ch1에 저장된 값은 " + ch1 + "입니다.");
		System.out.println("ch2에 저장된 값은 " + ch2 + "입니다.");
		System.out.println("ch2에 저장된 값은 " + str + "입니다.");
		
		System.out.println("A의 정수 값은 " + (int)ch1 + "입니다");
		System.out.println("가의 정수 값은 " + (int)ch2 + "입니다");
		
		System.out.println("숫자 65의 문자 값은 " + (char)65 + "입니다");
		System.out.println("숫자 44032의 문자 값은 " + (char)44032 + "입니다");
		
		//이스케이프(Escape) 문자 : 문자를 특정 기호로 인식하게 할 때 사용
		// \t : tab, \n : 줄바꿈, \\ : 슬래쉬 기호 그대로 사용, \' : 따옴표 기호 그대로 사용, \" : 쌍따옴표 기호 그대로 사용
		
		System.out.println("여러분\n\t\"반갑습니다!\"");
	}
}
