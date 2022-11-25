package com.hanul.control;

public class Ex15_switch 
{
	public static void main(String[] args)
	{
	
		//switch ~ case 문 break
		//switch(기준값){
		//case 판단값1 : 
		//실행명령문2
		//	break;	
	
		int no1 = 8;
		switch(no1)
		{
		case 0: 
			System.out.println("3의 배수");
				break;
			case 1:
			 System.out.println("3의 배수가 아님");
			 break;
			 
			case 2: 
			System.out.println("나머지 0");
				break;
			case 3:
			 System.out.println("나머지 1");
			 break;
			case 4:
			 System.out.println("나머지 2");
			 break;
		}
	}
}