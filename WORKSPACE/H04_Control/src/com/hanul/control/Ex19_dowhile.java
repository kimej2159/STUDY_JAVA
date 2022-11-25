package com.hanul.control;

import java.util.Scanner;

public class Ex19_dowhile
{
	public static void main(String[] args)
	{	
		//do while : 무조건 한번은 실행함
		//1부터 10까지 출력
		
		
		int no1= 1;
		do 
		{
			System.out.println(no1);
			no1++;
		}
		while(no1 < 11 );
		
		//수를 입력받아 그 수가 10 이상일 경우만 빠져나오는 코딩 작성
		//10보다 작은 수를 입력했을 때 계속 수를 입력받게 함
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		
		do
		{	
			System.out.printf("숫자를 입력하세요 : ");
			number = sc.nextInt();
			//System.out.println(number);
		}
		while(number<=10);
		System.out.println("10이상의 수를 입력하셨습니다 "+ number);
		sc.close();
		
		
	}
}
