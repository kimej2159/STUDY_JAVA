package com.hanul.control;

import java.util.Random;

public class Ex12_Rockscissorspaper
{
	public static void main(String[] args) 
	{
		int scissors = 0, rock = 1, paper = 2;
		
		Random r = new Random();
		
		int user = r.nextInt(3);
		int computer = r.nextInt(3);
		System.out.printf("사용자 : %d, 컴퓨터 : %d\n" , user , computer);
		
		if((user == scissors && computer == paper) || (user == paper && computer == rock) || (user == rock && computer == scissors) )
		System.out.println("사용자 승");
		
		else if ((user == scissors && computer == rock) || (user == paper && computer == scissors) || (user == rock && computer == paper))
		{
			System.out.println("컴퓨터 승");
		}
		
		else 
		{
			System.out.println("무승부입니다.");
		}
		
		
	}

}
