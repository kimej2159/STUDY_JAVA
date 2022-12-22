package miniproject;

public class No3_carculator {
	
	static int printadd(int no1, int no2)
	{
		int sum1 = no1 + no2;
		System.out.printf("덧셈 : %d + %d = %d\n" , no1, no2, sum1);	
		return sum1;
	}
	 
	static int printsub(int no1, int no2)
	{
		int  sum2 = no1 - no2;	
		System.out.printf("뺄셈 :  %d - %d = %d\n" ,no1, no2, sum2);
		return sum2;
	}
	
	static int printmulti(int no1, int no2)
	{
		int sum3 = no1*no2;
		System.out.printf("곱셈 :  %d * %d = %d\n" , no1, no2, sum3);
		return sum3;
	}
	
	static int printdiv(int no1, int no2)
	{
		int sum4 = no1/no2;	
		System.out.printf("나눗셈 : %d / %d = %d\n" ,no1, no2, sum4);
		return sum4;
	}

}
