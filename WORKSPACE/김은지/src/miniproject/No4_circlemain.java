package miniproject;

import java.util.Scanner;

public class No4_circlemain {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.printf("원의 반지름을 입력하세요 : ");
	int no1 = sc.nextInt();
		
	No4_circle cir1 = new No4_circle(no1);
	
	int ra1 = cir1.getradius();
	
	double area1 = cir1.getarea();

	System.out.println("반지름 =  " + ra1);
	System.out.printf("원의 넓이 = "+ area1);
	}

	
}
