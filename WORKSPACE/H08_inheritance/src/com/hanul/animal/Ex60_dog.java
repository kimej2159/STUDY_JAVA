package com.hanul.animal;

public class Ex60_dog extends Ex59_animal
{
	//개 : 먹는다 잠을 잔다 잠을잔다 땅위를 달린다

	
	public Ex60_dog(String kind)
	{
		super(kind);
		
		
	}
	
	@Override
	void dowhat() {
		System.out.println(kind + "가 달린다");
	}
	
	
}
