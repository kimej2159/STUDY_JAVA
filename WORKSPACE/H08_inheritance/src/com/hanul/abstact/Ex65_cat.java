package com.hanul.abstact;

public class Ex65_cat extends Ex63_abstact
{
	

	public Ex65_cat(String kind)
	{
		super(kind);
		this.kind = kind;
	}
	
	void soundcat() { 
		System.out.println(kind + "는 야옹 운다.");
	}
	
}
