package com.hanul.control;

import java.util.Scanner;

public class Ex08_if02 
{
	public static void main(String[] args)
	{
		int score = 100;
		
	//높은 점수 순으로	
		if ( score >= 90)
		{
			System.out.println(score +"는 90점 이상입니다." );
		}
		
		else if ( score >= 80)
		{
			System.out.println(score +"는 80점 이상입니다.");
		}
		
		else if  ( score >= 70)
		{
			System.out.println(score +"는 70점 이상입니다.");
		}
		else if  ( score >= 60)
		{
			System.out.println(score +"는 60점 이상입니다.");
		}
		else 
		{
			System.out.println("60점 미만입니다.");
		}
		
	//낮은 점수 순으로
		if ( score <= 60)
		{
			System.out.println(score +"는 60점 미만입니다." );
		}
		else if ( score <= 70)
		{
			System.out.println(score +"는 70점 미만입니다." );
		}
		else if ( score <= 80)
		{
			System.out.println(score +"는 80점 미만입니다." );
		}
		else if ( score <= 90)
		{
			System.out.println(score +"는 90점 미만입니다." );
		}
		else {
			System.out.println("90점 이상입니다.");
		
		}
		
		//주민등록번호 남자 1,3 / 여자 2,4
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요(1~4) : ");
		int gender = sc.nextInt();
		if( gender == 1  || gender == 3 )
		{
			System.out.println("남자입니다.");
		}
		
		else if( gender == 2  || gender == 4 )
		{
			System.out.println("여자입니다.");
		}
		
		else
		{
			System.out.print("범위 내의 숫자를 입력해주세요 : ");
			gender = sc.nextInt();
			if( gender == 1  || gender == 3 )
			{
				System.out.println("남자입니다.");
			}
			
			else if( gender == 2  || gender == 4 )
			{
				System.out.println("여자입니다.");
			}
		}
		
		
		
		
		
		
		
	}
}
