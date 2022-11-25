package com.hanul.control;

public class Ex09_variablerange 
{
	public static void main(String[] args)
	{
		//변수의 유효범위
		//로컬변수 : 선언된 블럭 안에서만 사용 / 블럭을 벗어나면 메모리에서 소멸 됨
		//전역변수 : 클래스 안에서 다 사용가능
		
		int val1 = 5;
		if(val1 > 1)
		{
			int val2 = 10;
			System.out.println(val1);
			System.out.println(val2);
		}
		
		System.out.println(val1);
		// System.out.println(val2); //if문 안에 val2가 선언되어서 밖에선 사용 불가능 하다.
		
		int no1 = 11;
		String result;
		
		if(no1%2 == 0)
		{
			result = "짝수입니다.";
			System.out.printf("%d는(은) " + result, no1);
		}
		else 
		{
			result = "홀수입니다.";
			System.out.printf("%d는(은) " + result, no1);
		}
		

	}	
}
