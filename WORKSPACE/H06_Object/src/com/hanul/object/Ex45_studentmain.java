package com.hanul.object;

public class Ex45_studentmain
{
	public static void main(String[] args)
	{
		Ex44_student hong = new Ex44_student("홍길동");
		Ex44_student sim = new Ex44_student("심청이", "010-1111-1111 ");
		Ex44_student jeun = new Ex44_student("전우치", "010-1111-2222 ");
	    
		printstudent(hong);
		printstudent(sim);
		printstudent(jeun);
	}
	
	static void printstudent(Ex44_student student) {
		System.out.println(student.id +", " + student.name + ", " + student.phoneNo);
	}
}
