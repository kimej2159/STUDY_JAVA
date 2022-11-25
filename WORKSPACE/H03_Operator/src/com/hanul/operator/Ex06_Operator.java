package com.hanul.operator;

import java.util.Scanner;

public class Ex06_Operator
{
	public static void main(String[] args)
	{
		int no1 =5;
		System.out.println(no1);
		
		String x1 = "안녕하세요";
		System.out.println(x1);
		
		char x2 = '봄';
		System.out.println(x2);
		
		int no2 = no1 + 10;
		System.out.println(no2);
		
		int no3 = no2 = no1;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		 
		//산술연산자 : +, -, *, /(나누기 : 몫), %(나누기 : 나머지)
		no2 = 7; no3 = 2;
		System.out.println(no2 + no3);
		System.out.println(no2 - no3);
		System.out.println(no2 * no3);
		System.out.println(no2 / no3);
		System.out.println(no2 % no3);
		
		
		double no4 = 2.0;
		no4 = no2 / no4;
		System.out.println(no4);
		
		//사칙연산의 순서를 인위적으로 지정하려면 괄호를 사용한다
		no1 = 7/2+3;
		System.out.println(no1);
		
		no1 = 7/(2+3);
		System.out.println(no1);
		
		int no5 = (int)(100+200L);
		System.out.println(no5);
		
		byte no6 =2, no7 = 3, no8;
		no8 =(byte)(no6 + no7);
		System.out.println();
		
		
		//부호 연산자 : +, - 
		no1 = -no1;		// = -1 * no1
		no6 = (byte)+no6;		// = 1 * no6
	
		//증감 연산자 : ++, --
		//++변수 : 먼저 변수에 1을 더한 후 사용한다.
		//변수++ : 변수가 사용된 후에 1을 더한다.
		//--변수 : 먼저 변수에서 1을 뺀 후 사용한다.
		//변수-- : 변수가 사용된 후에 1을 뺀다.
		
		int su = 5, result;
		result = ++su;
		System.out.println("result = " + result + ", su : " + su);
		result = su++;
		System.out.println("result = " + result + ", su : " + su);
		result = --su;
		System.out.println("result = " + result + ", su : " + su);
		result = su--;
		System.out.println("result = " + result + ", su : " + su);

	
		int a = 1, b= 3, sum;
		sum = a + ++b;
		System.out.printf("a:%d, b:%d, sum:%d\n", + a, b, sum);
		
		double no9 = 123.012456;
		System.out.printf("%8.2f,  %-8.2f, %.3f\n", no9, no9 ,no9);  // -: 좌측정렬, +: 우측정렬, 
	
	
		//관계 (비교) 연산자 : <, >, <=, >=, ==(같다), !=(같지 않다)
		//boolean로 강제캐스팅되어 true, false값으로 나타난다
		System.out.println("10 > 5 ? " + (10 >5));
		boolean isResult = 10 <= 5;
		System.out.println("10 > 5 ? " + isResult);
		isResult = (10 != 5);
		System.out.println("10 != 5 ? " + isResult);
		
		//논리 연산자 : &&(and 논리곱), ||(or 논리곱), !(not)
		//&& : 연산자 좌, 우가 모두 참(true)이어야 참(true) 나머지는 거짓
		//|| : 연산자 좌, 우 중 하나만 참(true)이면 참(true) 양쪽 모두 거짓일 때 거짓(false)
		
		System.out.println(10>5 && 20>5);		//T*T => T
		System.out.println(10>5 && 20<5);		//T*F => F
		System.out.println(10<5 && 20>5);		//F*T => F
		System.out.println(10<5 && 20<5);		//F*F => F
		
		System.out.println(10>5 || 20>5);		//T*T => T
		System.out.println(10>5 || 20<5);		//T*F => T
		System.out.println(10<5 || 20>5);		//F*T => T
		System.out.println(10<5 || 20<5);		//F*F => F
		
		int num1 = 5, num2= 2, num3 = 5, num4 = 10;
		System.out.println((num1==num2 || num1==num3) && !(num3>num4));
		System.out.println((num1==num2 || num1==num3) && (num3>num4));
	
		//복합 대입 연산자 : +=, -=, *=, /=, %=
		// a = a + b => a += b
		// a = a - b => a -=b
		// a = a * b => a *=b
		// a = a / b => a /=b
		// a = a % b => a %=b
		
		int num10 = 29;
		num10 -= 2 + 3 * 4; // num = num - (2+3*4)
		System.out.println(num10);
		
		//삼항 연산자(조건 연산자) : a ? b:c
		int num11 = 10;
		System.out.println("\"num11 == 10 \"는 " + (num11 == 10 ? true:false));
		System.out.println("\"num11 == 10 \"는 " + (num11 >= 10 ? true:false));
		System.out.println("\"num11 == 10 \"는 " + (num11 > 10 ? "10보다 큼": num11 == 10 ? "10과 같음" : num11 < 10 ? "10보다 작음 " : "끝"));
		

		//짝수와 홀수 출력하기
		int num12 = 13 ;
		System.out.println("num12는 " + (num12%2 == 0 ? "짝수" :"홀수" ));
		
		//성적에 따른 학점 출력하기(90>=a, 80>=b, 70>=c, 그 외 d)
		int num14 = 89;
		System.out.println("학점은 " + (num14 >= 90 ? "A" : num14 >=80 ? "B" : num14 >=70 ? "C" : "D") + "입니다.");
				
		
		
	/*	//입력 받는 class_짝수 홀수 출력
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		
		int score = sc.nextInt();
		System.out.println((score%2 == 0 ?  "짝수":"홀수") + "입니다.");
	*/	
		
		//학점 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		
		int score = sc.nextInt();
		System.out.println("학점은 " + (score >= 90 ? "A" : score >=80 ? "B" : score >=70 ? "C" : "D") + "입니다.");
		
		
	}

}
	

 
