package com.hanul.control;

public class Ex18_while01
{	
	public static void main(String[] args)
	{
		// 반복문 : 일정한 작업을 규칙적으로 반복 실행할 떄 똑같은 명령문을 여러변 작성하지 않고 반복문을 사용한다 
		//while 문, do while 문, for 문이 있다
		//while 문 
		// Hello java를 10번 출력하는 while문을 작성하시오
		
		int cnt = 1;
		//조건식
		while(cnt <= 10){
			//실행문
			System.out.printf("Hello java %d\n", cnt);
			//조건식을 변경시켜야 함 => 없으면 무한루프에 빠짐
			cnt++;
		}
		
		int no1 = 1;
		while(no1 <=10)
		{
			System.out.printf("%d\n", no1);
			no1++;
		}
		
		int no2 = 10;
		while(no2 >= 1 )
		{
			System.out.printf("%d\n", no2);
			
			no2--;
			
		}
		
		// 3*1부터 3*6을 출력
		
		int no3 = 1;
		while (no3 < 7)
		{
			System.out.printf("3*%d\n", no3);
			no3++;
			
		}
		
		
		int no4 = 1;
		int sum = 0;
		
	
		while (no4 < 6)
		{	
			sum = sum + no4;
			no4++;
		}
		System.out.printf("%d\n", sum);
		
		
		
		int no5 = 1;
		int sum1 = 7;
		
	
		while (no5 < 10)
		{	
			sum1 = sum1 * no5;
			System.out.printf("7*%d = %d\n", no5, sum1);
			no5++;
		}
		
		int no6 = 1 ;
		int sum2= 0;
		
		while(no6 <= 100)
			{
				sum2 = sum2 + no6;
				no6++;
			}
		System.out.printf("%d\n", sum2);
	}

}
