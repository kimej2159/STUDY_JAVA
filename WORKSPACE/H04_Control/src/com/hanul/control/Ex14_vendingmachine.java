package com.hanul.control;

import java.util.Scanner;

public class Ex14_vendingmachine
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int coke = 1250, letsbe = 800, coco = 1000;
		boolean ischoice1 = false, ischoice2 = false, ischoice3 = false;
		
		
		// 투입된 금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 처리한다
		System.out.println("----자판기 메뉴----");
		System.out.println("1.콜라 : 1250원");
		System.out.println("2.레스비 : 800원");
		System.out.println("3.코코팜 : 1000원");
		
		System.out.printf("투입구에 돈을 넣으세요 : ");
		int money = sc.nextInt();
		System.out.println("투입금액 : " + money );
		
		if( money >=1250) { ischoice1 = true; }
		if( money >=800) { ischoice2 = true; }
		if( money >=1000) {	ischoice3 = true;	}
		
		
		System.out.printf("1.콜라 : 1250원"); System.out.println(ischoice1 ? "[구매가능]   " : "[구매불가능]	  ");
		System.out.printf("2.레스비 : 800원"); System.out.println(ischoice2 ? "[구매가능]   " : "[구매불가능]	 ");
		System.out.printf("3.코코팜 : 1000원"); System.out.println(ischoice3 ? "[구매가능]   " : "[구매불가능]	 ");
		
		
		//음료를 선택한다
		System.out.printf("음료를 선택하세요 : ");
		
		
		int drink = sc.nextInt();
		int change = 0;
		if(ischoice1 && drink == 1) 
		{
			change = money - coke;
			System.out.println("콜라가 나옵니다");
		}
		else if(ischoice2 && drink == 2)
		{	
			change = money - letsbe;
			System.out.println("레쓰비가 나옵니다");
		}
		else if(ischoice3 && drink == 3) 
		{
			change = money - coco;
			System.out.println("코코팜이 나옵니다");
		}
		else {
			change = money;
		}
		System.out.println("잔액 : " + change );
		//거스름돈 처리하기
		// 
	
		if(change > 0)
		{
			int c1000 = 0, c500=0 , c100=0 , c50=0;
			System.out.println("거스름돈 ");
		
			
			c1000 = change / 1000;
			change = change % 1000;
			if( c1000 > 0 )    //거스름돈이 1000원짜리가 있는 경우만 출력
				System.out.println("1000원 " + c1000 + "장 ");

			c500 = change / 500;
			change = change % 500;
			if( c500 > 0 ) 	System.out.println("500원 " + c500 + "개 ");

			c100 = change / 100;
			change = change % 100;
			if( c100 > 0 )	System.out.println("100원 " + c100 + "개 ");   

			c50 = change / 50;
			change = change % 50;
			if( c50 > 0 )	System.out.println("50원 " + c50 + "개 ");

			System.out.println(" 나온다");
			
		}
		
	}

}
