package com.hanul.control;

import java.util.Scanner;

public class Ex22_for01
{
	public static void main(String[] args)
	{
		//for 문 
		// for (초기화식; 조건식; 조건 증감식 // 조건 변경식)
		//		실행명령문;
		//
		//}
		// *를 10개 출력
	/*	
		for(int i =0; i<10; i++)			// * 10개 출력
		{
			System.out.printf("*");
		}
		
		for (int no1 = 1; no1<11; no1 ++)		// 1~10까지 출력
		{
			System.out.println(no1);
		}
		
		for (int no1 = 10; no1>0; no1 --)		// 10~1까지 출력
		{
			System.out.println(no1);
		}
		
		for (int no1 = 1; no1 < 10; no1 ++)
		{
			System.out.printf("3 x %d = %d\n" , no1, no1*3);
		}
		
		int sum=0;
		for (int no1 = 1; no1<11; no1 ++)
		sum += no1;
		{	
			System.out.println(sum);
		}
		
		
		for(int no2 = 1; no2<11; no2 ++)
		{
			if(no2%2==0)
			{
				System.out.println(no2);
			}
		}
	*/	
		
		
		// 실습 1
		for(int no2 = 1; no2<11; no2 ++)
		{
			if(no2%2==1)
			{
				System.out.println(no2);
			}
		}
		
		// 실습 2
		int no3 = 0;
		
			Scanner sc = new Scanner(System.in);
			System.out.printf("단을 입력하세요 : ");
			no3 = sc.nextInt();
			
		for (int no1 = 1; no1 < 10; no1 ++)
		{	
			if(no1 < 10)
			System.out.printf("%d x %d = %d\n" , no3, no1, no1*no3);
		}
		
		// 실습 3
		int sum2=0;
		int no4 = 0;
		System.out.printf("수를 입력하세요 : ");
		no4 = sc.nextInt();
		
		for (int no1 = 1; no1<= no4; no1 ++)
		
		{	sum2 += no1;
			System.out.println(sum2);
		}
		
		// 실습 4
		int sum3 = 0;
		int no5 = 0;
		
		System.out.printf("수를 입력하세요 : ");
		no5 = sc.nextInt();
		
		for (int no1 = 1; no1 <= no5; no1 ++)	
		{	
			if(no1%3==0)
			{
				System.out.println(no1);
			}
		} 
		
	}
}
