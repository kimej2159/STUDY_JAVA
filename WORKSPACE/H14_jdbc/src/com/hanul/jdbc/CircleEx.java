package com.hanul.jdbc;


public class CircleEx {
	
	public static void main(String[] args) {
		
		Circle cir1 = new Circle(5);
		
		int ra1 = cir1.getradius();
		
		double area1 = cir1.getarea();

		System.out.println("반지름 =  " + ra1);
		System.out.printf("원의 넓이 = "+ area1);
	}
	
	
	
	
	
}
