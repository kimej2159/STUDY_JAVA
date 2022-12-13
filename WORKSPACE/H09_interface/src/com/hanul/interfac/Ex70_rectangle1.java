package com.hanul.interfac;

public class Ex70_rectangle1 extends Ex68_shape1 implements Ishape
{
	int length;
	
	
	public Ex70_rectangle1(int height , int width)
	{
		super(height);
		this.length = width;
	}
	
	

	@Override
	public void getarea() {
		System.out.printf("높이 %d 밑변 %d인 사각형의 넓이는 %.2f 이다\n", 
				height, length, 
				+  Math.sqrt((length*height)));
	}
	
	
	@Override
	public void getaround()
	{
		System.out.printf("높이 %d 밑변 %d인 사각형의 둘레는 %.2f 이다\n", 
				height, length,  Math.sqrt((2*(length+height))));
	}
	

	
}
