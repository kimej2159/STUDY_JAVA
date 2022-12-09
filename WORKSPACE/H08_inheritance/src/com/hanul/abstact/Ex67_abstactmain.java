package com.hanul.abstact;

public class Ex67_abstactmain
{
	public static void main(String[] args)
	{
		Ex64_dog dog = new Ex64_dog("바둑이");
		 dog.eat();
		 dog.sleep();
		 dog.dowhat();
		 
		 Ex65_cat cat = new Ex65_cat("야옹이");
		 cat.eat();
		 cat.sleep();
		 cat.dowhat();
		 
		 Ex66_chicken chicken = new Ex66_chicken("꼬꼬");
		 chicken.eat();
		 chicken.sleep();
		 chicken.dowhat();
	}
}
