package com.hanul.shape;

public class Ex71_shapemain2
{
	public static void main(String[] args) 
	{
		// 추상 클래스 (1)
//		Ex69_triangle1 tri1 =  new Ex69_triangle1(10, 3.3);			
//		tri1.area();
//		
//		Ex70_rectangle1 rec1 = new Ex70_rectangle1(10,5);
//		rec1.area();
//		
		
		// 추상 클래스 (2) 사각형
		Ex68_shape2 rec1 = new Ex70_rectangle2(6,5);		
		rec1.area();

		
		//다형성 /(2) 사각형	
		Ex70_rectangle2 rec2 = null;
		
		if(rec1  instanceof Ex70_rectangle2)		// instanceof : rec1의 개채인가? 같으면 메소드 area에 접근 가능 
		{
			rec2 = (Ex70_rectangle2)rec1;
		}
		rec2.area();
		
		
		// 추상 클래스 (2) 삼각형
		Ex68_shape2 tri1 = new Ex69_triangle2(6,5);
		tri1.area();
		
		
		//다형성 /(2) 삼각형
		Ex69_triangle2 tri2 = null;
		
		if(tri1 instanceof Ex69_triangle2)
		{
			tri2 = (Ex69_triangle2)tri1;
		}
		tri2.area();
			
			
		
			
			
	}
}

