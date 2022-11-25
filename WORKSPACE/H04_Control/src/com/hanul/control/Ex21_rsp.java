package com.hanul.control;

import java.util.Random;

public class Ex21_rsp
{	
	public static void main(String[] args)
	{
		int scissors = 0, rock = 1, paper = 2;
		int user = 0;
		int computer = 0;
		Random r = new Random();
		
		do{
			
		user = r.nextInt(3);
		computer = r.nextInt(3);
		
		System.out.printf("사용자 : %d, 컴퓨터 : %d\n" , user , computer);
		
		if((user == scissors && computer == paper) || (user == paper && computer == rock) || (user == rock && computer == scissors) )
		System.out.println("사용자 승");
		
		else if ((user == scissors && computer == rock) || (user == paper && computer == scissors) || (user == rock && computer == paper))
		{
			System.out.println("컴퓨터 승");
		}
		
		}while(user == computer);
		
	}

}
