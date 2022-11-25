package com.hanul.variable;

public class Ex01_variable 
{
	public static void main(String[] args) 
	{
//		System.out.println(75);
//		System.out.println(0b1001011);
//		System.out.println(0113);
//		System.out.println(0x4b);
		
		int num;		//선언은 : 데이터타입, 변수명 -> int num;
		num=10;			//초기화 : 초기값을 넣어주는 것 
		
		int num1 = 15;	//선언과 초기화를 동시에 할 수 있음
		int num2 = 21, num3 = 22, num4 = 24; 		//변수를 한 번에 여러개 선언 할 수 있음
		 
		char ch = 'A';
		 
		 num3 = 30;		//변수를 바꿔주면 바뀐 값으로 출력 됨
		 num4 = 40;
		 
		 System.out.println(num+num1);
		 System.out.println(num2+num3);
		 System.out.println(ch);
		 System.out.println(num3-num4);
		 //byte(1byte->8bit) : -128~127
		 //short(2byte->16bit) : -32768~32757
		 //int(4byte) : -214748368 ~ 2147483647
		 //long(8byte) : -92233720326854775808 - 92233720326854775807
		
	}

}
	
	