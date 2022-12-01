package com.hanul.control;

import java.util.Random;

public class Ex20_dicewhile
{
	public static void main(String[] args) 
	{
		
		Random r = new Random();
		
		int user =0;
		int computer = 0;
		
		do
		{
			System.out.println("주사위를 던집니다. ");
			 user = r.nextInt(6) + 1;
			 computer = r.nextInt(6) +1;
			System.out.printf("사용자 : %d, 컴퓨터 : %d\n" , user , computer);
	
		}while( user == computer );
		
			if(user > computer)
			{
				System.out.println("사용자 승!");
			}
			
			else if(user < computer)
			{
				System.out.println("컴퓨터 승!");
			}

				
	}

}
