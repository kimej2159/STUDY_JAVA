package com.hanul.account;

public class Ex57_checkcardaccount extends Ex55_account //<-- super로 상속할 때 중복되는 부분을 삭제함
{
	
//	String accountNo, owner;    // super로 상속할 때 중복되는 부분을 삭제함
//	int balance;
	String cardNo;  // 계좌번호와 연결된 체크카드 번호
	
	// 생성자 
//	public Ex57_checkcardaccount() {	}
//	
//	public Ex57_checkcardaccount(String accountNo, String owner)
//	{		
//		this.accountNo = accountNo;
//		this.owner = owner;		
//	}
//	
//	public Ex57_checkcardaccount(String accountNo, String owner, int balance)
//	{		
//		this(accountNo, owner);
//		this.balance = balance;
//	}
//	
	// 체크카드 추가
	public Ex57_checkcardaccount(String accountNo, String owner, String cardNo)
	{	
		
		super(accountNo, owner);
		this.cardNo = cardNo;
	}
	
	public Ex57_checkcardaccount(String accountNo, String owner, int balance, String cardNo)
	{		
		super(accountNo, owner, balance);
		this.cardNo = cardNo;
	}
	
	//입급하는 메소드,  super로 상속할 때 중복되는 부분을 삭제함
//	void deposite(int amount)
//	{
//		balance += amount; 
//	}
//	
	// 만약 잔액보다 출금액이 많으면 예외처리 retun 0;
//	int withdraw(int amount) throws Exception
//	{
//		if(balance < amount)
//		{
//			throw new Exception("잔액이 부족합니다!!!");
//		}
//		balance -= amount;
//		return amount;
//	}
	
	// 체크카드로 출금하기
	int pay(String cardNo, int amount) throws Exception
	{
		
		// cd기에 넣은 카드와 계좌에서 발급된 체크카드가 일치하는지
		if(!cardNo.equals(this.cardNo))
		{
			throw new Exception("카드가 일치하지 않습니다 !!!");
		}
		
		
//		// 카드가 일치하고 잔액이 출금액보다 많으면 출금 , super로 상속할 때 중복되는 부분을 삭제함
//		if(balance < amount)
//		{
//			throw new Exception("잔액이 부족합니다!!!");
//		}
//		
//		balance -= amount;
//		return amount;		
//		
		// 카드가 일치하고 잔액이 출금액보다 많으면 출금
		return withdraw(amount);
		
		
	}

}
