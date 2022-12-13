package com.hanul.interfac;

public interface Ishape
{
	// 1.선언은 class가 아니라 interface로 시작한다
	// 2.추상 메소드와 상수 필드만 선언할 수 있다 
	//		public abstract를 명시하지 않아도 컴파일러가 자동으로 지정한다
	// 3.생성자를 가질 수 없고 인터페이스 역시 추상임을 알 수 있다
	// 4.선언된 메소드는 무조건 반드시 오버라이드 해야한다(강제, 무조건), 그리고 public으로 선언한다
	// 5.서브 클래스, 자식 클래스는 implements를 이용하여 인터페이스를 구현한다
	//		class 클래스명 implements 인터페이스명 
	// 6.클래스는 인터페이스를 다중구현할 수 있다
	// 		class 클래스명 implements 인터페이스명1, 인터페이스명2
	// 7. 서브 클래스가 클래스 상속과 인터페이스를 동시에 구현하고자 할 때는 상속 먼저 지정한다
	//  class 클래스명 extends  수퍼클래스명 implement 인터페이스명 
	// 8.인터페이스는 인터페이스를 다중상속할 수 있다
	//		interface 인터페이스명 extends 인터페이스명1, 인터페이스명2
	
	
	
	public void getarea();
	public void getaround();
	
	
}
