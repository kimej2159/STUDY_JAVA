package com.hanul.object;

public class Ex34_account
{
	

	// 필드: 계좌번호, 예금주, 잔액
	// 메소드: 예금한다 메소드, 출금한다 메소드
	// 예금한다: 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드로 선언
	// 출금한다: 출금요청한 금액만큼 잔액을 감소시키고 
	//			출금한 금액을 리턴하는 메소드로 선언
	
	String owner;
	int sum;
	String acnum;
	
	

	// 생성자
	public Ex34_account() {}
	
	// 1. 심청이는 잔액이 0원인 통장을 개설했습니다
		public Ex34_account(String owner, String acnum) {
		super();
		this.owner = owner;
		this.acnum = acnum;
	}
	
	// 2. 전우치는 잔액이 50000원인 통장을 개설했다 
	public Ex34_account(String owner, int sum, String acnum) {
		super();
		this.owner = owner;
		this.sum = sum;
		this.acnum = acnum;
	}
	
	void plusmoney(int put)
	{
		sum += put;
		
	}
	


	

	int minusmoney(int out)
	{
		if(out > sum)	// 잔액보다 출금액이 많으면  return 0;
		{
			return 0;
		}
		sum -= out;
		return out;
	}
}
