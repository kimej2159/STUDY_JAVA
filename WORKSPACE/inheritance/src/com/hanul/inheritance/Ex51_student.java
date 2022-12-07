package com.hanul.inheritance;

public class Ex51_student extends Ex53_peopel{

	//학번 이름 나이
	// 먹는다, 잠을 잔다, 학교에 간다
	
	
	String studentno;
	
	
	
	public Ex51_student(String name, int age, String studentno) {
		super(name, age);
		this.studentno = studentno;
	}



	void gotoschool() { 
		System.out.println(name + "은(는) 학교간다.");
	}
}
