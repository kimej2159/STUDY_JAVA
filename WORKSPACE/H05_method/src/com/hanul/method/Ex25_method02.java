package com.hanul.method;

public class Ex25_method02
{
	public static void main(String[] args)		//사칙 연산하는 메소드
	{
		
		printadd(10, 5);
		printsub(10, 5);
		printmulti(10,5);
		printdiv(10,5);
		
	}
	
	static void printadd(int no1, int no2)
	{
		int sum1 = no1 + no2;
		System.out.printf("더한 값 = %d\n" , no1 + no2);	
	}
	 
	static void printsub(int no1, int no2)
	{
		int sum2 = no1 - no2;
		System.out.printf("뺀 값 = %d\n" , sum2);
		return;
	}
	
	static void printmulti(int no1, int no2)
	{
		int sum3 = no1*no2;
		System.out.printf("곱한 값 = %d\n" , sum3);
		
	}
	
	static void printdiv(int no1, int no2)
	{
		int sum4 = no1/no2;
		System.out.printf("나눈 값 = %d\n" , sum4);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
