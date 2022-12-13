package com.hanul.interfac;

public class Ex71_shapemain2
{
	public static void main(String[] args) 
	{
//		Ex68_shape1 sh = new Ex68_shape1(10)    // Ex68_shape1에 abstract를 쓰면 객체를 만들 수 없음, 그래서 안만들어짐
//		Ishape ish = new Ishape();
		
		Ex69_triangle1 tri = new Ex69_triangle1(10,15);
		tri.getarea();
		tri.getaround();
		
		Ex70_rectangle1 rect = new Ex70_rectangle1(10,15);
		rect.getarea();
		rect.getaround();
			
	}
}

