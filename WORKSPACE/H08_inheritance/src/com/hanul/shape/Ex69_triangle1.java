package com.hanul.shape;

public class Ex69_triangle1 extends Ex68_shape1
{
	double high;
	double lengh;
	
	public Ex69_triangle1(double high, double lengh)
	{
		super(high, lengh);
		this.high = high;
		this.lengh = lengh;
	}
	

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 넓이 : " + high*lengh/2);
	}
	
	
	
}
