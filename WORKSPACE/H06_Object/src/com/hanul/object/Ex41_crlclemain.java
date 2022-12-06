package com.hanul.object;

public class Ex41_crlclemain
{
	public static void main(String[] args) 
	{

			// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
			
			// 반지름이 15 인 원의 객체 생성
			// 그 객체의 원의 넓이를 구해서
			// 반지름과 원의 넓이를 출력하시오
			Ex40_crlcle cir1 = new Ex40_crlcle(15);
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
			Ex40_crlcle cir2 = new Ex40_crlcle(3);
			// cir2에 대한 반지름 접근
			int ra2 = cir2.getradius();
			// cir2에 대한 원의 넓이
			double area2 = cir2.getarea();
			// cir2에 대한 원의 둘레
			double round2 = cir2.getround();
			
			System.out.println(ra2 + "," + area2  + "," + round2);
			
			// // cir2에 대한 원의 반지름을 재설정
			cir2.setradius(8);
			ra2 = cir2.getradius();
			// cir2에 대한 원의 넓이
			area2 = cir2.getarea();
			// cir2에 대한 원의 둘레
			round2 = cir2.getround();
			
			System.out.println(ra2 + "," + area2  + "," + round2);	
		
		
		
		
		
		
		
		
		
		
		
//		Ex40_crlcle crl1 = new Ex40_crlcle(3);
//		
//		double radius1 = crl1.getradius();
//		double round1 = crl1.getround();
//		double area1 = crl1.getarea();
//		
//		System.out.println("원의 반지름 : " + crl1.getradius());
//		System.out.println("원의 둘레 : " + crl1.getround());
//		System.out.println("원의 넓이 : " + crl1.getarea());
//		
//		Ex40_crlcle crl2 = new Ex40_crlcle(15);
//		double radius2 = crl2.getradius();
//		double round2 = crl2.getround();
//		double area2 = crl2.getarea();
//		
//		System.out.println("원의 반지름 : " + crl2.getradius());
//		System.out.println("원의 둘레 : " + crl2.getround());
//		System.out.println("원의 넓이 : " + crl2.getarea());
//
//		
		
	}
}
