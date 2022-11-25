package com.hanul.control;

import java.util.Scanner;

public class Ex10_if03 
{
		public static void main(String[] args) 
		{/*
			//스캐너를 생성하여 나이를 입력받아 버스비를 계산하는 프로그램
			Scanner sc = new Scanner(System.in);
			System.out.printf("나이를 입력하세요 : ");
			
			int age = sc.nextInt();
			
			int charge = -100;
			String agegroup ="";
			
			if(age >= 20 )
			{
				agegroup = "일반";
				charge = 1250;
				//System.out.printf(agegroup + " 는" +  charge + "입니다. ");
			}
			
			else if ( age >= 13 )
			{
				agegroup = "청소년";
				charge = 800;
				//System.out.printf(agegroup + " 는" +  charge + "입니다. ");
			}
			
			else if( age >= 7)
			{
				agegroup = "어린이";
				charge = 400;
				//System.out.printf(agegroup + " 는" +  charge + "입니다. ");
			}
			
			else if (age < 7)
			{
				agegroup = "유아";
				charge = 0;
			}
			System.out.printf(agegroup + "은(는) " +  charge + "입니다. ");

			sc.close();
			
		*/	
			
			
			
			Scanner sc1 = new Scanner(System.in);
			System.out.printf("점수를 입력하세요 : ");
			
			int score = sc1.nextInt();
			char score1;
			
			if(score >= 90)
			{	score1 = 'A';	}
				
			
			else if(score >= 80)
			{	score1 = 'B';	}
				
			
			else if(score >= 70)
			{	score1 = 'C';	}
				
			
			else if(score >= 60)
			{	score1 = 'D';	}
				
			
			else 
			{	score1 = 'F';	}
			
			System.out.println("학점은 " + score1 + "입니다.");
			
			
			char level;
			
			if(score1 == 'A' || score1 == 'B')
			 {	level = '상';	 }
			
			else if(score1 == 'C'|| score1 == 'D')
			 {	level = '중';	 }
			
			else 
			 {	level = '하';	 }
			
			
			System.out.printf( "레벨은" + level  + "입니다.");
			
			
		}
}








