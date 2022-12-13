package com.hanul.animal;

public class dog extends animal implements Ianimal
{
	//개 : 먹는다 잠을 잔다 잠을잔다 땅위를 달린다

	
	public dog(String kind)
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
		System.out.println(kind + "가 달린다");
	}
	
	
}
