package com.hanul.shape;

public abstract class Ex68_shape2 {
	// 다영성

	double high;
	double lengh;
	
	public Ex68_shape2(double high, double lengh)
	{
		this.high = high;
		this.lengh = lengh;
	}
	
	public void getaround() {
		System.out.println("");
	}
	
	abstract void area();
}
