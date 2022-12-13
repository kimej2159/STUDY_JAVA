package com.hanul.reference;

public class Ex72_string 
{
	public static void main(String[] args)
	{
		//레퍼런스 타입은 new라는 키워드로 객체 생성을 하고 사용
		//하지만 string 타입은 객체 생성 없이 인스턴스화 되었고 마치 프리마티브 타입처럼 사용
		//그 이유는 너무 많이 사용하기 때문에 내부적으로 처리를 해줌
		//string타입은 레퍼런스 타입
		
		String str1 ="안뇽";
		String str2 ="안뇽";
		
		if(str1 == str2)
		{
			System.out.println("같은 인스턴스");
		}
		else
		{
			System.out.println("다른 인스턴스");
		}
		
		String str3 = new String("안녕");		//new때문에 "안녕"을 서로다른 메모리에 저장해, 서로 다른 객체로 인식하여 다르다고 출력한다
		String str4 = new String("안녕");		// 빈칸까지 인식하여 비교하기 때문에 빈칸도 조심해야 함 
		
		if(str3 == str4)
		{
			System.out.println("같은 인스턴스");
		}
		else
		{
			System.out.println("다른 인스턴스");
		}
		
		//내용 비교
		if(str3.equals(str4.trim()))				//string을 비교할때는 ==이 아니라 equals를 사용하여 비교해야함 
		{											// trim() -> 좌우 공백을 없애준다 / 안에 빈칸은 없어지지 않음
			System.out.println("같은 내용");
		}
		else
		{
			System.out.println("다른 내용");
		}
		
		if(str1.equals(str4))				//string을 비교할때는 ==이 아니라 equals를 사용하여 비교해야함 
		{
			System.out.println("같은 내용");
		}
		else
		{
			System.out.println("다른 내용");
		}
		
		str1 += "여러분";
		if(str1 == str2)				 
		{
			System.out.println("같은 인스턴스");
		}
		else
		{
			System.out.println("다른 인스턴스");
		}
		
	}

}
