package com.hanul.object;

public class Ex31_piggydbankmain 
{
	public static void main(String[] args)
	{
		Ex30_piggybank pb = new Ex30_piggybank();			// 객체(인스턴스) 만들기, 메모리에 올라감,   
		
		pb.owner = "홍길동";
		pb.total = 0;
		
		int total = pb.inputmoney(10000);
		printbank(pb.owner, pb.total);

		total = pb.outputmoney(5000);
		printbank(pb.owner, total);
	
	//	pb.inputmoney(10000);
		
		//심청이의 돼지저금통을 만들고 그 저금통에 20000원을 저금하여 8000원을 빼보세요
		Ex30_piggybank pb1 = new Ex30_piggybank();
		
		pb1.owner = "심청이";
		pb1.total = 0;
		
		total = pb1.inputmoney(20000);
		printbank(pb1.owner, pb1.total);
		
		total = pb1.outputmoney(8000);
		printbank(pb1.owner, total);
		
	}
	
	static void printbank(String owner, int total)
	{
		System.out.printf("%s의 저금통의 잔액은 %d이다.\n", owner, total);
	}
	
	
}




























