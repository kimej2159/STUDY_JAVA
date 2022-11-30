package com.hanul.method;

public class Ex24_method01{
	
		// 메소드란 클래스가 가지고 있는 데이터(변수, 필드)를 어떻게 처리할 것인지에 대한 기능적 부분
		// 클래스의 구성 요소는 필드, 매소드, 새성자 이다.
	public static void main(String[] args) {
		
		// 점근 제한자 : public, protected, default, private => 여기서는 "public", 접근 제한이 없다, 같은 프로젝트 내라면 아무데서나 호출 가능하다
		// 지정 예약어 : static
		// 리턴 타입 : void => 넘겨주는게 없다
		//			: int => int형을 넘겨준다 / string => string형을 넘겨준다.
		// 어떤 타입이든 넘길 수 있고 넘겨 받는 곳에서는 반드시 같은 타입으로 받아야 한다.
		//메소드명 (매개 변수, 파라미터) : main 매소드는 문자열 배열 타입의 매개 변수를 갖는 형태로 정해져 있지만
		//								일반적인 매소드는 매개변수가 있을 수도 없을 수도 있다
		//기본적인 매소드의 정의는
		// 리턴타입 + 매소드명(매개변수) : {.....}
		
		
		
		printcharacter();
		System.out.println("helloworld!!!");
		printcharacter();
		
		printcharpara('#');
		System.out.println("hello hanul");
		printcharpara('$');
		
		printrcharparacnt('&', 15);
		System.out.println("hello hanul !!!");
		printrcharparacnt('@', 10);
		
		printrcharparacnt( 15, '&');
		System.out.println("hello hanul !!!");
		printrcharparacnt('@', 10);
		
	}
	
	//문자를 출력하는 메소드를 만든다 / 만든 메소드를 메인에서 사용한다 / 메소드는 항상 소문자로 시작해야한다!!!!!
	static void printcharacter()
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.printf("*");
		}
		System.out.println();
		
	}
	static void printcharpara(char ch)
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.print(ch);
		}
		System.out.println();
		
	}
	static void printrcharparacnt(char ch, int cnt)
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static void printrcharparacnt( int cnt, char ch)			//main안에서는 void...() 안의 변수 타입대로 순서를 맞춰서 입력해야 함
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
		
}
	

