package com.hanul.abstact;

public class Ex66_chicken extends Ex67_abstact
{
	String kind;
	
	public Ex66_chicken(String kind)
	{
		super(kind);
		this.kind = kind;
	}
	
	
	@Override
	void dowhat() {
		System.out.println(kind + "는 꼬끼오하고 운다");
	}
	
}
