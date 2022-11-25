package com.hanul.control;

public class Ex07_if01
{
	public static void main(String[] args) 
	{
		{
		
		//if 만 사용 if(조건식) : 조건식이 참이면 실행
		//if else 사용 : 조건식이 참이면 if 문 실행, 아니면 else문 실행
		// if와 else if와 ... else를 사용할 수 있다 
		
	/*	int no1 =  5, no2 = 10;
		if(no1 > no2)
		{
			System.out.printf("%d 가 %d보다 더 큰수\n" , no1, no2);
		}
		
		else //if대신 else를 사용한 조건문
		{
			System.out.printf("%d 가 %d보다 더 작은수\n" , no1, no2);
	*/	}
		
		// else문 대신 if 사용한 조건문
	/*	if (no1 <= no2)
		{
			System.out.printf("%d 가 %d보다 더 작은수\n" , no1, no2);
		}
		*/
		
		// if와 else if, else를 사용한 조건문
	/*	int dadage = 56 , momage = 56;
		
		if (dadage < momage)
		{
			System.out.printf("아빠나이, %d가 엄마나이, %d 보다 적다" , dadage, momage);
		}
		else if (dadage > momage)
		{
			System.out.printf("아빠나이, %d가 엄마나이, %d 보다 많다" , dadage, momage);
		}
		else 
		{
			System.out.printf("아빠나이와 엄마나이가 같다" ,  dadage, momage);
		}
		
	*/	
	/*
		int even = 50, odd = 51;
		if(even%2 == 0 )
		{
			System.out.printf("%d는(은) 짝수입니다.\n" , even);
		}
		else if (even%2 == 1)
		{
			System.out.printf("%d는(은) 홀수입니다.\n", even);
		}
		
		
		if(odd%2 == 0 )
		{
			System.out.printf("%d는(은) 짝수입니다.\n" , odd);
		}
		
		else if (odd%2 == 1)
		{
			System.out.printf("%d는(은) 홀수입니다.\n", odd);
		}
		
		else
		{
			System.out.printf("%d는(은) 홀수입니다.\n", odd);
		}
	*/
	
		int mymoney = 2000;
		int time = 0;
		int late = 11;
		int bus = 1250, taxi = 4200;
		
		if ( mymoney >= 4200)
		{
			System.out.printf("택시를 탈 수 있습니다.\n남은 돈은 %d원 입니다.\n", (mymoney - taxi));
			time = 15;
			
		}	
		
		else if( mymoney < 4200)
		{
			System.out.printf("택시를 탈 수 없습니다.\n남은 돈은 %d원 입니다.\n", (mymoney - bus));
			time = 30;
			++late;
			
			if(late >=12)
			{
				System.out.printf("%d는(은) 지각허용횟수 초과입니다.\n", late);
			}
			else if (late < 12)
			{
				System.out.printf("%d는(은) 지각허용횟수 이내입니다.\n", late);
			}

		}
		
		else
		{
			System.out.printf("택시를 탈 수 없습니다.\n남은 돈은 %d원 입니다.\n");
			time = 60;
			late++;
		}
			
		
		
		if (late < 12 )
		{
			System.out.println("수당이 지급됩니다.");
		}
		else
		{
			System.out.println("수당이 지급되지 않습니다.");
		}
		
		System.out.println(mymoney +", " + time + ", " + late);
	
	
	//if문 안에 if문을 사용할 수 있다.

	int dadage = 56 , momage = 56;
	
	if (dadage < momage)
	{
		System.out.printf("아빠나이, %d가 엄마나이, %d 보다 적다" , dadage, momage);
	}
	else 
	{
		if ( dadage < momage)
		{
			System.out.printf("엄마나이가 아빠나이보다 많다. 엄마 나이 : %d " , + momage);
		}
		else
		{
			System.out.printf("아빠나이가 엄마나이보다 많다. 아빠 나이 : %d " , + dadage);
		}
	}
	}
}



