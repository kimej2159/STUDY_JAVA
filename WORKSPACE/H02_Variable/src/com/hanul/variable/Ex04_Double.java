package com.hanul.variable;

public class Ex04_Double
{
	public static void main(String[] args)
	{
		// 실수형 float(4byte), double(8byte) : 기본은 double
		// float 사용시 뒤에 f 붙여야 함
		//1200000000 = 12*10^8
		
		double pi = 3.14;
		System.out.println("pi값은 " + pi);
		System.out.println("pi+1값은 " + (pi + 1)); 
		
		// 논리형 boolean(1byte) : true, false
		boolean isbreakfast = true;
		boolean islunch = false;
		
		System.out.println(isbreakfast);
		System.out.println(islunch);	
		
		// 상수형 Constant : 앞에 final 선언으로 값을 바꿀 수 없게 됨
		final double PI = 3.14;
		System.out.println("원주율 : " + PI);
		
		
		final int adult = 20;
		System.out.println(adult);
		
	}

}
