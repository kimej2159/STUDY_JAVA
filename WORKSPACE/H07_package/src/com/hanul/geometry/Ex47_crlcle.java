package com.hanul.geometry;

public class Ex47_crlcle 
{

	//원 클래스 
	// 반지름 데이터, 넓이를 구하는 기능, 원읠 둘레를 구하는 기능
	//
	private int radius;
		
	
	// 생성자 만들기
	
	public Ex47_crlcle(int radius) 
	{
		this.radius = radius;
	}
	
	// 원의 반지름을 가져올수 있는 메소드 생성
	public int getradius( ) {
		return this.radius;
	}

	// 원의 반지름을 셋팅할 수 있는 메소드 생성(예외처리)
	 void getradius(int radius) throws Exception{
		if (radius < 0 ) { 
			throw new Exception("생성자 : 길이가 0 보다 커야 됩니다");
		}
		this.radius=radius;
	}
	

	
	// 원의 반지름을 셋팅할 수 있는 메소드 생성(예외처리)
	void setradius(int radius) throws Exception{
		if (radius < 0 ) { 
			throw new Exception("생성자 : 길이가 0 보다 커야 됩니다");
		}
		this.radius=radius;
	}
	
	
	
	// 원의 넓이 : pi*r*r
	public double getarea()
	{
		return 3.14*radius*radius;
	}

	//원의 둘레 : 2*pi*r
	public double getround()
	{
		return 2*3.14*radius;
	}
	
}
