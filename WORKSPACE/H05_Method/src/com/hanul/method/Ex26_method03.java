package com.hanul.method;

import java.util.Scanner;

public class Ex26_method03
{
	public static void main(String[] args)
	{
		//파라메타로 숫자를 받아서 홀수 짝수를 판단하여 문자열을 리턴하는 메소드를 선언하여 출력하기
		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("숫자를 입력하세요 : ");
//		int no1 =  sc.nextInt();
//		
//		printeunji(no1);
//		System.out.println();
		
		
		//1부터 입력한 수까지의 합을 구하여 리턴하는 메소드를 구하고 합을 출력하시오
		
		System.out.printf("숫자를 입력하세요 : ");
		int no2 =  sc.nextInt();
		
		int sum = printsumall(no2);				// 메소드에서 int형으로 작성했으므로 메소드 실행시 앞에 int를 붙여 선언해준다
		System.out.println(sum);
	}
	
	
	
	
	
	static void printeunji(int no1)
	{
		if(no1%2 == 0)
		{
			System.out.printf("%d은(는) 짝수 입니다. " , no1);
		}
		else if(no1%2 == 1)
		{
			System.out.printf("%d은(는) 홀수 입니다.", no1);
		}
	}
	
	static int printsumall(int no2)
		
	{
		int sum = 0;
		
		for(int i = 1; i <=no2; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	
	
	
}
