package com.hanul.object;

public class Ex35_accountmain
{
	public static void main(String[] args)
	{
		// 메인이 있는 클래스를 만들어서 
		// 홍길동씨의 은행계좌 객체를 생성해서 예금주, 계좌번호, 잔액을 출력하고
		//  5만원을 입금한 후 예금주, 계좌번호, 잔액을 출력하고
		//  3만원을 출금한 후 예금주, 계좌번호, 잔액을 출력하시오.
		//			  (은행계좌번호는 임의로 지정한다)
		
		
		Ex34_account hong = new Ex34_account("홍길동", 0, "356-1040-7200-53 / 농협은행" );
		
//		hong.owner = "홍길동";
//		hong.sum = 0;
//		hong.acnum = "356-1040-7200-53 / 농협은행";
		
		hong.plusmoney(50000);
		System.out.printf("예금주 %s의 %S 계좌 잔액은 %d원이다.\n", hong.owner, hong.acnum, hong.sum);   
		
		hong.minusmoney(30000);
		System.out.printf("예금주 %s의 %S 계좌 잔액은 %d원이다.\n", hong.owner, hong.acnum, hong.sum);   
		
		Ex34_account sim = new Ex34_account("심청이", "356-1040-7200-54 / 농협은행" );
		System.out.printf("예금주 %s의 %S 계좌 잔액은 %d원이다.\n", sim.owner, sim.acnum, sim.sum);
		
		Ex34_account jeun = new Ex34_account("전우치", 50000, "356-1040-7200-55 / 농협은행" );
		System.out.printf("예금주 %s의 %S 계좌 잔액은 %d원이다.\n", jeun.owner, jeun.acnum, jeun.sum);

		
	}
	
	
}
