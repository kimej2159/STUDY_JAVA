package com.hanul.object;

public class Ex43_accumulatormain
{
	public static void main(String[] args)
	{
		Ex42_accumulator acc1 = new Ex42_accumulator();
		Ex42_accumulator acc2 = new Ex42_accumulator();
		acc1.accumulator(10);
		acc2.accumulator(5);
		
		System.out.println("acc1total : " + acc1.total 
			+	"\nacc1total : "+ acc2.total
			+	"\nacc1grandtotal : " + acc1.grandtotal
			+	"\nacc2grandtotal : " + acc2.grandtotal
			+	"\ngrandtotal : "+ Ex42_accumulator.grandtotal);
		
	}

}
