package com.hanul.object;

public class Ex37_creater01main 
{
	public static void main(String[] args)
	{
		Ex36_creater01 hong = new Ex36_creater01("홍길동", 5000);
		Ex36_creater01 sim = new Ex36_creater01("심청이",10000);
		Ex36_creater01 jeun = new Ex36_creater01();
		jeun.owner = "전우치";
		jeun.total = 3000;

		
		System.out.printf("%s님 계좌의 잔액은 %d원 입니다.\n", hong.owner, hong.total);
		System.out.printf("%s님 계좌의 잔액은 %d원 입니다.\n",sim.owner, sim.total);
		System.out.printf("%s님 계좌의 잔액은 %d원 입니다.\n", jeun.owner, jeun.total);
	}

}
