package com.hanul.inheritance;

public class Ex54_peoplemain
{	
	public static void main(String[] args) 
	{
//		Ex53_peopel people = new Ex53_peopel("사람", 25);
//		people.eat();
//		people.sleep();
//		
		Ex51_student hong = new Ex51_student("홍길동", 18, "20220001");
		hong.eat();
		hong.sleep();
		hong.go();
		
//		Ex53_peopel jeun = new Ex53_peopel("전우치", 29);
//		jeun.eat();
//		jeun.sleep();
//		jeun.gotowork();
//		
		
		Ex52_worker jeun  = new Ex52_worker("전우치", 29, "20220002");
		jeun.eat();
		jeun.sleep();
		jeun.go();
		
		
	} 

}
