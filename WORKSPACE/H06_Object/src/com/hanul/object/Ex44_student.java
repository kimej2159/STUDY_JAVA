package com.hanul.object;

public class Ex44_student 
{
	// 학생 정보 관리 클래스 : 학번이 자동으로 부여되는 학생 정보를 관리 
	static int seqid = 220000;	// 학번 부여 변수 
	int id; // 학생에게 부여된 학번
	String name, phoneNo;
	
	
	public Ex44_student(String name)
	{
		this.id = ++seqid;
		this.name = name;		
	}
	
	public Ex44_student(String name, String phoneNo)
	{
		// this(name);
		this.id = ++seqid;
		this.name = name;
		this.phoneNo = phoneNo;
	}

}
