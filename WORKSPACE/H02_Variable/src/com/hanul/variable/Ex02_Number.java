package com.hanul.variable;

public class Ex02_Number 
{
	public static void main(String[] args)
	{
		byte no1 = -128;		//선언과 초기화
//		byte no2 = 128;			//용량 초과로 초기화 불가능
		short no3 = 10000;
		int no4 = 1234567890;
		long no5 = 1234567890;
		long no6 = 12345678900L;
		
		int no7 = 800, no8 = 900;
		int no9 = 1000, no10 = 1200;
		
		int sum = no7 + no8;
		int sum1 = no7 - no8;
		int sum2 = no9 - no10;
		int no11 = 123;
		int no12 = no11;
		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(no12);
	}

}
