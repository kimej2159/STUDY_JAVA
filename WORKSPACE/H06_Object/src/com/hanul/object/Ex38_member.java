package com.hanul.object;

public class Ex38_member
{
	// 회원의 이름, 아이디, 패스워드, 폰번호, 나이
	// 회원 객체를 처음 생성할 때 이름, 아이디, 패스워드는 무조건 입력
	// 나머지 정보는 있으면 입력받을 수있게 생성자를 작성하시오
	
	String name;
	String identi;
	String password;
	String phonenum;
	int age;
	
	// 생성자
	public Ex38_member(String name, String identi, String password)
	{
		super();
		this.name = name;
		this.identi = identi;
		this.password = password;		
	}

	public Ex38_member(String name, String identi, String password, String phonenum)
	{
		super();
		this.name = name;
		this.identi = identi;
		this.password = password;
		this.phonenum = phonenum;
		
	}

	public Ex38_member(String name, String identi, String password, String phonenum, int age) {
		super();
		this.name = name;
		this.identi = identi;
		this.password = password;
		this.phonenum = phonenum;
		this.age = age;
	}
	
	
	
	
	

}
