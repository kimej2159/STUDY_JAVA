package com.hanul.abstact;

public class Ex63_abstact
{
	String kind;
	
	
	public Ex63_abstact(String kind)
	{
		this.kind = kind;
	}
	
	public void eat() 
	{
		System.out.println(kind + "는 먹는다.");
	}
	public void sleep() { 
		System.out.println(kind + "는 잠잔다.");
	}
	

	void sounddog() { 
		System.out.println(kind + "멍멍 짖는다.");
	}
	
	void soundcat() { 
		System.out.println(kind + "야옹 운다.");
	}
	
	void soundchicken() { 
		System.out.println(kind + "꼬끼오하고 운다");
	}

	void dowhat() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
