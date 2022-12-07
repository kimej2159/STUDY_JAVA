package com.hanul.pack;

import com.hanul.geometry.Ex47_crlcle;

public class Ex48_crlclemain

{	public static void main(String[] args)
	{

	// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
	
	// 반지름이 15 인 원의 객체 생성
	// 그 객체의 원의 넓이를 구해서
	// 반지름과 원의 넓이를 출력하시오
	Ex47_crlcle cir1 = new Ex47_crlcle(-15);
	// cir1에 대한 반지름 접근
	int ra1 = cir1.getradius();
	// cir1에 대한 원의 넓이
	double area1 = cir1.getarea();
	// cir1에 대한 원의 둘레
	double round1 = cir1.getround();
	
	System.out.println(ra1 + "," + area1);				
			
	// 반지름이 3 인 원의 객체 생성
	// 그 객체의 원의 넓이를 구해서
	// 반지름과 원의 넓이, 원의 둘레를 출력하시오
	Ex47_crlcle cir2 = new Ex47_crlcle(3);
	// cir2에 대한 반지름 접근
	int ra2 = cir2.getradius();
	// cir2에 대한 원의 넓이
	double area2 = cir2.getarea();
	// cir2에 대한 원의 둘레
	double round2 = cir2.getround();
	
	System.out.println(ra2 + "," + area2  + "," + round2);
	
	}
}
