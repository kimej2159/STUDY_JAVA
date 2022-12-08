package com.hanul.inheritance;

public class Ex53_peopel {
	
	//학번 이름 나이
	// 먹는다, 잠을 잔다, 학교에 간다
	
	
	String name;
	int age;
	
	public Ex53_peopel(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	

	public void eat() {
		System.out.println(name + "은(는) 먹는다.");
		
	}
	
	public void sleep() { 
		System.out.println(name + "은(는) 잠잔다.");
	}
	
	void gotowork() { 
		System.out.println(name + "은(는) 출근한다.");
	}

}
