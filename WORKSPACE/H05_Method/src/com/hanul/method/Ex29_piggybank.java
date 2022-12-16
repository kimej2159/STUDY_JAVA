package com.hanul.method;

import java.util.Scanner;

public class Ex29_piggybank
{
	public static void main(String[] args)
	{
		// 저금
		// 출금
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("저금할 돈을 입력하세요 : ");
		int put = sc.nextInt();
		putmoney(put);
		
		System.out.printf("출금할 돈을 입력하세요 : ");
		int out = sc.nextInt();
		outmoney(out);
		
	}
	
	
	
	
	static void putmoney(int put)
	
	{
		int sum = 0;
		sum +=	put;
		System.out.printf("잔액은 %d원 입니다.\n", sum);
	}
	
	static void outmoney(int out)
	{
		int sum = 0;
		sum -= out;
		
		if(sum < 0 )
		{
			System.out.println(" 잔액이 부족합니다.");
		}
		else
		System.out.printf("잔액은 %d원 입니다\n", out);
		
		
		
		
		
		
		
	}
}















