package com.hanul.control;

public class Ex23_for02
{
		public static void main(String[] args)
		{
			for( int dan =2; dan<10; dan++)				//모든 단의 구구단 출력하기( 가로 출력 ) 
			{
				System.out.println(" ");
				System.out.println("--- "+ dan + "단 ---");
				for(int i = 1; i < 10; i++)
				{
					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
			}
			
			for(int i =1; i < 10; i++ )					//모든 단의 구구단 출력하기 ( 세로 출력 ) 
			{
				for(int dan =2; dan < 10; dan++)
				{
					System.out.printf("%d x %d = %d\t", dan, i, dan*i);
				}
				System.out.println();		// --> 단이 끝나면 새로 시작할 수 있게 해줌 , 없으면 한 줄로 계속 출력됨
				
			}
			
			
			
			for(int i = 0; i < 5; i++)
			{
				
				for(int no1 = 1; no1 <5; no1++)
				{ 
					System.out.print("*"); 
				}
				System.out.println();
			}
			
				

			for(int i = 5; i > 0; i--)
			{
				for(int no1 = i; no1 > 0; no1--)
				{ 
					System.out.print("*"); 
				}
				System.out.println();
			}
			
			
			
			for(int i = 1; i < 6; i++)
			{
				for(int no1 = i; no1 > 0; no1--)
				{ 
					System.out.print("*"); 
				}
				System.out.println();
			}
			
			
			
			
		}
}
