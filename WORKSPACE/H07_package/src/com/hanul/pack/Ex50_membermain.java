package com.hanul.pack;

import com.hanul.geometry.Ex49_member;

public class Ex50_membermain
{
	public static void main(String[] args) 
	{
		
	Ex49_member sim = new Ex49_member
					("심청이", "CHUG", "0002", "010-0000-0000", 16);
//	printmember(sim.name, sim.identi, sim.password, sim.phonenum, sim.age);
	printmember(sim);
	
	Ex49_member hong = new Ex49_member("홍길동", "HONGS", "0001");	
//	printmember(hong.name, hong.identi, hong.password, hong.phonenum, hong.age);
	printmember(hong);
	
	hong.changephonenum("010-2222-2222");
	hong.changepassoword("jk14545");
	hong.changeage(25);
	}
	
	static void printmember(Ex49_member member)
	{ 
		System.out.println("이름 :  " + member.name);
		System.out.println("아이디 : " + member.identi);
		System.out.println("패스워드 : " + member.password);
		System.out.println("전화번호 : " + member.phonenum);
		System.out.println("나이 : " + member.age);
		System.out.println("-------------------------------\n");
		
	}

}
