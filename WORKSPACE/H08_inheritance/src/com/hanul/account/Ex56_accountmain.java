package com.hanul.account;

public class Ex56_accountmain {

	public static void main(String[] args) {
		// 메인이 있는 클래스를 만들어서 
		// 홍길동씨의 은행계좌 객체를 생성해서 예금주, 계좌번호, 잔액을 출력하고
		//  5만원을 입금한 후 예금주, 계좌번호, 잔액을 출력하고
		//  3만원을 출금한 후 예금주, 계좌번호, 잔액을 출력하시오.
		// (은행계좌번호는 임의로 지정한다)
		
		Ex55_account hong = new Ex55_account();
		hong.owner = "홍길동";
		hong.accountNo = "33-33-33";
		hong.balance = 0;
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				hong.owner, hong.accountNo, hong.balance);
		hong.deposite(50000);
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				hong.owner, hong.accountNo, hong.balance);
		try {
			hong.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				hong.owner, hong.accountNo, hong.balance);
		try {
			hong.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				hong.owner, hong.accountNo, hong.balance);
		
		// 1. 심청은 돈을 가지고 가지 않고 통장을 개설했다 - 생성자 잔돈이 없는것
		Ex55_account sim = new Ex55_account("11-22-33", "심청");
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				sim.owner, sim.accountNo, sim.balance);
		
		// 2. 전우치는 돈 5만원을 내고 통장개설을 했다 - 생성자가 모두 받아야함
		Ex55_account jeun = new Ex55_account("12-23-33", "전우치", 50000);
		System.out.printf("%s의 계좌 %s 잔액은 %d 입니다 \n", 
				jeun.owner, jeun.accountNo, jeun.balance);
		
		
	}
	
	 

	
	
}
