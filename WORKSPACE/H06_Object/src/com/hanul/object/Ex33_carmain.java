package com.hanul.object;

public class Ex33_carmain
{
	public static void main(String[] args)
	{
		Ex32_car kim = new Ex32_car("김현식", "QM3", 0 );	
		
		
//		kim.owner = "김현식";
//		kim.modelname = "QM3";
//		kim.speed = 0;
		
		
		kim.start();
		kim.stepaeccel();
		System.out.println(kim.speed);
		kim.stepaeccel();
		System.out.println(kim.speed);
		kim.stepaeccel();
		System.out.println(kim.speed);
		kim.stepaeccel();
		System.out.println(kim.speed);
		

		kim.stepbreak();
		System.out.println(kim.speed);
		kim.stepbreak();
		System.out.println(kim.speed);
		kim.stepbreak();
		System.out.println(kim.speed);
		kim.stepbreak();
		System.out.println(kim.speed);
		
		kim.stop();
		
		
		
		
	}
}
