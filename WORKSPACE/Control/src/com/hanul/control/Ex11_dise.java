package com.hanul.control;

import java.util.Random;

public class Ex11_dise
{
	public static void main(String[] args)
	{
	/*	
	    Random r = new Random();
		int num = r.nextInt(100);
		System.out.println("렌덤수 : " + num);
	*/	
		
		Random r = new Random();
		// r.nextInt(6);				 // 0~5까지의 6가지 경우의 수가 생긴다.
		System.out.println("주사위를 던집니다. ");
		
		int user = r.nextInt(6) + 1;
		int computer = r.nextInt(6) +1;
		System.out.printf("사용자 : %d, 컴퓨터 : %d\n" , user , computer);
		
		if(user > computer)
		{
			System.out.println("사용자 승!");
		}
		
		else if(user < computer)
		{
			System.out.println("컴퓨터 승!");
		}
		
		else 
		{
			System.out.println("무승부 입니다.");
		}
		
		
		
	}

}
