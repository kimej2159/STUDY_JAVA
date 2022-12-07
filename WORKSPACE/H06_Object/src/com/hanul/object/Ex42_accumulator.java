package com.hanul.object;

public class Ex42_accumulator
{
	int total;
	static int grandtotal;
	
	void accumulator( int amount ) {
		total += amount;
		grandtotal += amount;
	}

}
