package com.hanul.method;

import java.util.Scanner;

public class Ex27_method04
{
	public static void main(String[] args)
	
	{	
		// 1. 두 수를 입력받아 곱셈 연산으 한 결과와 나눗셈 연산을 한 결과를 리턴하는 메소드를 만들어 그 결과들을 더하고 뺀 경우를 변수에 입력하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 : ");
		int no1 = sc.nextInt();
		System.out.printf("숫자를 입력하세요 : ");
		int no2 = sc.nextInt();
		
		
		
		int multi = print01(no1, no2);
		System.out.printf("위 두 값을 곱한 값 = %d\n", multi);
		
		int div = print02(no1, no2);
		System.out.printf("위 두 값을 나눈 값 = %d\n", div );
		
		int sum = 0;
		sum = multi+div;
		System.out.printf("더한 값 = %d\n" ,sum);
		
		int sub = 0;
		sub = multi-div;
		System.out.printf("뺀 값 = %d\n" ,sub);
		
		
		//2.위에서 입력받은 두 수로 더 작은 수에서 더 큰 수까지 누적합을 구한 결과값을 리턴하는 메소드를 만들고 메인에서 그 수를 출력하는 프로그램을 작성
		
		int sum2 = print03(no1, no2);
		System.out.printf("누적 합 = %d\n", sum2);
		
	}
	
	static int print01(int no1, int no2)
	{
		int multi1 = no1*no2;
		return multi1;	
	}

	
	static int print02(int no1, int no2)
	{
		int div1 = no1/no2;
		return div1;	
	}
	
	
	
	
	static int print03(int no1, int no2)
	{
		int sum2 = 0;
		if(no1 > no2 )
		{
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
			
		for(int i = no1; i <= no2; i++)
		{
			sum2 = sum2 + i;
		}
		return sum2;
	}
	

	
}
