package com.hanul.variable;

public class Ex05_Casting 
{
	public static void main(String[] args) 
	{
		//작은 범위에서 큰 범위로 담는 것은 에러가 나지 않는다.
		byte no1 = 10;
		int no2 = no1;
		
		float no3 = no2;
		
		System.out.println("float no3 : " + no3);
		
		double no4 = no3;
		System.out.println("double no4 : " + no4);
		
		no4 = 3.14;
		System.out.println("no4 = " + no4);
		
		no2 = (int)no4;  		//형변환을 하기 위해 ()안에 결과적으로 변환하려는 형을 적어준다. 왼쪽의 값의 형을 기준으로 삼는다.
		System.out.println("no2 = " + no2);
		
		no2 = 130; 	 			//int
		short no5 = (short)no2;
		System.out.println("no5 = " + no5);
		
		no1 = (byte)no2;  // int > byte
		System.out.println("no1 = " + no1);
		
		
		
		
	}

}
