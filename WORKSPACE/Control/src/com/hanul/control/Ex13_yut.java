package com.hanul.control;

import java.util.Random;

public class Ex13_yut 
{	
	public static void main(String[] args)
	{
		Random r = new Random();
		int yut1 = r.nextInt(2);
		int yut2 = r.nextInt(2);
		int yut3 = r.nextInt(2);
		int yut4 = r.nextInt(2);
		
		System.out.println("윷을 던지세요!");
		System.out.printf("yut1 : %d / yut2 : %d / yut3 : %d / yut4 : %d\n" , yut1 , yut2 , yut3 ,yut4 );
		int sum = yut1 + yut2 + yut3 + yut4;
		
		if(sum == 1)
		{
			System.out.println("결과는 도입니다.");
		}
		else if(sum == 2)
		{
			System.out.println("결과는 개입니다.");
		}
		else if(sum == 3)
		{
			System.out.println("결과는 걸입니다.");
		}
		else if(sum == 4)
		{
			System.out.println("결과는 윷입니다.");
		}
		else if(sum == 0)
		{
			System.out.println("결과는 모입니다.");
		}
		
		
	}

}
