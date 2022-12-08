package com.hanul.animal;

public class Ex61_bird extends Ex59_animal {
	
	
	public Ex61_bird(String kind)
	{
		super(kind);
		
	}
	
	@Override
	void dowhat() {
		System.out.println(kind + "가 난다");
	}
	
	

}
