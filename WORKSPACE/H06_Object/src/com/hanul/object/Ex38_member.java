package com.hanul.object;

public class Ex38_member
{
	// 회원의 이름, 아이디, 패스워드, 폰번호, 나이
	// 회원 객체를 처음 생성할 때 이름, 아이디, 패스워드는 무조건 입력
	// 나머지 정보는 있으면 입력받을 수있게 생성자를 작성하시오
	// 메소드 :
	// 폰번호 변경, 패스워드 변경, 나이 변경 메소드를 작성하시오
	
	String name;
	String identi;
	String password;
	String phonenum;
	int age;
	
	

	// 생성자
	public Ex38_member(String name, String identi, String password)
	{
		this.name = name;
		this.identi = identi;
		this.password = password;		
	}

	public Ex38_member(String name, String identi, String password, String phonenum)
	{
		this.name = name;
		this.identi = identi;
		this.password = password;
		this.phonenum = phonenum;
		
	}
	

	public Ex38_member(String name, String identi, String password, int age)
	{
		this.name = name;
		this.identi = identi;
		this.password = password;
		this.age = age;
	}

	public Ex38_member(String name, String identi, String password, String phonenum, int age)
	{
		this.name = name;
		this.identi = identi;
		this.password = password;
		this.phonenum = phonenum;
		this.age = age;
	}
	
	
	// 전화번호 변경 
	void changephonenum(String phonenum)
	{
		this.phonenum = phonenum;
	}
	
	// 나이 변경
	void changeage(int age)
	{
		this.age = age;
	}
	
	//패스워드 변경
	void changeage(String password)
	{
		this.password = password;
	}

}
