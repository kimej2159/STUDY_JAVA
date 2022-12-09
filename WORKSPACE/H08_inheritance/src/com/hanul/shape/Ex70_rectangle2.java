package com.hanul.shape;

public class Ex70_rectangle2 extends Ex68_shape2
{
	
	double high;
	double lengh;
	
	Ex70_rectangle2(double lengh, double high)
	{
		super(high, lengh);
		this.high = high;
		this.lengh = lengh;
	}

	void area() {
		// TODO Auto-generated method stub
		System.out.printf("높이 %.2f 밑변 %.2f인 직각 삼각형의 넓이는 %.2f이다\n", 
				high, lengh,  high*lengh/(double)2);
	}
	

	
}
