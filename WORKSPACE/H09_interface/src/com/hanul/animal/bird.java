package com.hanul.animal;

public class bird extends animal implements Ianimal
{
	
	
	public bird(String kind)
	{
		super(kind);
		
	}
	
	public void eat()
	{
		System.out.println(kind + "는 먹는다.");
	};
	public void sleep()
	{
		System.out.println(kind + "는 잔다.");
	};
	
	
	
	@Override
	public void dowhat() {
		System.out.println(kind + "가 난다");
	}
	
	

}
