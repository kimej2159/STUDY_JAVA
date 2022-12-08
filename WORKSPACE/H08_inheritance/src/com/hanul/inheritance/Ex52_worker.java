package com.hanul.inheritance;

public class Ex52_worker extends Ex53_peopel{

	String workno;
	
	
	
	public Ex52_worker(String name, int age, String workno) {
		super(name, age);
		this.workno = workno;
	}



	void gotowork() { 
		System.out.println(name + "은(는) 출근한다.");
	}

}
