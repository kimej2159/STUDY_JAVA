package com.hanul.object;

public class Ex40_crlcle
{
	//원 클래스 
	// 반지름 데이터, 넓이를 구하는 기능, 원읠 둘레를 구하는 기능
	//
	private int radius;
		
	
	

	
	// 생성자 만들기
	
	public Ex40_crlcle(int radius) 
	{
		this.radius = radius;
	}
	
	// 원의 반지름을 가져올수 있는 메소드 생성
	int getradius( ) {
		return this.radius;
	}
	
	// 원의 반지름을 셋팅할 수 있는 메소드 생성
	void setradius(int radius) {
		this.radius=radius;
	}
	
	// 원의 넓이 : pi*r*r
	double getarea()
	{
		return 3.14*radius*radius;
	}

	//원의 둘레 : 2*pi*r
	double getround()
	{
		return 2*3.14*radius;
	}
	
}


























