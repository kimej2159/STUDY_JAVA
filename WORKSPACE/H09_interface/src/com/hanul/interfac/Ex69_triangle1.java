package com.hanul.interfac;

public  class Ex69_triangle1 extends Ex68_shape1 implements Ishape
{
	int width;
	
	
	public Ex69_triangle1(int height , int width)
	{
		super(height);
		this.width = width;
	}
	
	

	@Override
	public void getarea() {
		System.out.printf("높이 %d 밑변 %d인 직각 삼각형의 넓이는 %.2f 이다\n", 
				height, width, (width + height) 
				+ (double)Math.sqrt(width*width + height * height));
	}
	
	
	@Override
	public void getaround()
	{
		System.out.printf("높이 %d 밑변 %d인 직각 삼각형의 둘레는 %.2f 이다\n", 
				height, width, Math.sqrt(width*height/(double)2));
	}
}
