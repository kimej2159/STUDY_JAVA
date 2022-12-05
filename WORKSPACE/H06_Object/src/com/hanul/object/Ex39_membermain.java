package com.hanul.object;

public class Ex39_membermain
{
	public static void main(String[] args) 
	{
		Ex38_member hong = new Ex38_member("홍길동", "HONGS", "0001");
		System.out.printf("%s님의 아이디는 %s, 패스워드는 %s 입니다.", hong.name, hong.identi, hong.password);
		

	}
}
