package com.hanul.control;

import java.util.Scanner;

public class Ex16_switch02 
{	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("몇월 입니까? : ");
		int month = sc.nextInt();
		
		switch(month )
		{	
			case 1:
			case 2:
			case 3:
				System.out.println("1분기 입니다. ");
				break;
				
			case 4:
			case 5:
			case 6:
				System.out.println("2분기 입니다. ");
				break;
				
			case 7:
			case 8:
			case 9:
				System.out.println("3분기 입니다. ");
				break;
				
			case 10:
			case 11:
			case 12:
				System.out.println("4분기 입니다. ");
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
		}
		
		
		
	}

}
