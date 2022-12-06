package com.hanul.object;

public class Ex39_membermain
{
	public static void main(String[] args) 
	{
		
	Ex38_member sim = new Ex38_member
					("심청이", "CHUG", "0002", "010-0000-0000", 16);
//	printmember(sim.name, sim.identi, sim.password, sim.phonenum, sim.age);
	printmember(sim);
	
	Ex38_member hong = new Ex38_member("홍길동", "HONGS", "0001");	
//	printmember(hong.name, hong.identi, hong.password, hong.phonenum, hong.age);
	printmember(hong);
	
	}
	
	static void printmember(Ex38_member member)
	{ 
		System.out.println("이름 :  " + member.name);
		System.out.println("아이디 : " + member.identi);
		System.out.println("패스워드 : " + member.password);
		System.out.println("전화번호 : " + member.phonenum);
		System.out.println("나이 : " + member.age);
		System.out.println("-------------------------------\n");
		
	}

}
