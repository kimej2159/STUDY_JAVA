package com.hanul.object;

public class Ex30_piggybank
{
	//클래스 : 변수(필드, 멤버변수), 메소드, 생성자(나중에)
	// 돼지저금통의 특징은 주인이 누구인가, 그 안에 들어있는 총액이 얼마인가 
	//행위는 돈을 넣는다, 돈을 뺀다 => 메소드
	//데이터 : 타입, 변수
	//주인 : string		owner
	//총액 : int			total
	//행위 : 리턴타입 		매소드 이름 
	//돈을 넣는다 :int		inputmomey(int money)
	//돈을 뺀다	:int	outputmoney(int money)
	
	// default값은 같은 패키지 내에 있는 클래스에서 접근 가능하다
	// default 값이란 밑에처럼 메인안에 쓰지 않고 선언한 변수 등이다
	String owner;
	int total;
	
	int inputmoney(int money)
	{
		total += money;
		return total;
	}
	
	int outputmoney(int money)
	{
		total -= money;
		return total;
	}
	
	
}




















