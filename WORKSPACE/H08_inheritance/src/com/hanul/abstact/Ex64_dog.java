package com.hanul.abstact;

public class Ex64_dog extends Ex63_abstact
{

	
	
	public Ex64_dog(String kind)
	{
		super(kind);
		this.kind = kind;
		
	}
	
	
	
	@Override
	void dowhat() {
		System.out.println(kind + "는 멍멍 짖는다.");
	}
	
}
